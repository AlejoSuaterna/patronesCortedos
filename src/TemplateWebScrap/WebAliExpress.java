package TemplateWebScrap;

import org.jsoup.select.Elements;

public class WebAliExpress extends Algorithm {

    @Override
    public String IngresarLink(String busqueda) {
        return "https://www.mediamarkt.es/es/search.html?query="+busqueda+"&t=1651796727714&user_input=iphone%2012&query_from_suggest=true";
    }

    @Override
    public String Depurar(String link) {
        Elements cel = getHTML(link)
                .getElementsByClass("StyledCardWrapper-sc-1j5kbg6-0 eArCCR");
        String nombre = cel.get(0).getElementsByClass("StyledBox-sc-1vld6r2-0 inlukG StyledFlexBox-sc-1w38xrp-4 dlVZXE").get(0).getElementsByClass("BaseTypo-sc-1jga2g7-0 jhZMkB StyledInfoTypo-sc-1jga2g7-1 jmYMNQ").text();
        String precio = cel.get(0).getElementsByClass("BaseTypo-sc-1jga2g7-0 jhZMkB StyledInfoTypo-sc-1jga2g7-1 kMdTgp StyledStrikePriceTypo-csdsbd-0 eETNGJ").text();
        precio = precio.replace("."," ");
        precio = precio.replace(" –", " ");
        float precio2 = Float.valueOf(precio);
        precio2 = precio2*4298;
        precio = Float.toString(precio2);
        precio = "COP $" + precio;
        return nombre + " - " + precio;
    }
}