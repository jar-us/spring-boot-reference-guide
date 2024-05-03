package jar.us.springbootreferenceguide;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootReferenceGuideApplication {

    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
        return () -> 42; // Returns 42 as the exit code
    }

    public static void main(String[] args) {
        int exitCode = SpringApplication.exit(SpringApplication.run(SpringBootReferenceGuideApplication.class, args));
        System.exit(exitCode); // Uses the exit code from the generator
    }

}
