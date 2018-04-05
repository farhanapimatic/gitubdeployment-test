/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SimilarityLookupResponse 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5338865411868766107L;
    private OperationRequest operationRequest;
    private List<Items117> items;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("OperationRequest")
    public OperationRequest getOperationRequest ( ) { 
        return this.operationRequest;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("OperationRequest")
    public void setOperationRequest (OperationRequest value) { 
        this.operationRequest = value;
        notifyObservers(this.operationRequest);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Items")
    public List<Items117> getItems ( ) { 
        return this.items;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Items")
    public void setItems (List<Items117> value) { 
        this.items = value;
        notifyObservers(this.items);
    }
 
}
 