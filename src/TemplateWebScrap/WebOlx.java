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
public class WebOlx extends Algorithm {

    @Override
    public String IngresarLink(String busqueda) {
        return "https://www.olx.com.co/items/q-" + busqueda;
    }

    @Override
    public String Depurar(String link) {
        Elements cel = getHTML(link)
                .getElementsByClass("EIR5N");
        String nombre = cel.get(1).getElementsByClass("IKo3_").get(0).getElementsByClass("_2tW1I").text();
        String precio = cel.get(1).getElementsByClass("_89yzn").text();
        precio = precio.replace(".", " ");
        precio = "COP " + precio;
        System.out.println(precio);
        return nombre + " - " + precio;
    }

}
