/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preciosimport;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        p.scraping(p.palabras("Samgung S9"));
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

    public void scraping(String[] busqueda) {
        
        Elements cel = getHTML("https://www.amazon.ca/s?k="+busqueda[0]+"+"+busqueda[1]+"&rh=n%3A3379583011&ref=nb_sb_noss").getElementsByClass("sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20");
        System.out.println(cel.size());
        System.out.println(cel.get(0).getElementsByClass("a-size-medium a-color-base a-text-normal").text());
        /*                .select("div.pf-finder-v2_box pf-finder-v2_box-view js-pf-product-card tr");
        System.out.println(articulos.size());
        for(Element celulares:articulos){
            try{
                String urlCel=celulares.select("a.cta cta--outlined cta--black").attr("abs:href");
                Document htmlCel=getHTML(urlCel);
                
                String nombre= htmlCel.select("h2").text();
                System.out.println(nombre);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
         */
    }
    
    public String[] palabras(String p){
        String palabraSep[]=p.split(" ");
        return palabraSep;
    }
}