package ast;

import java.util.Map;

public class Multiplication implements ASTNode {

    private final ASTNode operand1;
    private final ASTNode operand2;

    public Multiplication(final ASTNode operand1, final ASTNode operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public Object execute(Map<String,Object> symbolTable) {

        return (int)operand1.execute(symbolTable) * (int) operand2.execute(symbolTable);

    }
}