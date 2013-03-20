
package testedespesas;

import java.util.ArrayList;
import java.util.List;

public class DesRepositorio {
   
    private List <Despesa> listaDespesas = new ArrayList<>();
    
    public DesRepositorio(){
    }
    
    public boolean gravar (Despesa d){
        return listaDespesas.add(d);
//        return false;
    }
}
