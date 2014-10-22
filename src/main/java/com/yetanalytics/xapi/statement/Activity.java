package com.yetanalytics.xapi.statement;

import java.net.URI;

/**
 * Created by jason on 10/21/14.
 */
public class Activity implements IStatementObject {
    public URI id;
    protected Definition definition;

    @Override
    public String objectType() {
        return "Activity";
    }

    /**
     * Create a new Activity from a URI id
     * @param iri   A URI referencing the Activity description.
     */
    public Activity(URI iri){
        id = iri;
    }

    /**
     * Set the Activity Definition
     * @param nm    The definition "name" param
     * @param desc  The definition "description" param
     * @return      New Definition for the Activity
     */
    public Definition setDefinition(LanguageMap nm, LanguageMap desc) {
        definition = new Definition(nm, desc);
        return definition;
    }

    /**
     * The Activity Definition
     */
    protected class Definition {
        public LanguageMap name;
        public LanguageMap description;
        public URI type;
        public URI moreInfo;

        /**
         * CTOR
         * Create the Definition for the Activity
         *
         * @param nm    The definition "name" param
         * @param desc  The definition "description" param
         */
        public Definition(LanguageMap nm, LanguageMap desc) {
            name = nm;
            description = desc;
        }
    }


}
