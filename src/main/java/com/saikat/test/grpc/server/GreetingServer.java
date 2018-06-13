package com.saikat.test.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GreetingServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("hello, I am the grpc Server");

        Server server = ServerBuilder.forPort(50051)
                .addService(new GreetServiceImpl()) //added our service to the server
                .addService(new SumServiceImpl())  // added the sum service to our server
                .build();

        //starting the server
        server.start();

        //properly handling a shutdown response for the server
        Runtime.getRuntime().addShutdownHook(new Thread( () -> {
            System.out.println("Recieved Shutdown request");
            server.shutdown();
            System.out.println("Successfully shutdown the server");
        } ));

        server.awaitTermination();
    }
}
