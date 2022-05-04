package BridgeInformacion;

public class PesosCol extends MonedasConver{

    public PesosCol(double precio) {
        super(precio);
    }

    @Override
    public double Dolares() {
        return precio*0.004;        
    }

    @Override
    public double Euros() {
        return precio*0.024;
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
