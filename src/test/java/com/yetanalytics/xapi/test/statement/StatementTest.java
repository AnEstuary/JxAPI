package com.yetanalytics.xapi.test.statement;

import com.yetanalytics.xapi.statement.Statement;
import org.junit.Test;

import java.util.UUID;

/**
 * Created by jason on 10/21/14.
 */
public class StatementTest {

    @Test
    public void StatementShouldBeBasicallyValid(Statement stmt) {
        assert(stmt != null);
        assert(stmt.id.getClass() == UUID.class);
        assert(stmt.actor != null);
        assert(stmt.verb != null);
        assert(stmt.object != null);
    }
}
