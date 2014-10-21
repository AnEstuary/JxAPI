package com.yetanalytics.xapi.statement;

import java.util.UUID;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;


/**
 * Created by jason on 10/20/14.
 */
public class Statement {
    public UUID id;
    public IActor actor;
    public Verb verb;
    public StatementObject object;
    public Result result;
    public StatementContext context;

    public DateTime timestamp;

    protected String version = "1.0.2";

    public Statement(IActor act, Verb v, StatementObject obj) {
        id = UUID.randomUUID();
        actor = act;
        verb = v;
        object = obj;
        timestamp = DateTime.now(DateTimeZone.UTC);
    }

    public boolean setResult(Result res) {
        result = res;
        return true;
    }

    public boolean setContext(StatementContext ctx) {
        context = ctx;
        return true;
    }



}
