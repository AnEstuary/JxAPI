package com.yetanalytics.xapi.statement;

import com.nimbusds.langtag.LangTag;
import com.nimbusds.langtag.LangTagException;
import java.util.HashMap;

/**
 * Created by Jason Lewis on 10/21/14.
 */
public class LanguageMap extends HashMap<String, String> {

    /**
     * CTOR for a Language Map of arbitrary lang/region tag and description
     *
     * @param lang          the language code according to RFC 5646
     * @param region        the region code according to RFC 5646
     * @param description   the description of the language-tagged object
     * @return              a new LanguageMap with the specified attrs
     *
     */
    public LanguageMap(String lang, String region, String description){
        try{
            LangTag tag = new LangTag(lang);
            tag.setRegion(region);
            this.put(tag.toString(), description);
        } catch(LangTagException e) {
            e.printStackTrace();
        }
    }

    /**
     * CTOR -
     * Creates a new LanguageMap with the default language tag of en-US
     *
     * @param description   the description of the language-tagged object
     *
     * @return              A new LanguageMap
     *
     */
    public LanguageMap(String description){
        try{
            LangTag tag = new LangTag("en");
            tag.setRegion("US");
            this.put(tag.toString(), description);
        } catch(LangTagException e) {
            e.printStackTrace();
        }
    }



}
