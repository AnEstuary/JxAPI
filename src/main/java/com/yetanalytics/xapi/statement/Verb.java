package com.yetanalytics.xapi.statement;

import java.net.URI;

/**
 * Created by jason on 10/20/14.
 */
public class Verb {
    public URI id;
    public LanguageMap display;

    public Verb(URI iri, LanguageMap disp) {
        id = iri;
        display = disp;
    }

    /**
     * Overload the stricter consturctor for ease of use
     * @param iri
     * @param disp
     */
    public Verb(String iri, String disp) {
        id = URI.create(iri);
        display = new LanguageMap(disp);
    }
}
