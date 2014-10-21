package com.yetanalytics.xapi;

/**
 * Created by jason on 10/20/14.
 */

import us.monoid.web.Content;
import us.monoid.web.Resty;

import java.io.IOException;
import java.net.URI;
import static us.monoid.web.Resty.*;

public class Client {

    private URI lrs;
    private String apiKey;
    private char[] apiSecret;

    protected Resty restClient = new Resty();

    // Constructor with a URI
    public Client(URI lrsUri, String key, char[] secret) {

        lrs = lrsUri;
        apiKey = key;
        apiSecret = secret;

        restClient.authenticate(lrs, apiKey, apiSecret);
    }

    //Constructor w/ URI from String
    public Client(String lrsUri, String key, char[] secret) {

        lrs = URI.create(lrsUri);
        apiKey = key;
        apiSecret = secret;

        restClient.authenticate(lrs, apiKey, apiSecret);
    }

    public void sendStatement(String stmt) {
        byte[] stmtBytes = stmt.getBytes();
        Content stmtCon = new Content("application/json", stmtBytes);
        try {
            restClient.json(lrs, put(stmtCon));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
