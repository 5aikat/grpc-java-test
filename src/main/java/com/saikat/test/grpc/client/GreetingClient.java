package com.saikat.test.grpc.client;

import com.proto.dummy.DummyServiceGrpc;
import com.saikat.greet.*;
import com.saikat.sum.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.omg.CORBA.TIMEOUT;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class GreetingClient {

    private void run(){
        System.out.println("hi i am a grpc client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50051)
                .usePlaintext() //done for disabling SSL in developement , not to be done in Server side
                .build();

        System.out.println("Started the channel....");

        //calling the Unary  API
       // doUnaryCall(channel);

        //calling Server Streaming API
       // doServerStreamingCall(channel);

        //do Client Streaming API call
        //doClientStreamingCall(channel);

        //bi-directional streaming API call
        doBiDirectionalStreaming(channel);

        System.out.println("Shutting down the channel");

        channel.shutdown();

    }

    public static void main(String[] args) {
        GreetingClient myClient = new GreetingClient();
        myClient.run();
    }

    private void doBiDirectionalStreaming(ManagedChannel channel){
        System.out.println("Trying out the Bi-Directional Streaming API Request.....");
        System.out.println(".............................");

        try{

            //create a asynchronous non-blocking client stub
            GreetServiceGrpc.GreetServiceStub asyncClient = GreetServiceGrpc.newStub(channel);
            System.out.println("Created an asynchronous non-blocking client stub");

            CountDownLatch latch = new CountDownLatch(1);

            StreamObserver<GreetEveryoneRequest> requestStreamObserver = asyncClient.greetEveryone(new StreamObserver<GreetEveryoneResponse>() {
                @Override
                public void onNext(GreetEveryoneResponse value) {
                    //here we are receiving response from the server
                    System.out.println("Server sent a response");
                    System.out.println(value.getResult());
                }

                @Override
                public void onError(Throwable t) {
                    //handle the errors here
                    latch.countDown();
                }

                @Override
                public void onCompleted() {
                    //server is done sending data
                    System.out.println("Server is done sending data");
                    latch.countDown();
                }
            });

            /**
            List<String> names = Arrays.asList("Saikat","Shaky","Ronaldo","Hrithik","Smriti");
            int i = 1;
            for(String name : names){
                System.out.println("Sending request number : " +i);
                requestStreamObserver.onNext(GreetEveryoneRequest.newBuilder()
                    .setGreeting(Greeting.newBuilder()
                        .setFirtName(name)
                        .build())
                    .build());
                System.out.println("Client : "+name);
                i++;
            } **/


            Arrays.asList("Saikat","Shaky","Ronaldo","Hrithik","Smriti").forEach(
                    name -> {
                        System.out.println("Sending : " +name);
                        requestStreamObserver.onNext(GreetEveryoneRequest.newBuilder()
                                .setGreeting(Greeting.newBuilder()
                                        .setFirtName(name)
                                        .build())
                                .build()
                        );
                    });

            requestStreamObserver.onCompleted();
            latch.await(5L,TimeUnit.SECONDS);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private void doClientStreamingCall(ManagedChannel channel){

        try {

            //the CountDownLatch is used to wait for a response from server
            //without the latch the program will simply exit without waiting for a response as
            //the grpc client stub in this case is non-blocking and asynchronous
            CountDownLatch latch = new CountDownLatch(1);

            System.out.println("Trying out the Client Streaming API ....");
            System.out.println("...............................");

            //create an asynchrounous client stub as this is client streaming

            GreetServiceGrpc.GreetServiceStub asyncClient = GreetServiceGrpc.newStub(channel);

            System.out.println("Generated a asynchronous non-blocking client stub");

            StreamObserver<LongGreetRequest> requestObeserver =
                    asyncClient.longGreet(new StreamObserver<LongGreetResponse>() {
                        @Override
                        public void onNext(LongGreetResponse value) {
                            //server has sent something
                            System.out.println("Server has sent an response");
                            System.out.println(value.getResult());
                        }

                        @Override
                        public void onError(Throwable t) {
                            //server has thrown an error

                        }

                        @Override
                        public void onCompleted() {
                            //server is closing down
                            System.out.println("Server is closing streaming");
                            latch.countDown();
                        }
                    });

            System.out.println("Sending first request ......");
            requestObeserver.onNext(LongGreetRequest.newBuilder()
                    .setGreeting(Greeting.newBuilder()
                            .setFirtName("Saikat")
                            .setLastName("Chakrabarti")
                            .build())
                    .build()
            );

            Thread.sleep(2000L);

            System.out.println("Sending Second request ......");
            requestObeserver.onNext(LongGreetRequest.newBuilder()
                    .setGreeting(Greeting.newBuilder()
                            .setFirtName("Shaky")
                            .setLastName("Chakrabarti")
                            .build())
                    .build()
            );

            Thread.sleep(2000L);

            System.out.println("Sending third request ......");
            requestObeserver.onNext(LongGreetRequest.newBuilder()
                    .setGreeting(Greeting.newBuilder()
                            .setFirtName("Ronaldo")
                            .setLastName("Chakrabarti")
                            .build())
                    .build()
            );

            requestObeserver.onCompleted();

            latch.await(3L, TimeUnit.SECONDS);

            System.out.println("Completed Sending all requests");
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    private void doUnaryCall(ManagedChannel channel){
        //DummyServiceGrpc.DummyServiceBlockingStub asyncClient = DummyServiceGrpc.newBlockingStub(channel);

        //created a GreetService Client which is synchronous and blocking
        GreetServiceGrpc.GreetServiceBlockingStub synGreetClient = GreetServiceGrpc.newBlockingStub(channel);

        Greeting greeting = Greeting.newBuilder()
                .setFirtName("Saikat")
                .setLastName("Chakrabarti")
                .build();

        GreetRequest greetRequest = GreetRequest.newBuilder()
                .setGreeting(greeting)
                .build();

        //Uranary API
        //directly calling the greet function in the server through a rpc call
        GreetResponse response = synGreetClient.greet(greetRequest);

        System.out.println("Response from the server : \n" + response.getResult());

        //System.out.println("Created a asynchronous client ...");


        //or client a synchoronous client by calling a futureStub

        //synchronous client
        //DummyServiceGrpc.DummyServiceFutureStub syncClient = DummyServiceGrpc.newFutureStub(channel);
        //do something here

    }

    private void doServerStreamingCall(ManagedChannel channel){

        GreetServiceGrpc.GreetServiceBlockingStub synGreetClient= GreetServiceGrpc.newBlockingStub(channel);

        Greeting greeting = Greeting.newBuilder()
                .setFirtName("Saikat")
                .setLastName("Chakrabarti")
                .build();

        //Server Streaming api with a blocking synchronous socket
        System.out.println("Trying the server streaming API now ........");
        System.out.println(".........................");

        GreetManyTimesRequest greetManyTimesRequest = GreetManyTimesRequest.newBuilder()
                .setGreeting(greeting)
                .build();

        synGreetClient.greetManyTimes(greetManyTimesRequest)
                .forEachRemaining(greetManyTimesResponse -> {
                    System.out.println(greetManyTimesResponse.getResult());
                });

    }
}
