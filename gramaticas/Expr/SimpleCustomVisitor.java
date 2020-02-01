package Expr;

import Expr.ExprParser.AddContext;
import Expr.ExprParser.IntContext;
import Expr.ExprParser.MultContext;

//Visitor especifico para calcular expresiones
public class SimpleCustomVisitor extends ExprBaseVisitor<Integer> {
  
    @Override
    public Integer visitAdd(AddContext ctx) {
        return visit(ctx.e(0))+visit(ctx.e(1));
        
    }

    @Override
    public Integer visitMult(MultContext ctx) {
        return visit(ctx.e(0))*visit(ctx.e(1));
        
    }

    @Override
    public Integer visitInt(IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
        
    }
    
    
}
