package com.yetanalytics.xapi.test.statement;

import com.yetanalytics.xapi.statement.Statement;
import org.junit.Test;

/**
 * Created by jason on 10/21/14.
 */
public class StatementTest {

    @Test
    public void StatementShouldNotBeNull(Statement stmt) {
        assert(stmt != null);
    }
}
