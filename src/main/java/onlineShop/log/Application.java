package onlineShop.log;
import java.math.BigDecimal;
import org.springframework.context.annotation.*;

import org.springframework.context.ApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        PaymentAction paymentAction = (PaymentAction) context.getBean("PaymentAction");
        paymentAction.pay(new BigDecimal(2));
    }
}
