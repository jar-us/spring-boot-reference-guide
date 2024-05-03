package jar.us.springbootreferenceguide;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootReferenceGuideApplication implements CommandLineRunner {

    @Autowired
    private GreetingService greetingService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootReferenceGuideApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Greeting Message: " + greetingService.getGreetingMessage());
    }
}
