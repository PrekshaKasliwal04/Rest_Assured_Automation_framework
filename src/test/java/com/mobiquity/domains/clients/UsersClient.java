package com.mobiquity.domains.clients;

import com.mobiquity.domains.response.UsersResponse.UsersResponse;
import com.mobiquity.domains.services.UsersServices;
import org.apache.log4j.Logger;

public class UsersClient {

    private final UsersServices usersServices;
    private final Logger logger = Logger.getLogger(UsersClient.class);

    public UsersClient() {
        usersServices = new UsersServices();
    }

    public UsersResponse getUserWithUsername(String username) {
        logger.info("Getting a user with username = " + username);
        return usersServices.getUserWithUsername(username)[0];
    }
}
