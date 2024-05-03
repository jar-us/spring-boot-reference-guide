package jar.us.springbootreferenceguide;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    @Value("${greeting.message}")
    private String greetingMessage;

    public String getGreetingMessage() {
        return greetingMessage;
    }
}
