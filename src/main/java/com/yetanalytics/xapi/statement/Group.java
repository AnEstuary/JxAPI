package com.yetanalytics.xapi.statement;

import java.net.URI;

/**
 * Created by jason on 10/20/14.
 */
public class Group implements IActor, IStatementObject {
    protected final String objectType = objectType();
    public String name;
    public Agent[] member;
    public URI mbox;

    /**
     * Constructor for Group object
     *
     * @param nm        Param name, name of the group
     * @param email     Email (mbox) URI identifier for Group
     */
    public Group(String nm, URI email) {
        name = nm;
        mbox = email;
        //objectType = objectType();
    }

    /**
     * Constructor for Group object
     *
     * @param nm        Param name, name of the group
     * @param members   Array of Agent objects, members of the Group
     */
    public Group(String nm, Agent[] members) {
        name = nm;
        member = members;
        //objectType = objectType();
    }

    /**
     * Return objectType as required by IStatementObject and xAPI Spec
     * @return  Returns "Group" as objectType
     */
    @Override
    public String objectType() {
        return "Group";
    }
}
