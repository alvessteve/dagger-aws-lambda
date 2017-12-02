package com.salves.di.daggeraws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaService implements RequestHandler<String,String> {

    private final AwsLambdaComponent component;

    public LambdaService() {
        this.component = DaggerAwsLambdaComponent.builder().build();
    }


    @Override
    public String handleRequest(String input, Context context) {
        return component.aggregate().printABC();
    }
}
