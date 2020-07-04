package aws.function.graalvm.function.v3;

import aws.function.graalvm.bean.HelloBean;
import aws.function.graalvm.service.HelloService;
import io.micronaut.function.FunctionBean;

import java.util.function.Function;

//@FunctionBean("hello-function")
@FunctionBean("test")
public class HelloFunction implements  Function<HelloBean, String> {
    private HelloService helloService;

    public HelloFunction(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public String apply(HelloBean bean) {
        return helloService.sayHello(bean, "v3 - using java.util.function.Function");
    }
}
