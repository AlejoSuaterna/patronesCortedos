package Informacion;

import TemplateWebScrap.Algorithm;

public abstract class MonedasConver {
    protected Algorithm precio;
    protected String[] busqueda;

    public MonedasConver(Algorithm precio, String[] busqueda) {
        this.precio = precio;
        this.busqueda = busqueda;
    }
    public abstract double Dolares();

    public abstract double Euros();

    public abstract double Yenes();

    public abstract double PesosCol();
}
