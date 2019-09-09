package com.salves.di.daggeraws.model.implementation;

import com.salves.di.daggeraws.model.IAService;
import com.salves.di.daggeraws.model.IAggregateService;
import com.salves.di.daggeraws.model.IBService;

import javax.inject.Inject;

public class AggregateService implements IAggregateService {

    private IAService iaService;
    private IBService ibService;

    @Inject
    public AggregateService(IAService iaService, IBService ibService) {
        this.iaService = iaService;
        this.ibService = ibService;
    }

    @Override
    public String printABC() {
        return iaService.printA() + ibService.printB() + "C";
    }
}
