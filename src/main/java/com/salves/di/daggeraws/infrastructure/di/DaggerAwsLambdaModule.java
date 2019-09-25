package com.salves.di.daggeraws.infrastructure.di;

import com.salves.di.daggeraws.application.LambdaFacade;
import com.salves.di.daggeraws.domain.LambdaService;
import com.salves.di.daggeraws.domain.IAService;
import com.salves.di.daggeraws.domain.IAggregateService;
import com.salves.di.daggeraws.domain.IBService;
import com.salves.di.daggeraws.domain.implementation.*;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class DaggerAwsLambdaModule
{

    @Provides
    @Singleton
    public LambdaFacade lambdaFacade(IAggregateService aggregateService){
        return new LambdaService(aggregateService);
    }

    @Provides
    @Singleton
    public IAggregateService aggregateService(IAService iaService, IBService ibService){
        return new AggregateService(iaService,ibService);
    }

    @Provides
    @Singleton
    public IAService iaService(){
        return new AService();
    }

    @Provides
    @Singleton
    public IBService ibService(){
        return new BService();
    }

}
