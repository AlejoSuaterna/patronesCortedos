/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateWebScrap;

import org.jsoup.select.Elements;

/**
 *
 * @author USUARIO
 */
public class WebFlipkart extends Algorithm {

    @Override
    public String IngresarLink(String busqueda) {
        return "https://www.flipkart.com/search?q=" + busqueda;
    }

    @Override
    public String Depurar(String link) {
        Elements cel = getHTML(link)
                .getElementsByClass("_2kHMtA");
        String nombre = cel.get(1).getElementsByClass("_3pLy-c row").get(0).getElementsByClass("_4rR01T").text();
        String precio = cel.get(1).getElementsByClass("_30jeq3 _1_WHN1").text();
        precio = precio.replace("₹", "").replace(",", "");
        Float precio2 = Float.valueOf(precio);
        precio2 = (precio2 * 53);
        precio = Float.toString(precio2);
        precio = "COP $" + precio;
        return nombre + " - " + precio;
    }

}
