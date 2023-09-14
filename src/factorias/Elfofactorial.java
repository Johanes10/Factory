package factorias;

import partes.Armada;
import partes.ArmadaElfo;
import partes.Castillo;
import partes.CastilloElfo;
import partes.Reino;
import partes.ReinoElfo;

public class Elfofactorial extends Reinofactorial{

    @Override
    public Armada crearArmada() {
        return new ArmadaElfo();
    }

    @Override
    public Reino crearReino() {
        return new ReinoElfo();
    }

    @Override
    public Castillo crearCastillo() {
        return new CastilloElfo();
    }
    
}
