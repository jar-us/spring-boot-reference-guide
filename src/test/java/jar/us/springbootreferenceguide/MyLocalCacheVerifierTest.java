package jar.us.springbootreferenceguide;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationEventPublisher;

import static org.mockito.ArgumentMatchers.any;

@Disabled
@SpringBootTest
public class MyLocalCacheVerifierTest {

    @Autowired
    private MyLocalCacheVerifier verifier;

    @MockBean
    private ApplicationEventPublisher eventPublisher;

    @Test
    public void whenCacheIsBroken_publishBrokenEvent() {
        verifier.checkLocalCache();

        Mockito.verify(eventPublisher).publishEvent(any(AvailabilityChangeEvent.class));
    }
}
