package com.salves.di.daggeraws.infrastructure.di;

import com.salves.di.daggeraws.model.IAService;
import com.salves.di.daggeraws.model.IAggregateService;
import com.salves.di.daggeraws.model.IBService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAwsLambdaModule_AggregateServiceFactory
    implements Factory<IAggregateService> {
  private final DaggerAwsLambdaModule module;

  private final Provider<IAService> iaServiceProvider;

  private final Provider<IBService> ibServiceProvider;

  public DaggerAwsLambdaModule_AggregateServiceFactory(
      DaggerAwsLambdaModule module,
      Provider<IAService> iaServiceProvider,
      Provider<IBService> ibServiceProvider) {
    assert module != null;
    this.module = module;
    assert iaServiceProvider != null;
    this.iaServiceProvider = iaServiceProvider;
    assert ibServiceProvider != null;
    this.ibServiceProvider = ibServiceProvider;
  }

  @Override
  public IAggregateService get() {
    return Preconditions.checkNotNull(
        module.aggregateService(iaServiceProvider.get(), ibServiceProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<IAggregateService> create(
      DaggerAwsLambdaModule module,
      Provider<IAService> iaServiceProvider,
      Provider<IBService> ibServiceProvider) {
    return new DaggerAwsLambdaModule_AggregateServiceFactory(
        module, iaServiceProvider, ibServiceProvider);
  }
}
