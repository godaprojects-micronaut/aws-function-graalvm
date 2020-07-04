package aws.function.graalvm.bean.v2;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class HelloBean {
    private String name;
    private String message;

    public HelloBean(String message, String name) {
        super();
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
