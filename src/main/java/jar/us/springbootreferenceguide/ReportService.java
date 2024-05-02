package jar.us.springbootreferenceguide;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy(true)
public class ReportService {

    public ReportService() {
        System.out.println("ReportService is being initialized");
    }

    public String generateReport() {
        return "Report generated at " + System.currentTimeMillis();
    }
}