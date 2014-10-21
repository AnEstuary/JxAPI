package com.yetanalytics.xapi.statement;

import java.util.HashMap;
import java.util.UUID;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import com.nimbusds.langtag.LangTag;


/**
 * Created by Jason Lewis on 10/20/14.
 * Describes the xAPI Statement object as defined in the xAPI Spec v1.0.2
 * Spec available at https://github.com/adlnet/xAPI-Spec/blob/master/xAPI.md
 */
public class Statement {
    public UUID id;
    public IActor actor;
    public Verb verb;
    public IObject object;
    public Result result;
    public StatementContext context;

    public DateTime timestamp;

    protected String version = "1.0.2";

    /**
     * CTOR for a new Statement with the minimum required elements
     *
     * @param act   An object (i.e., Agent or Group) implementing the IActor interface
     * @param v     A Verb object
     * @param obj   An Object of the Statement implementing the IObject interface
     */
    public Statement(IActor act, Verb v, IObject obj) {
        id = UUID.randomUUID();
        actor = act;
        verb = v;
        object = obj;
        timestamp = DateTime.now(DateTimeZone.UTC);
    }

    /**
     *
     * @param res   A Result object conforming to xAPI spec 4.1.5 Result
     * @return      boolean - true if the Result was successfully added to the Statement
     */
    public boolean setResult(Result res) {
        result = res;
        return true;
    }

    /**
     *
     * @return      The Result object associated with the statement
     */
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
