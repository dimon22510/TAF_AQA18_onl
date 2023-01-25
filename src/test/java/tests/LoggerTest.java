package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class LoggerTest {
    Logger logger = LogManager.getLogger();
    Logger loggerFile = LogManager.getLogger("File");


    @Test
    public void loggerTest() {
        logger.trace("Trace Messege...");
        logger.debug("Debug Messege...");
        logger.info("Info Messege...");
        logger.warn("Warn Messege...");
        logger.error("Error Messege...");
        logger.fatal("Fatal Messege...");

        loggerFile.error("Error Messege...");
        loggerFile.fatal("Fatal Messege...");

    }
}
