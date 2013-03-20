
package testedespesas;

class RegDespController {
    
    public RegDespController(){ 
    }
    
    public boolean novaDespesa(float valor, String descricao){
        return new DesRepositorio().gravar(new Despesa(valor,descricao));
    }
    
}
