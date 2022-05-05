package Informacion;

import TemplateWebScrap.Algorithm;

public class Euros extends MonedasConver {

    public Euros(Algorithm precio) {
        super(precio);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double Dolares() {
        
        return precio.templateMethod()*1.06;
    }

    @Override
    public double Euros() {
        // TODO Auto-generated method stub
        return precio.templateMethod();
    }

    @Override
    public double Yenes() {
        // TODO Auto-generated method stub
        return precio.templateMethod()*137.23;
    }

    @Override
    public double PesosCol() {
        // TODO Auto-generated method stub
        return precio.templateMethod()*4323;
    }
    
}
