package com.salves.di.daggeraws;

import com.salves.di.daggeraws.module.DaggerAwsLambdaModule;
import com.salves.di.daggeraws.services.IAggregateService;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {DaggerAwsLambdaModule.class})
public interface AwsLambdaComponent {

    IAggregateService aggregate();
}
