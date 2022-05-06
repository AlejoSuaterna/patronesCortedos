package TemplateWebScrap;

import org.jsoup.select.Elements;

public class WebAlkosto extends Algorithm {

    @Override
    public String IngresarLink(String busqueda) {

        return "https://www.alkosto.com/search/?text=" + busqueda;
    }

    @Override
    public String Depurar(String link) {
        Elements cel = getHTML(link).getElementsByClass("product__list--item product__list--alkosto");
        String nombre = cel.get(1).getElementsByClass("product__information--name").get(0).getElementsByClass("js-product-click-datalayer").text();
        String precio = cel.get(1).getElementsByClass("price").text();
        if (nombre.isEmpty() || precio.isEmpty()) {
            return "No hay el prducto - 1000000000";
        }
        precio = precio.replace("$","");
        precio = precio.replace(".", " ").replace(" ","");
        return nombre + " - " + precio;
    }

}
