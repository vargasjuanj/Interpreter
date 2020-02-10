

import java.util.Map;

public class VarRef implements ASTNode {
    private String name;

 



    public VarRef(String name) {
        this.name = name;
    }


    @Override
    public Object execute(Map<String,Object> symbolTable) {
      return symbolTable.get(name);
  
    }


}