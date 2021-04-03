

/**
 * @author Jsilva
 * @version 1.0
 * @created 27-mar.-2021 06:53:37 p. m.
 */

package abstractasinterfaces;
 
public class Monitor extends Producto {

	public Monitor(){
            super();

	}

         public Monitor(float precio){
            super(precio, "Monitor");
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
		return 2;
            }
            else
            {
		return 1;
            }
	}

}