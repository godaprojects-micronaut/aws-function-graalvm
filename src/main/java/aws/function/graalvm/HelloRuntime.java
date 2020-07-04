package aws.function.graalvm;

import aws.function.graalvm.bean.HelloBean;
import aws.function.graalvm.function.v2.HelloFunction;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import io.micronaut.function.aws.runtime.AbstractMicronautLambdaRuntime;

import java.net.MalformedURLException;

public class HelloRuntime
        extends AbstractMicronautLambdaRuntime<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent, HelloBean, String> {
    public static void main(String[] args) {
        try {
            new HelloRuntime().run(args);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Object createHandler(String... args) {
        return new HelloFunction();
    }
}