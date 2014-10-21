package com.yetanalytics.xapi.statement;

import java.net.URI;

/**
 * Created by jason on 10/21/14.
 */
public class Activity implements IStatementObject {
    public URI id;
    public Definition definition;

    @Override
    public String objectType() {
        return "Activity";
    }

    public Activity(URI iri){
        id = iri;
    }

    public Definition setDefinition(LanguageMap nm, LanguageMap desc) {
        definition = new Definition(nm, desc);
        return definition;
    }

    protected class Definition {
        public LanguageMap name;
        public LanguageMap description;
        public URI type;
        public URI moreInfo;

        public Definition(LanguageMap nm, LanguageMap desc) {
            name = nm;
            description = desc;
        }
    }


}
