package com.springws.server.service;

import com.genwebservice.Webservicerequest;
import com.genwebservice.Webservicereresponse;
import org.springframework.stereotype.Service;

/**
 * Created by David on 2017.04.24..
 */
@Service
public interface WebServService
    {
    public Webservicereresponse getWSdata(Webservicerequest webservicerequest);
    }
