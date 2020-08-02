package onlineShop.log;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean(name = "logger")
    public Logger getLogger() {
        return new ServerLogger();
    }

    @Bean(name = "PaymentAction")
    public PaymentAction getPaymentAction() {
        return new PaymentAction();
    }

}
