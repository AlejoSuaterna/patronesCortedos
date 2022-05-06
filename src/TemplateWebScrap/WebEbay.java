package TemplateWebScrap;

import org.jsoup.select.Elements;

public class WebEbay extends Algorithm {

    @Override
    public String IngresarLink(String busqueda) {
        return "https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2334524.m570.l1313&_nkw=" + busqueda
        + "&_sacat=0&LH_TitleDesc=0&loc=1003659&sitelnk=&poi=&cmpgn=6485254487&rlsatarget=kwd-332279276825&geo_id=&network=g&gclid=CjwKCAjwgr6TBhAGEiwA3aVuISDnNrlwemQEaL6YQYu37p2-XVKWy8DNAV1dft5IueqsUCf81tlh_RoC36MQAvD_BwE&mkcid=2&_odkw=e+bay+motors.com&norover=1&MT_ID=&adpos=&adgroupid=78211154059&matchtype=b&abcId=&keyword=e+bay+motors.com&mkrid=711-163588-2056-0&crlp=496209240863_&device=c";
    }

    @Override
    public String Depurar(String link) {
        Elements cel = getHTML(link).getElementsByClass("s-item s-item__pl-on-bottom");
        String nombre = cel.get(1).getElementsByClass("s-item__link").get(0).getElementsByClass("s-item__title").text();
        String precio = cel.get(1).getElementsByClass("s-item__price").text(); 
        return nombre+" - "+precio;
    }

}