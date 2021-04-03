

/**
 * @author Jsilva
 * @version 1.0
 * @created 27-mar.-2021 07:29:06 p. m.
 */


package abstractasinterfaces;

public class AutoUberAdaptador extends Reclamaciones {

	private Uber uber;

	public AutoUberAdaptador(int socio){
            super();
            this.uber = new Uber();
            uber.setsocio(socio);
            

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public float getmonto(){
		return super.getmonto();
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setmonto(float newVal){
	      super.setmonto(newVal);
	}

	public String gettipo(){
		return super.gettipo();
	}

	/**
	 * 
	 * @param newVal
	 */
	public void settipo(String newVal){
		super.settipo(newVal);
	}

         @Override
	public int levantar(){
            this.uber.verificar(this.uber.getsocio());
            this.uber.iniciar(this.uber.getsocio());
            return 77777;
	}

	/**
	 * 
	 * @param numreclamo
	 */
         @Override
	public String consultar(int numreclamo){
            this.uber.validar(numreclamo);
            this.uber.consultar();
            return "ok";
	}

	/**
	 * 
	 * @param numreclamo
	 */
        @Override
	public int cerrar(int numreclamo){
            this.uber.verificar(numreclamo);
            this.uber.cerrar(numreclamo);
	    return 0;
	}

	public Uber getuber(){
		return uber;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setuber(Uber newVal){
		uber = newVal;
	}

}