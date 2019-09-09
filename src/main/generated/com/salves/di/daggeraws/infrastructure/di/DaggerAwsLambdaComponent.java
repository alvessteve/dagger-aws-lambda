package com.salves.di.daggeraws.infrastructure.di;

import com.salves.di.daggeraws.model.IAService;
import com.salves.di.daggeraws.model.IAggregateService;
import com.salves.di.daggeraws.model.IBService;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAwsLambdaComponent implements AwsLambdaComponent {
  private Provider<IAService> iaServiceProvider;

  private Provider<IBService> ibServiceProvider;

  private Provider<IAggregateService> aggregateServiceProvider;

  private DaggerAwsLambdaComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AwsLambdaComponent create() {
    return builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.iaServiceProvider =
        DoubleCheck.provider(
            DaggerAwsLambdaModule_IaServiceFactory.create(builder.daggerAwsLambdaModule));

    this.ibServiceProvider =
        DoubleCheck.provider(
            DaggerAwsLambdaModule_IbServiceFactory.create(builder.daggerAwsLambdaModule));

    this.aggregateServiceProvider =
        DoubleCheck.provider(
            DaggerAwsLambdaModule_AggregateServiceFactory.create(
                builder.daggerAwsLambdaModule, iaServiceProvider, ibServiceProvider));
  }

  @Override
  public IAggregateService aggregate() {
    return aggregateServiceProvider.get();
  }

  public static final class Builder {
    private DaggerAwsLambdaModule daggerAwsLambdaModule;

    private Builder() {}

    public AwsLambdaComponent build() {
      if (daggerAwsLambdaModule == null) {
        this.daggerAwsLambdaModule = new DaggerAwsLambdaModule();
      }
      return new DaggerAwsLambdaComponent(this);
    }

    public Builder daggerAwsLambdaModule(DaggerAwsLambdaModule daggerAwsLambdaModule) {
      this.daggerAwsLambdaModule = Preconditions.checkNotNull(daggerAwsLambdaModule);
      return this;
    }
  }
}
