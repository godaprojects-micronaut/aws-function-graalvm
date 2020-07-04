package aws.function.graalvm.bean;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class HelloBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
