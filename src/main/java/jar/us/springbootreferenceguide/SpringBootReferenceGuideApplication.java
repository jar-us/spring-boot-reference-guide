package jar.us.springbootreferenceguide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication  // Annotation to mark this class as a Spring Boot application
public class SpringBootReferenceGuideApplication {

    public static void main(String[] args) {
        // Run the Spring Boot application and get the application context
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootReferenceGuideApplication.class, args);

        // Get the application class from the context
        Class<?> applicationClass = context.getBean(SpringBootReferenceGuideApplication.class).getClass();

        // Get the implementation version of the application
        String implementationVersion = applicationClass.getPackage().getImplementationVersion();

        // Print the application version using System.out.print
        System.out.print("Application Version: " + implementationVersion + "\n");
    }
}