package com.salves.di.daggeraws.domain;

import com.salves.di.daggeraws.application.LambdaFacade;
import com.salves.di.daggeraws.domain.model.*;

import javax.inject.Inject;

public class LambdaService implements LambdaFacade {

    private IAggregateService aggregateService;

    @Inject
    public LambdaService(IAggregateService aggregateService) {
        this.aggregateService = aggregateService;
    }

    public LambdaResponse greet(LambdaRequest input) {
        return new LambdaResponse(aggregateService.printABC());
    }
}
