package com.yetanalytics.xapi.statement;

import java.util.HashMap;

/**
 * Created by jason on 11/29/14.
 */

public class Extension extends HashMap<String, Object> {

    public Extension(String key, String value) {
        this.put(key, value);
    }

    public Extension(String key, Integer value) { this.put(key, value); }

    public Extension(String key, Object value) {
        this.put(key, value);
    }
}