package com.salves.di.daggeraws.infrastructure.di;

import com.amazonaws.services.lambda.runtime.Context;
import com.salves.di.daggeraws.domain.model.*;
import com.salves.di.daggeraws.infrastructure.ApiGatewayResponse;

import java.util.Collections;

public class LambdaDispatcher {

    private final AwsLambdaComponent awsLambdaComponent;

    public LambdaDispatcher() {
        this.awsLambdaComponent = DaggerAwsLambdaComponent.builder().build();
    }

    public ApiGatewayResponse greet(LambdaRequest input, Context context) {
        context.getLogger().log("entering the function");
        LambdaResponse response = awsLambdaComponent.lambdaService().greet(input);
        return new ApiGatewayResponse(response.toString(), false, "200", Collections.emptyMap());
    }
}
