package com.github.ahvargas.ip;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@Slf4j
public class IpController {

    @RequestMapping
    String ip() throws UnknownHostException {
        log.info("Ip mapping go");
        return InetAddress.getLocalHost().getHostAddress();
    }
}
