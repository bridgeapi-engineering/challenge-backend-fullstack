package com.perspecteev.challengebackend.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perspecteev.challengebackend.services.BridgeService;

/**
 * MyController.myEndpoint is called when requesting GET /mycontroller/myroute
 * <p>
 * You can try it by running curl -X GET localhost:8080/mycontroller/myroute
 * <p>
 * The BridgeClient has been injected and ready for use. Maybe the controller, method and route need some renaming ?
 */
@RestController
@RequestMapping("/mycontroller")
public class MyController {

    @Autowired
    private BridgeService bridgeService;

    @GetMapping("/myroute")
    public MyResponse myEndpoint() throws IOException {
        bridgeService.doSomething();
        return new MyResponse();
    }

}
