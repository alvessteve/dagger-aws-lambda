package com.salves.di.daggeraws.module;

import com.salves.di.daggeraws.services.IAService;
import com.salves.di.daggeraws.services.IAggregateService;
import com.salves.di.daggeraws.services.IBService;
import com.salves.di.daggeraws.services.implementation.AService;
import com.salves.di.daggeraws.services.implementation.AggregateService;
import com.salves.di.daggeraws.services.implementation.BService;
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
