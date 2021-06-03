package ec.edu.utpl.poo.trabajodeconsulta;

/**
 * Esta clase define corriente subclase de la clase Cuenta
 * clase hija Corriente
 * @author: Kevin Cabrera
 * @version: 1.0
 */

public class Corriente extends Cuenta {
    private int nroMaxCheques;
    private SecuencialCheque secuencialCh;

    /**
     * constructor para la clase Corriente
     * @param saldo saldo de Corriente
     * @param numero numero de Corriente
     */

    public Corriente(double saldo, String numero) {

        super(saldo, numero);
    }

    /**
     * metodo get para el atributo NroMaxCheque de la clase Corriente
     * @return nroMaxCheques de NroMaxCheques de Corriente
     */

    public int getNroMaxCheques() {

        return nroMaxCheques;
    }

    /**
     * metodo set para el atributo NroMaxCheque de la clase Corriente
     * @param nroMaxCheques de nroMaxCheques de Corriente
     */

    public void setNroMaxCheques(int nroMaxCheques) {

        this.nroMaxCheques = nroMaxCheques;
    }

    /**
     * metodo get para el atributo SecuencialCheque de la clase Corriente
     * @return secuencialCh secuencialCh de Corriente
     */

    public SecuencialCheque getSecuencialCh() {

        return secuencialCh;
    }

    /**
     * metodo set para el atributo SecuencialCh de la clase Corriente
     * @param secuencialCh secuencialCh de Corriente
     */

    public void setSecuencialCh(SecuencialCheque secuencialCh) {

        this.secuencialCh = secuencialCh;
    }
}
