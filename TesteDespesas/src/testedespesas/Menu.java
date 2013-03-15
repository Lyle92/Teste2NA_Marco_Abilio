/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testedespesas;

/**
 *
 * @author MNLyle
 */
public class Menu {
    
    public Menu(){
        System.out.println("Menu:\n Intrduza a sua opção"); 
        System.out.println("[1] Registar Desesa"); 
        System.out.println("[0] Sair"); 
        
        System.out.println("Selection: "); 
        int selection=scanner.nextInt();     
       
       switch (selection){
             
           case 1:System.out.println("Registar Desesa");
                break;
         
             
        
           case 0:System.out.println("Exit Successful");
                System.exit(0);
                        
           default:System.out.println("Por favor introduza uma opção válida:");
           
       };
        
    }
}
