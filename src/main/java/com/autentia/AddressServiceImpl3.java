package com.autentia;

import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by jorgepacheco on 30/5/16.
 */
@Service
public class AddressServiceImpl3 implements AddressService {

    public String getServerAddress() throws Exception {

        final String serverAddress = "AddressServiceImpl3 "+InetAddress.getLocalHost().getHostAddress();

        return serverAddress;

    }

}
