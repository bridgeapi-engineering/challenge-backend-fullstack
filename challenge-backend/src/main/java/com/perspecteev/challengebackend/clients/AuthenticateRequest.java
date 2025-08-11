package com.perspecteev.challengebackend.clients;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AuthenticateRequest(
    @JsonProperty("user_uuid")
    UUID userId
) {}
