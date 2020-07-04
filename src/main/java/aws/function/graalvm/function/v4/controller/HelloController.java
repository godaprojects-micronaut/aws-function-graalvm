package aws.function.graalvm.function.v4.controller;

import aws.function.graalvm.bean.v2.HelloBean;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class HelloController {
    @Get("/hello/{name}")
    public HelloBean sayHello(String name){
        HelloBean helloBean = new HelloBean("Hello ", name);
        return helloBean;
    }
}
