package Informacion;

import TemplateWebScrap.Algorithm;

public class Dolares extends MonedasConver {


    public Dolares(Algorithm precio, String[] busqueda) {
        super(precio, busqueda);
    }

    @Override
    public double Dolares() {
        return precio.templateMethod(busqueda);
    }

    @Override
    public double Euros() {
        return precio.templateMethod(busqueda)*0.94;
    }

    @Override
    public double Yenes() {
        // TODO Auto-generated method stub
        return precio.templateMethod(busqueda)*129.13;
    }

    @Override
    public double PesosCol() {
        // TODO Auto-generated method stub
        return precio.templateMethod(busqueda)*4069.17;
    }
    
}
