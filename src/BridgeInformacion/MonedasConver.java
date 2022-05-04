package BridgeInformacion;

public abstract class MonedasConver {
    public double precio;

    public MonedasConver(double precio) {
        this.precio = precio;
    }

    public abstract double Dolares();

    public abstract double Euros();

    public abstract double Yenes();

    public abstract double PesosCol();
}
