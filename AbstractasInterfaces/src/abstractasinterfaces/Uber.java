

/**
 * @author Jsilva
 * @version 1.0
 * @created 27-mar.-2021 07:29:17 p. m.
 */

package abstractasinterfaces;

public class Uber {

	private int socio;

	public Uber(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param socio
	 */
	public int verificar(int socio){
		return 1;
	}

	public int getsocio(){
		return socio;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setsocio(int newVal){
		socio = newVal;
	}

	/**
	 * 
	 * @param socio
	 */
	public int iniciar(int socio){
                System.out.println("Levanto con numero 8000 Uber " + "\n");
            return 888;
	}

	public String consultar(){
		return "Reclamcion Uber Activa";
	}

	/**
	 * 
	 * @param numreclamo
	 */
	public int validar(int numreclamo){
		return 0;
	}

	/**
	 * 
	 * @param numreclamo
	 */
	public int cerrar(int numreclamo){
		return 0;
	}

}