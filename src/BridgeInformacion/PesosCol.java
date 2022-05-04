package BridgeInformacion;

public class PesosCol extends MonedasConver{

    public PesosCol(double precio) {
        super(precio);
    }

    @Override
    public double Dolares() {
        return precio*4000;        
    }

    @Override
    public double Euros() {
        return precio*4200;
        // TODO Auto-generated method stub
        
    }

    @Override
    public double Yenes() {
        return precio;
        // TODO Auto-generated method stub
        
    }

    @Override
    public double PesosCol() {
        // TODO Auto-generated method stub
        return precio;
    }
    
}
