package FabricacionPura;


/**
 * @author Jsilva
 * @version 1.0
 * @created 01-abr.-2021 03:36:43 p. m.
 */
public class Ciudad {

	private Corrdenada coordenadas;

	public Ciudad(){

	}

	public void finalize() throws Throwable {

	}

	public Corrdenada getcoordenadas(){
		return coordenadas;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcoordenadas(Corrdenada newVal){
		coordenadas = newVal;
	}

}