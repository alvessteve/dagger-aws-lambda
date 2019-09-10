package com.salves.di.daggeraws.infrastructure.di;

import com.salves.di.daggeraws.domain.model.IAService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAwsLambdaModule_IaServiceFactory implements Factory<IAService> {
  private final DaggerAwsLambdaModule module;

  public DaggerAwsLambdaModule_IaServiceFactory(DaggerAwsLambdaModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public IAService get() {
    return Preconditions.checkNotNull(
        module.iaService(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<IAService> create(DaggerAwsLambdaModule module) {
    return new DaggerAwsLambdaModule_IaServiceFactory(module);
  }
}
