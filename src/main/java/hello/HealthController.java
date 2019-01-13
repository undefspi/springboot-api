package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by chris on 09/01/2019.
 */
@RestController
public class HealthController {
    private static final String template = "%s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/health")
    public Health health(@RequestParam(defaultValue="up") String status) {
        return new Health(String.format(template, status));
    }
}
