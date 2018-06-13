package com.saikat.test.grpc.server;

import com.saikat.sum.SumMessage;
import com.saikat.sum.SumRequest;
import com.saikat.sum.SumResponse;
import com.saikat.sum.SumServiceGrpc;
import io.grpc.stub.StreamObserver;

public class SumServiceImpl extends SumServiceGrpc.SumServiceImplBase {

    @Override
    public void sum(SumRequest request, StreamObserver<SumResponse> responseObserver) {

        SumMessage sumMessage = request.getSumMessage();

        int firstNum = sumMessage.getFirstNum();
        int secondNum = sumMessage.getSecondNum();

        int result = firstNum+secondNum;

        SumResponse sumResponse = SumResponse.newBuilder()
                .setResult(result)
                .build();

        responseObserver.onNext(sumResponse);

        responseObserver.onCompleted();
    }
}
