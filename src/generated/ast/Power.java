package ast;

import java.util.Map;

public class Power implements ASTNode {

    private ASTNode operand1;
    private ASTNode operand2;

    public Power(ASTNode operand1, ASTNode operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public Object execute(Map<String,Object> symbolTable) {
        int aux=1;
        int aux1= (int) operand1.execute(symbolTable);
        int aux2 = (int) operand2.execute(symbolTable);

for (int i=0; i<aux2; i++){
   aux*=aux1;
}
return aux;

    }
}