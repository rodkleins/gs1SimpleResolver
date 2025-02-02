package org.gs1.digitallink;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
public enum LinkType {

    /**
     * The URL of a document that provides information about the identified item,
     * typically operated by the brand owner or a retailer of the product.
     * It may include links to further information, product description, specifications etc.
     * This page may be human or machine readable, or a combination of both.
     * (Product information page)
     */
    GS1_PIP("gs1:pip"),

    /**
     * A document, video or graphic that shows the key features needed to be understood
     * to begin using the item.
     * (Quick start guide)
     */
    GS1_QUICK_START_GUIDE("gs1:quickStartGuide"),

    /**
     * A document describing the allergens in the product.
     * (Allergen information)
     */
    GS1_ALLERGEN_INFO("gs1:allergenInfo"),

    /**
     * A document describing all the individual items in a packaged item.
     * (What's in the box)
     */
    GS1_WHATS_IN_THE_BOX("gs1:whatsInTheBox"),

    /**
     * Information on certification to which the product complies.
     * (Certification information)
     */
    GS1_CERTIFICATION_INFO("gs1:certificationInfo"),

    /**
     * A link to traceability information about the product.
     * (Traceability information)
     */
    GS1_TRACEABILITY("gs1:traceability"),

    /**
     * A link to information about whether the product has been recalled or not,
     * typically an API.
     * (Recall status)
     */
    GS1_RECALL_STATUS("gs1:recallStatus"),

    /**
     * A link to an entry point for registering ownership of a product including for warranty purposes.
     * (Register purchase)
     */
    GS1_REGISTER_PRODUCT("gs1:registerProduct"),

    /**
     * A website containing recipes associated with the product.
     * (Recipe website)
     */
    GS1_RECIPE_INFO("gs1:recipeInfo"),

    /**
     * Link to an electronic patient information leaflet.
     * (Patient information)
     */
    GS1_EPIL("gs1:epil"),

    /**
     * Link to Summary Product Characteristics for healthcare professionals.
     * (Summary product characteristics - SmPC)
     */
    GS1_SMPC("gs1:smpc"),

    /**
     * A link to a social media channel. The title will typically be replaced by the name of the channel.
     * (Social media)
     */
    GS1_SOCIAL_MEDIA("gs1:socialMedia"),

    /**
     * A link to a source of support such as a helpdesk, chat support, email, etc.
     * (Support)
     */
    GS1_SUPPORT("gs1:support"),

    /**
     * A link to a page where supplies or accessories for the item can be purchased or ordered.
     * (Purchase supplies or accessories)
     */
    GS1_PURCHASE_SUPPLIES_OR_ACCESSORIES("gs1:purchaseSuppliesOrAccessories"),

    /**
     * A link to a list of retailers for this item.
     * (List of retailers)
     */
    GS1_HAS_RETAILERS("gs1:hasRetailers");
	

    private final String value;

    LinkType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static LinkType fromValue(String value) {
        for (LinkType type : LinkType.values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown link type: " + value);
    }
}
