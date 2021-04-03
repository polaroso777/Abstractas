

/**
 * @author Jsilva
 * @version 1.0
 * @created 27-mar.-2021 07:28:48 p. m.
 */

package abstractasinterfaces;

public abstract class Reclamaciones {

	private float monto;
	private String tipo;

	public Reclamaciones(){

	}

	public void finalize() throws Throwable {

	}

	public float getmonto(){
		return monto;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setmonto(float newVal){
		monto = newVal;
	}

	public String gettipo(){
		return tipo;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void settipo(String newVal){
		tipo = newVal;
	}

	public abstract int levantar();

	/**
	 * 
	 * @param numreclamo
	 */
	public abstract String consultar(int numreclamo);

	/**
	 * 
	 * @param numreclamo
	 */
	public abstract int cerrar(int numreclamo);

}