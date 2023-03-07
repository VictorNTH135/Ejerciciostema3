public class Coche {

    private int numPuertas;

    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void añadirPuerta() {
        numPuertas++;
    }
public class cochecito {

    public static void main(String[] args) {
        Coche int miCoche = new Coche(3); 
        miCoche.añadirPuerta(); 
        System.out.println("Número de puertas del coche: " + miCoche.getNumPuertas()); 
    }
}

}


