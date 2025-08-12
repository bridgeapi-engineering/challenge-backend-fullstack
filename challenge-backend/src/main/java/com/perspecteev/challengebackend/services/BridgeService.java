package com.perspecteev.challengebackend.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;

import com.perspecteev.challengebackend.clients.AuthenticateRequest;
import com.perspecteev.challengebackend.clients.AuthenticateResponse;
import com.perspecteev.challengebackend.clients.BridgeClient;
import com.perspecteev.challengebackend.clients.GetAccountResponse;

/**
 * This service is where the calls to the API should be implemented.
 * The "doSomething" method doesn't actually do anything yet and needs to be modified to fit the exercise's needs.
 */
@Component
public class BridgeService {

    // hardcoded for simplicity
    private static final UUID USER_UUID = UUID.fromString("26dbc9b4-f87d-4758-8b2c-f445affdb8ee");

    @Autowired
    private BridgeClient bridgeClient;

    @Value("${bridge.api.version}")
    private String version;
    @Value("${bridge.api.client-id}")
    private String clientId;
    @Value("${bridge.api.client-secret}")
    private String clientSecret;

    /**
     * This method is "complete" and doesn't need editing, except if you feel some things could be improved (there
     * is no trap)
     */
    private Optional<AuthenticateResponse> authenticateUser(UUID userId) {
        try {
            return Optional.of(bridgeClient.authenticate(version, clientId, clientSecret, new AuthenticateRequest(userId)));
        } catch (RestClientException e) {
            return Optional.empty();
        }
    }

    public GetAccountResponse doSomething() {
        var authorization = authenticateUser(USER_UUID);
        return bridgeClient.getAccounts(version, "Bearer ", "myvalue");
    }

}
