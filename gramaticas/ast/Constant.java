package ast;


public class Constant implements ASTNode {

    private Object data;

    public Constant(Object data) {
        this.data = data;
    }

    @Override
    public Object execute() {
        return data;
    }
    
}