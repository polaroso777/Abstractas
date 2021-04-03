

/**
 * @author Jsilva
 * @version 1.0
 * @created 27-mar.-2021 07:28:57 p. m.
 */
package abstractasinterfaces;
 
public class Auto extends Reclamaciones {

	public Auto(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

         public float getmonto(){
		return super.getmonto();
	} 

	public void setmonto(float newVal){
		super.setmonto(newVal);
	}

	public String gettipo(){
		return super.gettipo();
	}

	public void settipo(String newVal){
		 super.settipo(newVal);
	}


         @Override
	public int levantar(){
                System.out.println("Levanto con numero 9000 Auto " + "\n");
		return 91000;
         	}

	/**
	 * 
	 * @param numreclamo
	 */
         @Override
	public String consultar(int numreclamo){
		return "Activo Auto";
	}

	/**
	 * 
	 * @param numreclamo
	 */
         @Override
	public int cerrar(int numreclamo){
		return 0;
	}

}