package ast;

public class Multiplication implements ASTNode {

    private final ASTNode operand1;
    private final ASTNode operand2;

    public Multiplication(final ASTNode operand1, final ASTNode operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public Object execute() {

        return (int)operand1.execute()*(int)operand2.execute();

    }
}