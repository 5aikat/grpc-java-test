package com.saikat.test.grpc.client;

import com.saikat.sum.SumMessage;
import com.saikat.sum.SumRequest;
import com.saikat.sum.SumResponse;
import com.saikat.sum.SumServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SumClient {

    public static void main(String[] args) {

        System.out.println("Hi I am the Sum microservice GRPC Client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50051)
                .usePlaintext() //done for disabling SSL in developement , not to be done in Server side
                .build();

        System.out.println("Started the channel....");


        SumServiceGrpc.SumServiceBlockingStub syncSumClient = SumServiceGrpc.newBlockingStub(channel);

        SumMessage sumMessage = SumMessage.newBuilder()
                .setFirstNum(15)
                .setSecondNum(88)
                .build();

        SumRequest sumRequest = SumRequest.newBuilder()
                .setSumMessage(sumMessage)
                .build();


        SumResponse sumResponse =syncSumClient.sum(sumRequest);

        System.out.println("Response from the sum microservice is : " +sumResponse.getResult());

        System.out.println("Shutting down the channel");

        channel.shutdown();

    }
}
