package ec.edu.utpl.poo.trabajodeconsulta;

/**
 * es una clase main para utilizar las clases Cuenta Corriente SecuencialCheque Ahorro
 * @author: Kevin Cabrera
 * @version: 1.0
 */
public class ClienteBanco {
    /**
     * metodo Main de clase ClienteBanco
     * @param args
     */
    public static void main(String[] args) {
        Ahorro ah1 = new Ahorro(-200, "0001", 0.1);
        System.out.println(ah1.getSaldo());
    }
}
