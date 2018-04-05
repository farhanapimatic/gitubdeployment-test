/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Variations 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4989609319187252663L;
    private Integer totalVariations;
    private Integer totalVariationPages;
    private VariationDimensions variationDimensions;
    private List<Item> item;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TotalVariations")
    public Integer getTotalVariations ( ) { 
        return this.totalVariations;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TotalVariations")
    public void setTotalVariations (Integer value) { 
        this.totalVariations = value;
        notifyObservers(this.totalVariations);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TotalVariationPages")
    public Integer getTotalVariationPages ( ) { 
        return this.totalVariationPages;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TotalVariationPages")
    public void setTotalVariationPages (Integer value) { 
        this.totalVariationPages = value;
        notifyObservers(this.totalVariationPages);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("VariationDimensions")
    public VariationDimensions getVariationDimensions ( ) { 
        return this.variationDimensions;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("VariationDimensions")
    public void setVariationDimensions (VariationDimensions value) { 
        this.variationDimensions = value;
        notifyObservers(this.variationDimensions);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Item")
    public List<Item> getItem ( ) { 
        return this.item;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Item")
    public void setItem (List<Item> value) { 
        this.item = value;
        notifyObservers(this.item);
    }
 
}
 