
import java.util.Map;

public class Constant implements ASTNode {

    private Object data;

    public Constant(Object data) {
        this.data = data;
    }

    @Override
    public Object execute(Map<String,Object> symbolTable) {
        return data;
    }
    
}