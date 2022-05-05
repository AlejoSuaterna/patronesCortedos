package Informacion;

import TemplateWebScrap.Algorithm;

public class PesosCol extends MonedasConver{


    public PesosCol(Algorithm precio, String[] busqueda) {
        super(precio, busqueda);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double Dolares() {
        return precio.templateMethod(busqueda)*0.00025;        
    }

    @Override
    public double Euros() {
        return precio.templateMethod(busqueda)*0.00024;
        // TODO Auto-generated method stub
        
    }

    @Override
    public double Yenes() {
        return precio.templateMethod(busqueda)*0.032;
        // TODO Auto-generated method stub
        
    }

    @Override
    public double PesosCol() {
        // TODO Auto-generated method stub
        return precio.templateMethod(busqueda);
    }
    
}
