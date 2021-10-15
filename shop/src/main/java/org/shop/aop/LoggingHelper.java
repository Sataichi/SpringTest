package org.shop.aop;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

public class LoggingHelper {

    @Autowired
    private Logger logger;

    public void initializerBeforeAdvice(String initName){
        logger.log(Level.INFO, "Start initialization for " + initName);
    }

    public void initializerAfterAdvice(String initName){
        logger.log(Level.INFO, "End initialization for " + initName);
    }

    public void initializerAfterReturnAdvice(){
        logger.log(Level.INFO, "Initialization Successful");
    }
}
