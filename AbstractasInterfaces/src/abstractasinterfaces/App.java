

/**
 * @author Jsilva
 * @version 1.0
 * @created 27-mar.-2021 07:52:40 p. m.
 */
package abstractasinterfaces;

public class App {

	public App(){

	}

	public void finalize() throws Throwable {

	}

        public void usarAuto() {
            int numreclamo;
            
            Reclamaciones auto = new Auto();
            numreclamo = auto.levantar();
            auto.consultar(numreclamo);
            auto.cerrar(numreclamo);
        }

        public void usarUber(int socio) {
            int numreclamo;

            Reclamaciones auto = new AutoUberAdaptador(socio);
            numreclamo = auto.levantar();
            auto.consultar(numreclamo);
            auto.cerrar(numreclamo);
        }
        
        
}