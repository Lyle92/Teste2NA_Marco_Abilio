
package testedespesas;

class RegDespController {
    
    public RegDespController(){ 
    }
    
    public void novaDespesa(float valor, String descricao){
        new Despesa(valor,descricao);
    }
    
    
}
