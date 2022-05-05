package Informacion;

import TemplateWebScrap.Algorithm;

public abstract class MonedasConver {
    protected Algorithm precio;


    public MonedasConver(Algorithm precio) {
        this.precio = precio;
    }
    public abstract double Dolares();

    public abstract double Euros();

    public abstract double Yenes();

    public abstract double PesosCol();
}
