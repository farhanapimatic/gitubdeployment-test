/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ItemSearchResponseMsg 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5298514399852195156L;
    private ItemSearchResponse body;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("body")
    public ItemSearchResponse getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("body")
    public void setBody (ItemSearchResponse value) { 
        this.body = value;
        notifyObservers(this.body);
    }
 
}
 