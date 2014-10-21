package com.yetanalytics.xapi.statement;

import java.util.HashMap;
import java.util.UUID;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import com.nimbusds.langtag.LangTag;


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

    public Result getResult() {
        if(this.result != null) {
            return this.result;
        } else {
            return null;
        }
    }

    public boolean setContext(StatementContext ctx) {
        context = ctx;
        return true;
    }

    public StatementContext getContext() {
        if(this.context != null) {
            return this.context;
        } else {
            return null;
        }
    }

    public class StatementReference {
        protected String objectType = "StatementRef";
        protected UUID id;

        protected StatementReference(UUID srid) {
            id = srid;
        }

        protected StatementReference(String srid) {
            id = UUID.fromString(srid);
        }
    }



    private static final class StatementContext {
        protected UUID registration = UUID.randomUUID();
        protected IActor instructor;
        protected Group team;
        protected String revision;
        protected String platform;
        protected HashMap<LangTag, String> language;

    }

    private static final class Result {

    }
}
