package ec.edu.utpl.poo.trabajodeconsulta;
import java.time.LocalDate;

/**
 * Esta clase define objetos de una cuenta bancaria
 * @author: Kevin Cabrera
 * @version: 1.0
 */

public class Cuenta {
    //Campos de la clase
    private double saldo;
    protected String numero;
    private LocalDate fechaApertura;

    /**
     * constructor para la clase Cuenta
     * @param saldo saldo de la Cuenta
     * @param numero numero de la Cuenta
     */

    public Cuenta(double saldo, String numero) {
        setSaldo(saldo);
        this.numero = numero;
        fechaApertura = LocalDate.now();
    }

    /**
     * metodo get para el atributo saldo de la clase Cuenta
     * @return saldo el saldo de la Cuenta
     */

    public double getSaldo() {

        return saldo;
    }

    /**
     * metodo set para el atributo saldo de la clase Cuenta
     * @param saldo el saldo de la Cuenta
     */

    public final void setSaldo(double saldo) {
        if ( !validarSaldoNoNegativo(saldo) ) {
            this.saldo = saldo;

        }else {
            throw new IllegalArgumentException("Saldo negativo");
        }
    }

    /**
     * metodo get para el atributo numero de la clase Cuenta
     * @return numero   el numero de la Cuenta
     */
    public String getNumero() {

        return numero;
    }

    /**
     * metodo set para el atributo numero de la clase Cuenta
     * @param numero  el numero de la Cuenta
     */
    public void setNumero(String numero) {

        this.numero = numero;
    }

    /**
     * metodo para Validar saldo no Negativo
     * @param saldo el saldo de la Cuenta
     * @return devuelve true si el saldo es menor a cero
     */

    private boolean validarSaldoNoNegativo(double saldo) {

        return saldo < 0;
    }

    /**
     * metodo para motrar un mensaje de un Monto Negativo
     * @param monto el monto de la Cuenta
     */

    public void depositar(double monto) {
        if (monto > 0 ) {
            this.saldo = this.saldo + monto;
        } else {
            throw new IllegalArgumentException("Monto Negativo");
        }
    }
}

