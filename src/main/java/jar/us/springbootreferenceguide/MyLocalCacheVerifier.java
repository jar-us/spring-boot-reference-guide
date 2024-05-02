package jar.us.springbootreferenceguide;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.LivenessState;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyLocalCacheVerifier {

    private final ApplicationEventPublisher eventPublisher;

    public MyLocalCacheVerifier(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void checkLocalCache() {
        try {
            if (cacheIsBroken()) {
                throw new RuntimeException("Cache is completely broken");
            }
        } catch (RuntimeException ex) {
            AvailabilityChangeEvent.publish(this.eventPublisher, this, LivenessState.BROKEN);
        }
    }

    private boolean cacheIsBroken() {
        // Simulated check for the cache health
        return true; // Assume the cache is broken for demonstration
    }
}
