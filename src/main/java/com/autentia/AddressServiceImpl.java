package com.autentia;

import java.net.InetAddress;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by jorgepacheco on 30/5/16.
 */
@Service
@Primary
public class AddressServiceImpl implements AddressService {

    public String getServerAddress() throws Exception {

        final String serverAddress = InetAddress.getLocalHost().getHostAddress();

        return serverAddress;

    }

}
