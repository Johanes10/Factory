import factorias.Elfofactorial;
import factorias.HombreFactorial;
import factorias.Reinofactorial;
import partes.Armada;
import partes.Castillo;
import partes.Reino;

public class App {
    public static void main(String[] args) throws Exception {
        crearReino(new HombreFactorial());
        crearReino(new Elfofactorial());   
    }

    public static void crearReino(Reinofactorial factory){
        Reino reino = factory.crearReino();
        Castillo castillo = factory.crearCastillo();
        Armada armada = factory.crearArmada();

        System.out.println("___Un reino fue creado:___");
        System.out.println(armada.Apoyo());
        System.out.println(castillo.Defensa());
        System.out.println(reino.Agrupamiento());
    }

    
}
