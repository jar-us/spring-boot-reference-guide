package jar.us.springbootreferenceguide;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyReadinessStateExporter {

    @EventListener
    public void onStateChange(AvailabilityChangeEvent<ReadinessState> event) {
        switch (event.getState()) {
            case ACCEPTING_TRAFFIC:
                System.out.println("Application is now ready and accepting traffic");
                break;
            case REFUSING_TRAFFIC:
                System.out.println("Application is not ready and refusing traffic");
                break;
        }
    }
}