package aws.function.graalvm.function.v1;

import aws.function.graalvm.bean.HelloBean;
import aws.function.graalvm.service.HelloService;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.function.executor.FunctionInitializer;

import javax.inject.Inject;

@Introspected
public class HelloFunction extends FunctionInitializer {
    @Inject
    private HelloService helloService;

    public String sayHello(HelloBean bean){
        return helloService.sayHello(bean,"v1 - using FunctionInitializer");
    }
}
