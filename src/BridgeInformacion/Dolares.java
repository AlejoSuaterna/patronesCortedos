package BridgeInformacion;

public class Dolares extends MonedasConver {

    public Dolares(double precio) {
        super(precio);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double Dolares() {
        // TODO Auto-generated method stub
        return precio;
    }

    @Override
    public double Euros() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double Yenes() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double PesosCol() {
        // TODO Auto-generated method stub
        return precio*4000;
    }
    
}
