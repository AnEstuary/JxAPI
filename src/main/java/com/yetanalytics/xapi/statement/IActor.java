package com.yetanalytics.xapi.statement;

public interface IActor {

    /**
     *
     * @return The object type of the implementing class, either 'Agent' or 'Group'
     */
    public String objectType();

}