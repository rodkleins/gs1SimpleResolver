package org.gs1.digitallink;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Link {

    private LinkType linktype;
    private String href;
    private String title;
    private String type;
    private List<String> hreflang;
    private List<String> context; // Campo opcional

    // Getters e Setters
    public LinkType getLinktype() {
        return linktype;
    }

    public void setLinktype(LinkType linktype) {
        this.linktype = linktype;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public List<String> getHreflang() {
        return hreflang;
    }

    public void setHreflang(List<String> hreflang) {
        this.hreflang = hreflang;
    }

    public List<String> getContext() {
        return context;
    }

    public void setContext(List<String> context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "Link{" +
                "linktype=" + linktype +
                ", href='" + href + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", hreflang=" + hreflang +
                ", context=" + context +
                '}';
    }
}
