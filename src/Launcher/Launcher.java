package Launcher;

import TemplateWebScrap.Algorithm;
import TemplateWebScrap.WebEbay;
import TemplateWebScrap.WebMercadoLibreMX;

public class Launcher {
    public static void main(String[] args) {
        Algorithm algo= new WebMercadoLibreMX();
        algo.templateMethod();
        
    }
}
