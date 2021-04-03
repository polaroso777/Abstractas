

/**
 * @author Jsilva
 * @version 1.0
 * @created 27-mar.-2021 06:11:47 p. m.
 */
package abstractasinterfaces;
 
public abstract class Producto {

	private float precio;
        private String material;

	public Producto(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param precio
	 */
	public Producto(float precio, String material){
            this.precio = precio;
            this.material = material;
	}

	public float getprecio(){
		return precio;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setprecio(float newVal){
		precio = newVal;
	}

	public String getmaterial(){
		return material;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setmaterial(String newVal){
		material = newVal;
	}
        
	/**
	 * 
	 * @param regalo
	 */
	public abstract int maxArticulos(int regalo);

}