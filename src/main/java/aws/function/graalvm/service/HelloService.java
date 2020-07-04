package aws.function.graalvm.service;

import aws.function.graalvm.bean.HelloBean;

import javax.inject.Singleton;

@Singleton
public class HelloService {
    public String sayHello(HelloBean bean, String version) {
        return String.format("Hello %s (%s)", bean.getName(), version);
    }
}
