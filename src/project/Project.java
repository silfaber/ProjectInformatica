/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author 011412
 */
public class Project {

    
     public static void main(String[] args) {
        // TODO code application logic here
         
         printFunctie(" 5! is ",faculteitFunctie(5));
    }
    
    
    /**
     * @param args the command line arguments
     */
  
    public static void printFunctie(String tekst,int getal){
        System.out.println(tekst+getal);
    }

    /**
     *
     */
    public static int faculteitFunctie (int getal){
       if (getal == 1)  {
           return 1;}
       
       return getal * faculteitFunctie(getal - 1);
       
       
          
           
           
    }
    
}
        
        
    
    

       