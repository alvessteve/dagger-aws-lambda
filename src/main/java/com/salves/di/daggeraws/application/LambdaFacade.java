package com.salves.di.daggeraws.application;

import com.amazonaws.services.lambda.runtime.Context;

public interface LambdaFacade {

    public String greet(String input, Context context);
}
