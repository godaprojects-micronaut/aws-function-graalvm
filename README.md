# AWS Function with GraalVM
A sample micronaut application for deployment to AWS Lambda with GraalVM custom runtime

#### Commands
1. Build the package
```
mvn clean package
```
2. run deploy.sh
```
./deploy.sh
```
3. Upload the zip file from the build folder in to AWS lambda
4. Create an API gateway with proxy resource and have AWS lambda be the backend function



## Feature aws-lambda-custom-runtime documentation

- [Micronaut Custom AWS Lambda runtime documentation](https://micronaut-projects.github.io/micronaut-aws/latest/guide/index.html#lambdaCustomRuntimes)

- [https://docs.aws.amazon.com/lambda/latest/dg/runtimes-custom.html](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-custom.html)

## Feature aws-lambda documentation

- [Micronaut AWS Lambda Function documentation](https://micronaut-projects.github.io/micronaut-aws/latest/guide/index.html#lambda)

