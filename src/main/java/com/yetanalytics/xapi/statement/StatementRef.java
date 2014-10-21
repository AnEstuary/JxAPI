package com.yetanalytics.xapi.statement;

import java.util.UUID;

/**
 * Created by jason on 10/21/14.
 */
public class StatementRef implements IStatementObject {

    public UUID id;

    public StatementRef(UUID uid) {
        id = uid;
    }

    public StatementRef(String uid) {
        id = UUID.fromString(uid);
    }

    @Override
    public String objectType() {
        return "StatementRef";
    }
}
