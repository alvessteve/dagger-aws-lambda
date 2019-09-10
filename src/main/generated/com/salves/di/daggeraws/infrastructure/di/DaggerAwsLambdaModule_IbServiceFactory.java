package com.salves.di.daggeraws.infrastructure.di;

import com.salves.di.daggeraws.domain.model.IBService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAwsLambdaModule_IbServiceFactory implements Factory<IBService> {
  private final DaggerAwsLambdaModule module;

  public DaggerAwsLambdaModule_IbServiceFactory(DaggerAwsLambdaModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public IBService get() {
    return Preconditions.checkNotNull(
        module.ibService(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<IBService> create(DaggerAwsLambdaModule module) {
    return new DaggerAwsLambdaModule_IbServiceFactory(module);
  }
}
