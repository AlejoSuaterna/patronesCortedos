package TemplateWebScrap;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public abstract class Algorithm {

    public double templateMethod(String[] palabraBusqueda) {
        return Double.parseDouble(getValores(Depurar(IngresarLink(IngreseBusqueda(palabraBusqueda)))));
    }

    public String IngreseBusqueda(String[] palabraSep) {
        String newNombre = "";
        int c = 0;
        for (String s : palabraSep) {
            newNombre += s;
            c++;
            if (c < palabraSep.length) {
                newNombre += "+";
            }
        }
        return newNombre;
    }

    public abstract String IngresarLink(String busqueda);

    public abstract String Depurar(String link);

    public String getValores(String informacion) {
        String palabra[] = informacion.split(" - ");
        System.out.println("Nombre: " + palabra[0] + "\nPrecio: " + palabra[1]);
        return palabra[1].replace("COP $", "").replace(" ", "");
    }

    public Document getHTML(String url) {
        Document html = null;
        try {
            html = Jsoup.connect(url).userAgent("Mozilla/5.0").timeout(6000).get();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return html;
    }
}
