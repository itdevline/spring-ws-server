package com.springws.server.endpoint;

import com.genwebservice.Webservicerequest;
import com.genwebservice.Webservicereresponse;
import com.springws.server.service.WebServService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by david on 2017.04.19..
 */
@Endpoint
public class WebserviceEndpoint
    {

    @Autowired
    WebServService webServService;

    private static final String NAMESPACE_URI = "http://www.mywebserviceexample.com";


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "webservicerequest")
    @ResponsePayload
    public Webservicereresponse getWebserviceData(@RequestPayload Webservicerequest webservicerequest)
        {
            return webServService.getWSdata(webservicerequest);
        }



    }
