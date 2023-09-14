package factorias;

import partes.Armada;
import partes.ArmadaHombre;
import partes.Castillo;
import partes.CastilloHombre;
import partes.Reino;
import partes.ReinoHombre;

public class HombreFactorial extends Reinofactorial{

    @Override
    public Armada crearArmada() {
        return new ArmadaHombre();
    }

    @Override
    public Reino crearReino() {
        return new ReinoHombre();
    }

    @Override
    public Castillo crearCastillo() {
        return new CastilloHombre();
 
    }
    
}
