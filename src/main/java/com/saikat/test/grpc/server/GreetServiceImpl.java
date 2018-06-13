package com.saikat.test.grpc.server;

import com.saikat.greet.*;
import io.grpc.stub.StreamObserver;

public class GreetServiceImpl extends GreetServiceGrpc.GreetServiceImplBase {

    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {

        Greeting greeting = request.getGreeting();
        String firstName = greeting.getFirtName();

        String result = "Hello " +firstName +" Welcome to the world of grpc!!!";

        GreetResponse response = GreetResponse.newBuilder()
                .setResult(result)
                .build();

        //sending response back to the client
        responseObserver.onNext(response);

        //terminate the API call and call onCompleted
        responseObserver.onCompleted();
    }

    //Server Streaming API
    @Override
    public void greetManyTimes(GreetManyTimesRequest request, StreamObserver<GreetManyTimesResponse> responseObserver) {
        try {

            System.out.println("Incoming Server streaming API request");

            String firstName = request.getGreeting().getFirtName();

            for (int i = 1; i <= 20; i++) {
                System.out.println("Sending " + i + " response number");
                String result = "Hi " + firstName + " response number" + i;
                GreetManyTimesResponse response = GreetManyTimesResponse.newBuilder()
                        .setResult(result)
                        .build();

                responseObserver.onNext(response);
                Thread.sleep(2000L);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            responseObserver.onCompleted();
        }
    }

    //Client Streaming API

    @Override
    public StreamObserver<LongGreetRequest> longGreet(StreamObserver<LongGreetResponse> responseObserver) {

        System.out.println("Incoming Client Streaming API request");

        StreamObserver<LongGreetRequest> longGreetRequestStreamObserver =new StreamObserver<LongGreetRequest>(){

            String result = "";
            int i =1;
            @Override
            public void onNext(LongGreetRequest value) {
                //this gets every time the client streams some data
                //if we send response here then the channel will be closed and hence
                //we will send it when the client has completed sending all the packets
                result+="Hello "+value.getGreeting().getFirtName()+ "  "+i+" request ";
                i++;
            }

            @Override
            public void onError(Throwable t) {
                //handle cases when the channel encounters errors while sending incoming streaming
                //data

            }

            @Override
            public void onCompleted() {
                //this is when the client has closed the channel and the steaming is completed
                //here we should send the result
                //here we need to form the response object and use the OnNext() method to send data
                //and then close the response object by calling OnCompleted

                responseObserver.onNext(LongGreetResponse.newBuilder()
                        .setResult(result)
                        .build());
                responseObserver.onCompleted();

            }
        };

        return longGreetRequestStreamObserver;
    }


    //Bi-Directional Streaming API
    @Override
    public StreamObserver<GreetEveryoneRequest> greetEveryone(StreamObserver<GreetEveryoneResponse> responseObserver) {

        System.out.println("Incoming Bi-Directional streaming request API ");
        StreamObserver<GreetEveryoneRequest> requestStreamObserver = new StreamObserver<GreetEveryoneRequest>() {
            @Override
            public void onNext(GreetEveryoneRequest value) {
                //this gets called everytime the client is sending data in the channel
                //we have to handle the data here
                //we can process the data here and send the response
                System.out.println(value.getGreeting().getFirtName());
                String respone = "Server : hey "+value.getGreeting().getFirtName();
                GreetEveryoneResponse greetEveryoneResponse = GreetEveryoneResponse.newBuilder()
                        .setResult(respone)
                        .build();

                responseObserver.onNext(greetEveryoneResponse);
            }

            @Override
            public void onError(Throwable t) {
                //handle errors here

            }

            @Override
            public void onCompleted() {
                //here client has stopped sending any more data
                //we can implement accordingly, for now server will stop data as well
                System.out.println("Client has stopped sending data");
                responseObserver.onCompleted();
            }
        };

        return requestStreamObserver;
    }
}
