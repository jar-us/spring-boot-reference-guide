package jar.us.springbootreferenceguide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;
import org.springframework.context.annotation.Bean;
import org.springframework.core.metrics.ApplicationStartup;

@SpringBootApplication
public class SpringBootReferenceGuideApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringBootReferenceGuideApplication.class);
        application.setApplicationStartup(new BufferingApplicationStartup(2048));
        application.run(args);
    }

    @Bean
    @ConditionalOnMissingBean
    public ApplicationStartup applicationStartup() {
        return new BufferingApplicationStartup(2048);
    }
}
