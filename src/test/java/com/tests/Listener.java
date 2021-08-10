package com.tests;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.extension.TestWatcher;
import org.junit.jupiter.api.extension.ExtensionContext;
import java.util.Optional;

public class Listener implements TestWatcher {

    private final Logger LOGGER = Logger.getLogger(Listener.class);

    @Override
    public void testDisabled(ExtensionContext extensionContext, Optional<String> optional){
    }

    @Override
    public void testSuccessful(ExtensionContext extensionContext) {
        LOGGER.info("Test has been successful");
    }

    @Override
    public void testAborted(ExtensionContext extensionContext, Throwable throwable){
    }

    @Override
    public void testFailed(ExtensionContext extensionContext, Throwable throwable){
        LOGGER.error("Test case has failed");
    }
}
