package com.mobiquity.domains.services;

import com.mobiquity.core.client.RestClient;
import com.mobiquity.domains.response.UsersResponse.UsersResponse;

public class UsersServices extends RestClient {

    private final String endpoint;

    public UsersServices() {
        this.endpoint = "/users";
    }

    public UsersResponse[] getUserWithUsername(String username) {
        return getWithQueryParam(endpoint,"username",username).as(UsersResponse[].class);
    }
}