package org.rakhi.study;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.trace("Entering application.");
        logger.debug("Order is processed.");
        logger.info("Order shipped successfully.");
        logger.warn("Customer address was not in standard format.");
        logger.error("Failed to process order!");
        logger.fatal("System crashed. Shutting down...");
    }
}