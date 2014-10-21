package com.yetanalytics.xapi.statement;

import com.sun.istack.internal.NotNull;

import java.net.URI;

/**
 * Created by jason on 10/20/14.
 */
public class Agent implements IActor, IStatementObject {

    public String name;
    public URI mbox;

    public Agent(URI email) {
        mbox = email;
    }

    public Agent(@NotNull String email) {
        mbox = URI.create(email);
    }

    public Agent(URI email, String nm) {
        mbox = email;
        name = nm;
    }

    public Agent(@NotNull String email, String nm) {
        mbox = URI.create(email);
        name = nm;
    }


    @Override
    public String objectType() {
        return "Agent";
    }
}
