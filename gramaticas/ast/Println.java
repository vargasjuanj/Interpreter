package ast;

public class Println implements ASTNode {

    private ASTNode data;


    public Println(ASTNode data) {
        this.data = data;

    }

    public Object execute() {
System.out.println(data.execute());
        return null;

    }
}