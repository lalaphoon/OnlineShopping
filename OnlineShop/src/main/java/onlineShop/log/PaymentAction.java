package onlineShop.log;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentAction {
    @Autowired
    private Logger logger;

    public void pay(BigDecimal payValue) {
        logger.log("pay begin, payValue is " + payValue);
        logger.log("pay end");
    }
}


   // PaymentAction has one dependency - Logger
/*
class PaymentAction {
    private Logger logger;

    public PaymentAction() {
        this.logger = new Logger();
        logger.info("something");
    }
}*/
