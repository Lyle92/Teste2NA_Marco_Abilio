
package testedespesas;

import java.util.Scanner;

public class RegDespUI {
    
    public RegDespUI(){
        
        boolean sucesso = new RegDespController().novaDespesa(valor(), descricao());
        if(sucesso){
            System.out.println("\nDespesa gravada com sucesso.\n");
        }else{
            System.out.println("\nERRO - A Despesa não foi gravada com sucesso.\n") ;
        } 
    }
    
    Scanner ler = new Scanner (System.in);
    private float valor(){
        System.out.print("\n- Intrduza valor: ");    
        return ler.nextFloat(); 
    }
    private String descricao(){
        System.out.print("\n- Intrduza decrição: ");    
        return ler.next(); 
    }
}
