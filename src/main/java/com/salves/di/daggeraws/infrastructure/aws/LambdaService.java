package com.salves.di.daggeraws.infrastructure.aws;

import com.amazonaws.services.lambda.runtime.Context;
import com.salves.di.daggeraws.application.LambdaFacade;
import com.salves.di.daggeraws.model.IAggregateService;

import javax.inject.Inject;

public class LambdaService implements LambdaFacade {

    private IAggregateService aggregateService;

    @Inject
    public LambdaService(IAggregateService aggregateService) {
        this.aggregateService = aggregateService;
    }

    public String greet(String input, Context context) {
        return aggregateService.printABC();
    }
}
