package com.salves.di.daggeraws.infrastructure.di;

import com.salves.di.daggeraws.model.IAService;
import com.salves.di.daggeraws.model.IAggregateService;
import com.salves.di.daggeraws.model.IBService;
import com.salves.di.daggeraws.model.implementation.*;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class DaggerAwsLambdaModule
{
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
