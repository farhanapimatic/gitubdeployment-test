/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class LoyaltyPoints 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5590575299507818363L;
    private Integer points;
    private Price typicalRedemptionValue;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Points")
    public Integer getPoints ( ) { 
        return this.points;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Points")
    public void setPoints (Integer value) { 
        this.points = value;
        notifyObservers(this.points);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TypicalRedemptionValue")
    public Price getTypicalRedemptionValue ( ) { 
        return this.typicalRedemptionValue;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TypicalRedemptionValue")
    public void setTypicalRedemptionValue (Price value) { 
        this.typicalRedemptionValue = value;
        notifyObservers(this.typicalRedemptionValue);
    }
 
}
 