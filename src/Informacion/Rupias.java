/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Informacion;

import TemplateWebScrap.Algorithm;

/**
 *
 * @author david
 */
public class Rupias extends MonedasConver{

    public Rupias(Algorithm precio, String[] busqueda) {
        super(precio, busqueda);
    }

    @Override
    public double Dolares() {
        return precio.templateMethod(busqueda)*0.013;
    }

    @Override
    public double Euros() {
        return precio.templateMethod(busqueda)*0.012;
    }

    @Override
    public double Yenes() {
        return precio.templateMethod(busqueda)*1.69;
    }

    @Override
    public double PesosCol() {
        return precio.templateMethod(busqueda)*52.70;
    }

    @Override
    public double Rupias() {
        return precio.templateMethod(busqueda);
    }
    
    
}
