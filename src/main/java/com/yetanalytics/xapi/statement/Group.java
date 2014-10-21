package com.yetanalytics.xapi.statement;

import java.net.URI;

/**
 * Created by jason on 10/20/14.
 */
public class Group implements IActor, IStatementObject {


    @Override
    public String objectType() {
        return "Group";
    }
}
