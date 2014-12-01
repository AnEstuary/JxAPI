package com.yetanalytics.xapi.statement;

import com.nimbusds.langtag.LangTag;

import java.net.URI;
import java.util.HashMap;
import java.util.UUID;

/**
 * Created by jason on 11/26/14.
 */
public class StatementContext {
    public UUID registration;
    public IActor instructor;
    public Group team;
    public String revision;
    public String platform;
    public HashMap<LangTag, String> language;
    public HashMap<URI, Extension> extensions = new HashMap<>();

    public StatementContext(){}




    public void addExtension(URI id, Extension ext) {
        extensions.put(id, ext);
    }

    public void addExtension(String id, Extension ext) {
        extensions.put(URI.create(id), ext);
    }

    public void addExtension(String id, String extKey, String extVal) {
        Extension ext = new Extension(extKey, extVal);
        extensions.put(URI.create(id), ext);
    }

    public void addExtension(String id, String extKey, Integer extVal) {
        Extension ext = new Extension(extKey, extVal);
        extensions.put(URI.create(id), ext);
    }

}
