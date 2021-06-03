package ec.edu.utpl.poo.trabajodeconsulta;

/**
 * Esta clase define SecuencialCheque de una cuenta bancaria
 * @author: Kevin Cabrera
 * @version: 1.0
 */
public class SecuencialCheque {
    private String inicio;
    private String fin;

    /**
     * metodo get para el atributo inicio de la clase SecuencialCheque
     * @return inicio de inicio de SecuencialCheque
     */

    public String getInicio() {

        return inicio;
    }

    /**
     * metodo set para el atributo inicio de la clase SecuencialCheque
     * @param inicio de inicio de SecuencialCheque
     */

    public void setInicio(String inicio) {

        this.inicio = inicio;
    }

    /**
     * metodo get para el atributo fin de la clase SecuencialCheque
     * @return fin de fin de SecuencialCheque
     */
    public String getFin() {

        return fin;
    }

    /**
     * metodo set para el atributo fin de la clase SecuencialCheque
     * @param fin de fin de secuencialCheque
     */
    public void setFin(String fin) {

        this.fin = fin;
    }

}
