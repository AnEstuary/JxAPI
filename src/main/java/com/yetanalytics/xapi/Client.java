package com.yetanalytics.xapi;

/**
 * Created by jason on 10/20/14.
 */

import java.io.IOException;
import java.net.URI;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;


public class Client {

    private URI lrs;
    private String apiKey;
    private String apiSecret;


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
        apiSecret = secret;


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
        apiSecret = secret;


    }

    /**
     * Send the Statement to the LRS
     *
     * @param stmt  Statement encoded as a JSON String
     *
     */
    public HttpResponse<JsonNode> sendStatement(String stmt) {
        HttpResponse<JsonNode> response;
        try {
            response = Unirest.post(lrs.toString())
                    .header("accept", "application/json")
                    .basicAuth(apiKey, apiSecret)
                    .body(stmt)
                    .asJson();

            return response;
        } catch(UnirestException e) {
            e.printStackTrace();
        }

        return null;
    }



}
