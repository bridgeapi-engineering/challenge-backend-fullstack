package com.perspecteev.challengebackend.clients;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetAccountResponse {

    @JsonProperty("resources")
    public List<Account> accounts;
}
