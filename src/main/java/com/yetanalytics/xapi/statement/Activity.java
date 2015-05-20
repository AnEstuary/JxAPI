package com.yetanalytics.xapi.statement;

import java.net.URI;

/**
 * Created by jason on 10/21/14.
 */
public class Activity implements IStatementObject {
    public URI id;
    public Definition definition;
    public Extension extensions;
    protected final String objectType = objectType();

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

    public Activity(String iri) {
        id = URI.create(iri);
    }

    /**
     * Add Extensions
     * @param key    key for the Extension
     * @param value  value for Extension
     * @return       void
     */
    public void addExtension(String key, Object value) {
        if (extensions == null) {
            extensions = new Extension(key, value);
        } else {
            extensions.put(key, value);
        }
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

    public Definition setDefinition(String nm, String desc) {
        definition = new Definition(nm, desc);
        return definition;
    }


    /**
     * The Activity Definition
     */
    public class Definition {
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

        public Definition(String nm, String desc) {
            name = new LanguageMap(nm);
            description = new LanguageMap(desc);
        }
    }


}
