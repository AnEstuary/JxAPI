package com.yetanalytics.xapi.statement;

import com.yetanalytics.xapi.statement.Statement;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.UUID;

/**
 * Created by Jason Lewis on 10/21/14.
 */
class StatementTest extends TestCase {

    @Test
    public void StatementShouldBeBasicallyValid(Statement stmt) {
        assert(stmt != null);
        assert(stmt.id.getClass() == UUID.class);
        assert(stmt.actor != null);
        assert(stmt.verb != null);
        assert(stmt.object != null);
    }

    @Test
    public void ExtraPiecesShouldBeOkay(Statement stmt) {

    }
}
