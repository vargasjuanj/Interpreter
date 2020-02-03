package ast;

import java.util.List;

public class If implements ASTNode {
private ASTNode condition;
private List<ASTNode> body;
private List<ASTNode> elsebody;

    public If(ASTNode condition, List<ASTNode> body, List<ASTNode> elsebody) {
        this.condition = condition;
        this.body = body;
        this.elsebody = elsebody;
    }
    public Object execute(){
        if((boolean)condition.execute()){
            for (ASTNode n : body) {
                n.execute();
            }
        }else{
            for (ASTNode n : elsebody) {
                n.execute();
            }
        }
        return null;
    }

}