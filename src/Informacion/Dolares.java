package Informacion;

import TemplateWebScrap.Algorithm;

public class Dolares extends MonedasConver {

    public Dolares(Algorithm precio) {
        super(precio);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double Dolares() {
        // TODO Auto-generated method stub
        return precio.templateMethod();
    }

    @Override
    public double Euros() {
        // TODO Auto-generated method stub
        return precio.templateMethod()*0.94;
    }

    @Override
    public double Yenes() {
        // TODO Auto-generated method stub
        return precio.templateMethod()*129.13;
    }

    @Override
    public double PesosCol() {
        // TODO Auto-generated method stub
        return precio.templateMethod()*4069.17;
    }
    
}
