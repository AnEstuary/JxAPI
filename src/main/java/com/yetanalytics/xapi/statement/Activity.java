package com.yetanalytics.xapi.statement;

import java.net.URI;

/**
 * Created by jason on 10/21/14.
 */
public class Activity implements IObject {

    @Override
    public URI id(String uid) {
        return URI.create(uid);
    }

    @Override
    public URI id(URI uid) {
        return uid;
    }

    @Override
    public String objectType() {
        return "Activity";
    }

    protected final class Definition {

    }


}
