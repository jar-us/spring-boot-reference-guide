package jar.us.springbootreferenceguide;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.availability.ApplicationAvailability;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.context.ApplicationEventPublisher;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MyReadinessStateExporterTest {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @Autowired
    private ApplicationAvailability availability;

    @SpyBean
    private MyReadinessStateExporter myReadinessStateExporter;

    @Test
    public void testReadinessStateChange() {
        // Change the readiness state to REFUSING_TRAFFIC
        AvailabilityChangeEvent.publish(eventPublisher, this, ReadinessState.REFUSING_TRAFFIC);

        // Verify that the readiness state has changed
        assertEquals(ReadinessState.REFUSING_TRAFFIC, availability.getReadinessState());
    }
}