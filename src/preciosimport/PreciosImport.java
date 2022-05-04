/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preciosimport;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author hugoa
 */
public class PreciosImport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PreciosImport p = new PreciosImport();
        p.scraping(p.palabras("Samgung S20"));
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

    public String scraping(String busqueda) {
        Elements cel = getHTML("https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2334524.m570.l1313&_nkw=" + busqueda + "&_sacat=0&LH_TitleDesc=0&loc=1003659&sitelnk=&poi=&cmpgn=6485254487&rlsatarget=kwd-332279276825&geo_id=&network=g&gclid=CjwKCAjwgr6TBhAGEiwA3aVuISDnNrlwemQEaL6YQYu37p2-XVKWy8DNAV1dft5IueqsUCf81tlh_RoC36MQAvD_BwE&mkcid=2&_odkw=e+bay+motors.com&norover=1&MT_ID=&adpos=&adgroupid=78211154059&matchtype=b&abcId=&keyword=e+bay+motors.com&mkrid=711-163588-2056-0&crlp=496209240863_&device=c")
                .getElementsByClass("s-item s-item__pl-on-bottom");
        System.out.println(cel.size());
        String nombre = "\nNombre: " + cel.get(1).getElementsByClass("s-item__link").get(0).getElementsByClass("s-item__title").text();
        String precio = "\nPrecio: " + cel.get(1).getElementsByClass("s-item__price").text();
        System.out.println(nombre + precio);
        return precio;
    }

    public String palabras(String p) {
        String palabraSep[] = p.split(" ");
        String newNombre = "";
        int c = 0;
        for (String s : palabraSep) {
            newNombre += s;
            c++;
            if (c < palabraSep.length) {
                newNombre += "+";
            }
        }
        System.out.println(newNombre);
        return newNombre;
    }
}
