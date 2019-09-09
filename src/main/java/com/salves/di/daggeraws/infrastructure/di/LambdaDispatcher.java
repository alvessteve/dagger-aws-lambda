package com.salves.di.daggeraws.infrastructure.di;

import com.amazonaws.services.lambda.runtime.Context;
import com.salves.di.daggeraws.application.LambdaFacade;

public class LambdaDispatcher implements LambdaFacade {

    private final AwsLambdaComponent awsLambdaComponent;

    public LambdaDispatcher() {
        this.awsLambdaComponent = DaggerAwsLambdaComponent.builder().build();
    }

    @Override
    public String greet(String input, Context context) {
        return awsLambdaComponent.aggregate().printABC();
    }
}
