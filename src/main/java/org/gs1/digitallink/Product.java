package org.gs1.digitallink;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product {

    private String anchor;
    private String itemDescription;
    private LinkType defaultLinktype;
    private List<Map<String, String>> qualifiers; // Opcional, pois nem todos os produtos possuem qualifiers
    private List<Link> links;

    // Getters e Setters
    public String getAnchor() {
        return anchor;
    }

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public LinkType getDefaultLinktype() {
        return defaultLinktype;
    }

    public void setDefaultLinktype(LinkType defaultLinktype) {
        this.defaultLinktype = defaultLinktype;
    }

    public List<Map<String, String>> getQualifiers() {
        return qualifiers;
    }

    public void setQualifiers(List<Map<String, String>> qualifiers) {
        this.qualifiers = qualifiers;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    @Override
    public String toString() {
        return "Product{" +
                "anchor='" + anchor + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", defaultLinktype=" + defaultLinktype +
                ", qualifiers=" + qualifiers +
                ", links=" + links +
                '}';
    }
}
