package com.salves.di.daggeraws.application;

import com.salves.di.daggeraws.domain.model.*;

public interface LambdaFacade {

    LambdaResponse greet(LambdaRequest input);
}
