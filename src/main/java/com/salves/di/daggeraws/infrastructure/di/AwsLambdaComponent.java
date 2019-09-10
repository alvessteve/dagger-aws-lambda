package com.salves.di.daggeraws.infrastructure.di;

import com.salves.di.daggeraws.application.LambdaFacade;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {DaggerAwsLambdaModule.class})
public interface AwsLambdaComponent {

    LambdaFacade lambdaService();
}
