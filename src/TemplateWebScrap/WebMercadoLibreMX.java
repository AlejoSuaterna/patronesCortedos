package TemplateWebScrap;

import org.jsoup.select.Elements;

public class WebMercadoLibreMX extends Algorithm {

    @Override
    public String IngresarLink(String busqueda) {
        return "https://listado.mercadolibre.com.mx/" + busqueda;
    }

    @Override
    public String Depurar(String link) {
        Elements cel = getHTML(link)
                .getElementsByClass("ui-search-layout__item");
        String nombre = cel.get(1).getElementsByClass("ui-search-item__group__element ui-search-link").get(1).getElementsByClass("ui-search-item__title").text();
//        get(1).getElementsByClass("ui-search-item__group__element ui-search-link").
//        get(1).getElementsByClass("ui-search-item__title").text();
        System.out.println(nombre);
//        String precio = cel.get(1).getElementsByClass("price-tag ui-search-price__part").text();
        return " - ";
    }

}
