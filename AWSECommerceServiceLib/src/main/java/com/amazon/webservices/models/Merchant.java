/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Merchant 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5671520799944112224L;
    private String name;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Name")
    public void setName (String value) { 
        this.name = value;
        notifyObservers(this.name);
    }
 
}
 