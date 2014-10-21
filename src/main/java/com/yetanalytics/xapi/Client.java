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

    /**
     * CTOR
     *
     * @param lrsUri    The URI of the LRS as a URI
     * @param key       The API key for the LRS as a String
     * @param secret    The API secret for the LRS as char[]
     */
    public Client(URI lrsUri, String key, String secret) {

        lrs = lrsUri;
        apiKey = key;
        apiSecret = secret.toCharArray();

        restClient.authenticate(lrs, apiKey, apiSecret);
    }

    /**
     * CTOR
     *
     * @param lrsUri    The URI of the LRS as a String
     * @param key       The API key for the LRS as a String
     * @param secret    The API secret for the LRS as char[]
     */
    public Client(String lrsUri, String key, String secret) {

        lrs = URI.create(lrsUri);
        apiKey = key;
        apiSecret = secret.toCharArray();

        restClient.authenticate(lrs, apiKey, apiSecret);
    }

    /**
     * Send the Statement to the LRS
     *
     * @param stmt  Statement encoded as a JSON String
     *
     */
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
