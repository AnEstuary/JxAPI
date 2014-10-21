package com.yetanalytics.xapi.statement;

import org.json.JSONString;

/**
 * Created by jason on 10/20/14.
 */
public class JSONStatement implements JSONString {
    protected Statement statement;

    public JSONStatement(Statement stmt) {
        statement = stmt;
    }

    @Override
    public String toJSONString() {
        return "";
    }

}
