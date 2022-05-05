package Informacion;

import TemplateWebScrap.Algorithm;

public class Dolares extends MonedasConver {


    public Dolares(Algorithm precio, String[] busqueda) {
        super(precio, busqueda);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double Dolares() {
        // TODO Auto-generated method stub
        return precio.templateMethod(busqueda);
    }

    @Override
    public double Euros() {
        // TODO Auto-generated method stub
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
