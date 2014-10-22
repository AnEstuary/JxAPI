package com.yetanalytics.xapi.statement;

import java.net.URI;

/**
 * Created by jason on 10/20/14.
 */
public class Group implements IActor, IStatementObject {
    public final String objectType = objectType();
    public String name;
    public Agent[] member;
    public URI mbox;


    public Group(String nm, URI email) {
        name = nm;
        mbox = email;
    }

    public Group(String nm, Agent[] members) {
        name = nm;
        member = members;
    }

    @Override
    public String objectType() {
        return "Group";
    }
}
