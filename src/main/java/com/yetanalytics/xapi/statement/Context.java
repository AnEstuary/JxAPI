package com.yetanalytics.xapi.statement;

import com.nimbusds.langtag.LangTag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/**
 * Created by jason on 11/26/14.
 */
public class Context {
    public UUID registration;
    public IActor instructor;
    public Group team;
    public String revision;
    public String platform;
    public HashMap<LangTag, String> language;
    public ArrayList<Extension> extensions;

    public class Extension extends HashMap<String, String> {
        String extKey;
        String extValue;

        public Extension(String key, String value) {
            extKey = key;
            extValue = value;
        }
    }

    public void addExtension(Extension ext) {
        extensions.add(ext);
    }

}
