/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Items117 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5045170776034029445L;
    private Request request;
    private CorrectedQuery correctedQuery;
    private String qid;
    private String engineQuery;
    private Integer totalResults;
    private Integer totalPages;
    private String moreSearchResultsUrl;
    private SearchResultsMap searchResultsMap;
    private List<Item116> item;
    private SearchBinSets searchBinSets;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Request")
    public Request getRequest ( ) { 
        return this.request;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Request")
    public void setRequest (Request value) { 
        this.request = value;
        notifyObservers(this.request);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("CorrectedQuery")
    public CorrectedQuery getCorrectedQuery ( ) { 
        return this.correctedQuery;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("CorrectedQuery")
    public void setCorrectedQuery (CorrectedQuery value) { 
        this.correctedQuery = value;
        notifyObservers(this.correctedQuery);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Qid")
    public String getQid ( ) { 
        return this.qid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Qid")
    public void setQid (String value) { 
        this.qid = value;
        notifyObservers(this.qid);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("EngineQuery")
    public String getEngineQuery ( ) { 
        return this.engineQuery;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("EngineQuery")
    public void setEngineQuery (String value) { 
        this.engineQuery = value;
        notifyObservers(this.engineQuery);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TotalResults")
    public Integer getTotalResults ( ) { 
        return this.totalResults;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TotalResults")
    public void setTotalResults (Integer value) { 
        this.totalResults = value;
        notifyObservers(this.totalResults);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TotalPages")
    public Integer getTotalPages ( ) { 
        return this.totalPages;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TotalPages")
    public void setTotalPages (Integer value) { 
        this.totalPages = value;
        notifyObservers(this.totalPages);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MoreSearchResultsUrl")
    public String getMoreSearchResultsUrl ( ) { 
        return this.moreSearchResultsUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MoreSearchResultsUrl")
    public void setMoreSearchResultsUrl (String value) { 
        this.moreSearchResultsUrl = value;
        notifyObservers(this.moreSearchResultsUrl);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SearchResultsMap")
    public SearchResultsMap getSearchResultsMap ( ) { 
        return this.searchResultsMap;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SearchResultsMap")
    public void setSearchResultsMap (SearchResultsMap value) { 
        this.searchResultsMap = value;
        notifyObservers(this.searchResultsMap);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Item")
    public List<Item116> getItem ( ) { 
        return this.item;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Item")
    public void setItem (List<Item116> value) { 
        this.item = value;
        notifyObservers(this.item);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SearchBinSets")
    public SearchBinSets getSearchBinSets ( ) { 
        return this.searchBinSets;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SearchBinSets")
    public void setSearchBinSets (SearchBinSets value) { 
        this.searchBinSets = value;
        notifyObservers(this.searchBinSets);
    }
 
}
 