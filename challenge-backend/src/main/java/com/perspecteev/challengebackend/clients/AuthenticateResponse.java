package com.perspecteev.challengebackend.clients;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthenticateResponse {

    @JsonProperty("access_token")
    public String accessToken;

    @JsonProperty("expires_at")
    public Instant expiresAt;
}
