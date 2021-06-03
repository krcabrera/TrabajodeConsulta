package ec.edu.utpl.poo.trabajodeconsulta;

/**
 * Esta clase define Ahorro subclase de la clase Cuenta
 * clase hija Ahorro
 * @author: Kevin Cabrera
 * @version: 1.0
 */
public class Ahorro extends Cuenta {
    private double interesAnual;

    /**
     * constructor para la clase Ahorro
     * @param saldo  de saldo de Ahorro
     * @param numero de numero de Ahorro
     * @param interesAnual de interesAnual de Ahorro
     */

    public Ahorro(double saldo, String numero, double interesAnual) {
        super(saldo, numero);
        this.interesAnual = interesAnual;
    }//Cierre del constructor

    /**
     * metodo get para el atributo numero de la clase Ahorro
     * @return numero de numero de Ahorro
     */

    @Override
    public String getNumero() {

        return "CTA-AH-".concat(super.getNumero());
    }//Cierre del constructor

    /**
     * metodo get para el atributo interesAnual de la clase Ahorro
     * @return interesAnual de interesAnual de Ahorro
     */

    public double getInteresAnual() {

        return interesAnual;
    }//Cierre del constructor

    /**
     * metodo para Validar si el Monto es Valido
     * @param monto de monto deAhorro
     * @return devuelve true si el monto es menor a cero
     */

    private boolean isMontoValido( double monto ) {

        return  monto > 0;
    } //Cierre del constructor

    /**
     * metodo para retirar el monto
     * @param monto monto de Ahorro
     */

    public void retirar(double monto ) {
        if (isMontoValido(monto) ) {
            setSaldo( getSaldo() - monto);
        } else {
            throw new IllegalArgumentException("el monto no es valido");
        }
    } //Cierre del constructor
}
