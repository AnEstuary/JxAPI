package com.yetanalytics.xapi.statement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class StatementTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }


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

    @Test
    public void testSetSubStatement() throws Exception {

    }

    @Test
    public void testSetResult() throws Exception {

    }

    @Test
    public void testGetResult() throws Exception {

    }

    @Test
    public void testSetContext() throws Exception {

    }

    @Test
    public void testGetContext() throws Exception {

    }
}