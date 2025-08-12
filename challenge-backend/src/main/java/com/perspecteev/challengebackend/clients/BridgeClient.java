package com.perspecteev.challengebackend.clients;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;

public interface BridgeClient {

    @PostExchange("/v3/aggregation/authorization/token")
    AuthenticateResponse authenticate(@RequestHeader("Bridge-Version") String version,
                                      @RequestHeader("Client-Id") String clientId,
                                      @RequestHeader("Client-Secret") String clientSecret,
                                      @RequestBody AuthenticateRequest body);

    @GetExchange("/v3/changeme")
    GetAccountResponse getAccounts(@RequestHeader("Bridge-Version") String version,
                                   @RequestHeader("Authorization") String authorization,
                                   @RequestParam("param") String param);
}
