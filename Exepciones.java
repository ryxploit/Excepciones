/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones;



/**
 *
 * @author Carlos leon
 */
public class Exepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Arit();
        arreglos();
        clasex();
       
    }

    public static void Arit() {
       try{
          int i=10/0;
       }catch(ArithmeticException ex){
 ex.printStackTrace(System.err);       
       }
           
    }
    public static void arreglos(){
        try{
               int [] array = new int[20];
		         array[-3] = 24;//Error de índice en un array	
        }catch(ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace(System.err); 
        }
    }
    public static void clasex(){
        //un objeto a una subclase de la que no es una instancia
        try{
          Object x = new Integer(0);
     System.out.println((String)x);
        }catch(ClassCastException ex){
     ex.printStackTrace(System.err);
        }
    }
  

}
