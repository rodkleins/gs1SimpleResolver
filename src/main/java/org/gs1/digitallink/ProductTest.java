package org.gs1.digitallink;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.util.*;

public class ProductTest {

    public static void main(String[] args) {
        try {
            List<Product> products = new ArrayList<>();

            // Primeiro produto
            Product product1 = new Product();
            product1.setAnchor("/01/09506000134376");
            product1.setItemDescription("Dal Giardino Medicinal Compound 50 x 200mg Capsules");
            product1.setDefaultLinktype(LinkType.GS1_PIP);
            // Este produto não possui qualifiers.
            List<Link> links1 = new ArrayList<>();

            Link link1 = new Link();
            link1.setLinktype(LinkType.GS1_PIP);
            link1.setHref("https://dalgiardino.com/medicinal-compound/pil.html");
            link1.setTitle("Dal Giardino Medicinal Compound 50 x 200mg Capsules page on dalgiardino.com");
            link1.setType("text/html");
            link1.setHreflang(Arrays.asList("en"));
            link1.setContext(Arrays.asList("sales", "marketing"));
            links1.add(link1);

            Link link2 = new Link();
            link2.setLinktype(LinkType.GS1_REGISTER_PRODUCT);
            link2.setHref("https://dalgiardino.com/medicinal-compound/register.html?register=en-GB");
            link2.setTitle("Dal Giardino Medicinal Compound 50 x 200mg Capsules en-GB and en Registration Page");
            link2.setType("text/html");
            link2.setHreflang(Arrays.asList("en-GB", "en"));
            links1.add(link2);

            Link link3 = new Link();
            link3.setLinktype(LinkType.GS1_REGISTER_PRODUCT);
            link3.setHref("https://dalgiardino.com/medicinal-compound/register.html?register=en-US");
            link3.setTitle("Dal Giardino Medicinal Compound 50 x 200mg Capsules en-US Registration Page");
            link3.setType("text/html");
            link3.setHreflang(Arrays.asList("en-US"));
            links1.add(link3);

            Link link4 = new Link();
            link4.setLinktype(LinkType.GS1_REGISTER_PRODUCT);
            link4.setHref("https://dalgiardino.com/medicinal-compound/register.html?register=en-IE");
            link4.setTitle("Dal Giardino Medicinal Compound 50 x 200mg Capsules en-IE Registration Page");
            link4.setType("text/html");
            link4.setHreflang(Arrays.asList("en-IE"));
            links1.add(link4);

            Link link5 = new Link();
            link5.setLinktype(LinkType.GS1_REGISTER_PRODUCT);
            link5.setHref("https://dalgiardino.com/medicinal-compound/register.html?register=non-English");
            link5.setTitle("Dal Giardino Medicinal Compound 50 x 200mg Capsules en-IE Registration Page");
            link5.setType("text/html");
            link5.setHreflang(Arrays.asList("und"));
            links1.add(link5);

            product1.setLinks(links1);
            products.add(product1);

            // Segundo produto (serialized)
            Product product2 = new Product();
            product2.setAnchor("/01/09506000134376");
            product2.setItemDescription("Dal Giardino Medicinal Compound 50 x 200mg Capsules (serialized)");
            product2.setDefaultLinktype(LinkType.GS1_PIP);

            // Qualifiers para produto serialized
            Map<String, String> qualifier2 = new HashMap<>();
            qualifier2.put("21", "{serialnumber}");
            product2.setQualifiers(Arrays.asList(qualifier2));

            List<Link> links2 = new ArrayList<>();

            Link link6 = new Link();
            link6.setLinktype(LinkType.GS1_PIP);
            link6.setHref("https://dalgiardino.com/medicinal-compound/pil.html?serial={serialnumber}");
            link6.setTitle("Serialised Dal Giardino Medicinal Compound 50 x 200mg Capsules page on dalgiardino.com");
            link6.setType("text/html");
            link6.setHreflang(Arrays.asList("en"));
            link6.setContext(Arrays.asList("sales", "marketing"));
            links2.add(link6);

            Link link7 = new Link();
            link7.setLinktype(LinkType.GS1_CERTIFICATION_INFO);
            link7.setHref("https://dalgiardino.com/medicinal-compound/product.html?serial={serialnumber}");
            link7.setTitle("Serialised Dal Giardino Medicinal Compound 50 x 200mg Capsules product page on dalgiardino.com");
            link7.setType("text/html");
            link7.setHreflang(Arrays.asList("en"));
            link7.setContext(Arrays.asList("sales", "marketing"));
            links2.add(link7);

            product2.setLinks(links2);
            products.add(product2);

            // Terceiro produto (lot numbered)
            Product product3 = new Product();
            product3.setAnchor("/01/09506000134376");
            product3.setItemDescription("Dal Giardino Medicinal Compound 50 x 200mg Capsules (lot numbered)");
            product3.setDefaultLinktype(LinkType.GS1_PIP);

            // Qualifiers para produto lot numbered
            Map<String, String> qualifier3 = new HashMap<>();
            qualifier3.put("10", "{lotnumber}");
            product3.setQualifiers(Arrays.asList(qualifier3));

            List<Link> links3 = new ArrayList<>();

            Link link8 = new Link();
            link8.setLinktype(LinkType.GS1_PIP);
            link8.setHref("https://dalgiardino.com/medicinal-compound/pil.html?lot={lotnumber}");
            link8.setTitle("Lot numbered Dal Giardino Medicinal Compound 50 x 200mg Capsules page on dalgiardino.com");
            link8.setType("text/html");
            link8.setHreflang(Arrays.asList("en"));
            link8.setContext(Arrays.asList("sales", "marketing"));
            links3.add(link8);

            Link link9 = new Link();
            link9.setLinktype(LinkType.GS1_CERTIFICATION_INFO);
            link9.setHref("https://dalgiardino.com/medicinal-compound/certificate_1?lot={lotnumber}");
            link9.setTitle("Lot numbered Dal Giardino Medicinal Compound - Certificate 1");
            link9.setType("text/html");
            link9.setHreflang(Arrays.asList("en"));
            links3.add(link9);

            Link link10 = new Link();
            link10.setLinktype(LinkType.GS1_CERTIFICATION_INFO);
            link10.setHref("https://dalgiardino.com/medicinal-compound/certificate_2?lot={lotnumber}");
            link10.setTitle("Lot numbered Dal Giardino Medicinal Compound - Certificate 2");
            link10.setType("text/html");
            link10.setHreflang(Arrays.asList("en"));
            links3.add(link10);

            Link link11 = new Link();
            link11.setLinktype(LinkType.GS1_CERTIFICATION_INFO);
            link11.setHref("https://dalgiardino.com/medicinal-compound/certificate_3?lot={lotnumber}");
            link11.setTitle("Lot numbered Dal Giardino Medicinal Compound - Certificate 3");
            link11.setType("text/html");
            link11.setHreflang(Arrays.asList("en"));
            links3.add(link11);

            product3.setLinks(links3);
            products.add(product3);

            // Serializa a lista de produtos para JSON com formatação indentada
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            String jsonOutput = mapper.writeValueAsString(products);

            System.out.println(jsonOutput);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
