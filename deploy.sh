#!/usr/bin/env sh

rm -rf build/distributions/dagger-aws-lambda-1.0-SNAPSHOT.zip
./gradlew build
sls deploy -v