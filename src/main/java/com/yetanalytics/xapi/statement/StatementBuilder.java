package com.yetanalytics.xapi.statement;

/**
 * Created by jason on 10/20/14.
 */
public class StatementBuilder {

    public Statement statement;


    public StatementBuilder(IActor ac, Verb ve, StatementObject obj){
        statement = new Statement(ac, ve, obj);
    }

    public Statement getStatement(){
        return statement;
    }
}
