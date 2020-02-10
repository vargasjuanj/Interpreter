

import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main{
    public static void main(String[] args) throws Exception {
        System.out.println("Inicia la interpretacion");
        String inputFile = null;
        if(args.length>0) inputFile= args[0];

//Fuerza la carga del fichero de preubas
inputFile = "C:/antlr/source.smp";

        InputStream is = System.in;
        if (inputFile != null ) is= new FileInputStream(inputFile);
        
        CharStream input = CharStreams.fromStream(is);
        SimpleLexer lexer = new SimpleLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleParser parser = new SimpleParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.program();

       MyVisitor mv = new MyVisitor();
       mv.visit(tree);
System.out.println("Finaliza la interpretacion");
    }
}