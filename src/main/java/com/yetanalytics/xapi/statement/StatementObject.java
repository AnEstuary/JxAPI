package com.yetanalytics.xapi.statement;

import com.sun.istack.internal.NotNull;

import java.net.URI;

/**
 * Created by jason on 10/21/14.
 */
public class StatementObject implements IObject {

    public URI id;

    @Override
    public String objectType() {
        return "statementObject";
    }

    @Override
    public URI uid(String uid) {
        id = URI.create(uid);
        return id;
    }

    @Override
    public URI uid(URI uid) {
        id = uid;
        return id;
    }
}
