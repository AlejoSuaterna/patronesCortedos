package TemplateWebScrap;

import java.io.IOException;

import javax.swing.JOptionPane;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public abstract class Algorithm {

    public double templateMethod() {
        return Double.parseDouble(getValores(Depurar(IngresarLink(IngreseBusqueda()))));
    }

    public String IngreseBusqueda() {
        String palabraSep[] = JOptionPane.showInputDialog(null, "Ingerese la busqueda: ").split(" ");
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
        return palabra[1];
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
