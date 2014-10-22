package com.yetanalytics.xapi.statement;


public interface IStatementObject {

    /**
     *
     * @return the objectType of the implementing class, either Agent or Group.
     */
    public String objectType();
}