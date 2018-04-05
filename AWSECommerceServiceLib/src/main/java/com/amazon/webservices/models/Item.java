/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Item 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5536995611933788219L;
    private String aSIN;
    private String offerListingId;
    private Integer quantity;
    private String associateTag;
    private String listItemId;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ASIN")
    public String getASIN ( ) { 
        return this.aSIN;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ASIN")
    public void setASIN (String value) { 
        this.aSIN = value;
        notifyObservers(this.aSIN);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("OfferListingId")
    public String getOfferListingId ( ) { 
        return this.offerListingId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("OfferListingId")
    public void setOfferListingId (String value) { 
        this.offerListingId = value;
        notifyObservers(this.offerListingId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Quantity")
    public Integer getQuantity ( ) { 
        return this.quantity;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Quantity")
    public void setQuantity (Integer value) { 
        this.quantity = value;
        notifyObservers(this.quantity);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("AssociateTag")
    public String getAssociateTag ( ) { 
        return this.associateTag;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("AssociateTag")
    public void setAssociateTag (String value) { 
        this.associateTag = value;
        notifyObservers(this.associateTag);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ListItemId")
    public String getListItemId ( ) { 
        return this.listItemId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ListItemId")
    public void setListItemId (String value) { 
        this.listItemId = value;
        notifyObservers(this.listItemId);
    }
 
}
 