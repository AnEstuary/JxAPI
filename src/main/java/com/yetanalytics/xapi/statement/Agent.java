package com.yetanalytics.xapi.statement;

import com.sun.istack.internal.NotNull;

import java.net.URI;

/**
 * Created by jason on 10/20/14.
 */
public class Agent implements IActor, IStatementObject {

    public String name;
    public URI mbox;
    protected final String objectType = objectType();
    protected Account account;

    public Agent(URI email) {
        mbox = email;
    }

    public Agent(@NotNull String email) {
        mbox = URI.create(email);
    }

    public Agent(URI email, String nm) {
        mbox = email;
        name = nm;
    }

    public Agent(@NotNull String email, String nm) {
        mbox = URI.create(email);
        name = nm;
    }

    public Agent(Account acct, String nm) {
        account = acct;
        name = nm;
    }

    public Account setAccountInfo(URI hp, String nm) {
        return new Account(hp, nm);
    }


    @Override
    public String objectType() {
        return "Agent";
    }

    private class Account {
        public URI homePage;
        public String name;

        public Account(URI hp, String nm) {
            homePage = hp;
            name = nm;
        }
    }
}
