/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Promotion 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5083191902561038297L;
    private Summary summary;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Summary")
    public Summary getSummary ( ) { 
        return this.summary;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Summary")
    public void setSummary (Summary value) { 
        this.summary = value;
        notifyObservers(this.summary);
    }
 
}
 