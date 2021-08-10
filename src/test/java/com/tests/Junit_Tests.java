package com.tests;

import io.qameta.allure.Description;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import com.mobiquity.domains.clients.UsersClient;

import static org.junit.jupiter.api.Assertions.*;

@Tag("Sanity")
@DisplayName("Junit Test Cases for JsonPlaceholder")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(Listener.class)
public class Junit_Tests {

    private final UsersClient usersClient;
    private final String name;
    private final Logger logger;


    public Junit_Tests() {
        usersClient = new UsersClient();
        logger = Logger.getLogger(Junit_Tests.class);
        name = "Delphine";
    }

    @Test
    @Tag("GET")
    @DisplayName("GET User with Username")
    @Description("GET User with Username = Delphine and see its existence")
    public void getUser() {
        assertNotNull(usersClient.getUserWithUsername(name));
        logger.info("GET User with Username: SUCCESS");
    }
}