/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractasinterfaces;

/**
 *
 * @author Jsilva
 */



public class AbstractasInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 //         Producto productoabs =new Producto(500);
        // ejemplo ter
        // ejemplo gof
        
        //ejemplo de cambio al versionador
         // codigo de prueba
         int paso2 = 0;
         
         
         
         
  
          Producto  libro= new Libro(500);
          Producto monitor= new Monitor(1500);
          
          System.out.println("El material es de tipo: " + libro.getmaterial() + " y su precio es de: "+ libro.getprecio() + "\n");
          
          
          System.out.println("El material es de tipo: " + monitor.getmaterial() + " y su precio es de: "+ monitor.getprecio() + "\n");
          
          
          App appAuto = new App();
          appAuto.usarAuto();
          
          appAuto.usarUber(2528);
          
          
//          Iproducto ip = new Iproducto();
          Iproducto ip;
          Librodei librointerfaz = new Librodei();
          videodei videointerfaz = new videodei();
          
          ip = librointerfaz;
          
          System.out.println("Tipo de interfaz libro: " + ip.maxarticulos() + "\n");
          
          ip = videointerfaz;
          System.out.println("Tipo de interfaz video: " + ip.maxarticulos() + "\n");
          
          
    }
    
}

    