/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CartAddResponse 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5418813188869724995L;
    private OperationRequest operationRequest;
    private List<Cart> cart;
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
    @JsonGetter("Cart")
    public List<Cart> getCart ( ) { 
        return this.cart;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Cart")
    public void setCart (List<Cart> value) { 
        this.cart = value;
        notifyObservers(this.cart);
    }
 
}
 