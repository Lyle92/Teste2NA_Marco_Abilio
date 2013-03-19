
package testedespesas;

import java.util.Scanner;

public class Menu {
    
    public Menu(){
        
        Scanner ler = new Scanner (System.in);
        boolean flag = false ;
        
        do{
            System.out.println("\nMenu:\n"); 
            System.out.println(" [1] Registar Despesa;"); 
            System.out.println(" [0] Sair."); 
            System.out.print("\nIntrduza a sua opção: ");
            
            String selecao = ler.next();     

            switch (selecao){
               case "1":System.out.println("\n* Registar Despesa *");
                    new RegDespUI();
                    flag = true;
                    break;
                             
               case "0":System.out.println("Exit Successful");
                    System.exit(0);
                   
               default:System.out.println("\n\n\nPor favor introduza uma opção válida:");
            }
        }while(flag == false);  
    }
}
