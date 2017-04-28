package com.springws.server.repository;

import com.genwebservice.Webservicerequest;
import com.genwebservice.Webservicereresponse;
import com.springws.server.service.WebServService;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 2017.04.20..
 */
@Component
public class WebServiceRepository implements WebServService
    {

        @Override
        public Webservicereresponse getWSdata(Webservicerequest webservicerequest)
            {
                Webservicereresponse webservicereresponse = new Webservicereresponse();
                webservicereresponse.setItemId(webservicerequest.getItemId());
                webservicereresponse.setItemName(webservicerequest.getItemName());
                webservicereresponse.setItemDesc(webservicerequest.getItemDesc());

                SecureRandom random = new SecureRandom();
                webservicereresponse.setToken(new BigInteger(130, random).toString(32));

            return webservicereresponse;
            }





    }
