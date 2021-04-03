

/**
 * @author Jsilva
 * @version 1.0
 * @created 27-mar.-2021 06:30:01 p. m.
 */
package abstractasinterfaces;

public class Libro extends Producto {


	public Libro(){
            super();
	}

        public Libro(float precio){
            super(precio, "Libro");
	}
        
	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param regalo
	 */
	public int maxArticulos(int regalo){
            if(regalo == 0) {
		return 10;
            }
            else
            {
		return 1;
            }
	}

}