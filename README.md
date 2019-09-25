# dagger-aws-lambda
A short sample of a lambda function returning a simple string using Dagger for dependency injection. 
It can be used as a boilerplate to bootstrap a new AWS lambda function with the java language.

The stack is:
- builder: gradle
- language: java
- deployment framework: serverless framework 

## Installation

NB: you have to unable the "annotation processors" option on your IDE (in that case intellij IDEA)

1. After cloning the repo, you can build by using the default instruction of gradle
```./gradlew build```

2. Deploy to the cloud
``sls deploy -v``



 