package Informacion;

import TemplateWebScrap.Algorithm;

public class Euros extends MonedasConver {


    public Euros(Algorithm precio, String[] busqueda) {
        super(precio, busqueda);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double Dolares() {
        
        return precio.templateMethod(busqueda)*1.06;
    }

    @Override
    public double Euros() {
        // TODO Auto-generated method stub
        return precio.templateMethod(busqueda);
    }

    @Override
    public double Yenes() {
        // TODO Auto-generated method stub
        return precio.templateMethod(busqueda)*137.23;
    }

    @Override
    public double PesosCol() {
        // TODO Auto-generated method stub
        return precio.templateMethod(busqueda)*0.00023;
    }
    
}
