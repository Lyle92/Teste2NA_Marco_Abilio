
package testedespesas;

import java.util.Scanner;

public class RegDespUI {
    
    public RegDespUI(){

        new RegDespController().novaDespesa(valor(), descricao());
        System.out.println("\nDespesa gravada com sucesso."); 
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
