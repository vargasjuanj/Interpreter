package Expr;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;

//Fichero ejecutable
public class Testear {

    public static void main(String[] args) throws IOException {
    String inputFile=null;
    if(args.length>0) inputFile=args[0]; //Si viene al menos un parametro sera el archivo y lo almacenamos en el inputFile
    InputStream is =System.in;       //Si no viene nada se continua con la entrada estandar    
    if(inputFile!=null){             //Entonces si el inputFile no es nulo se abre el fichero
        is=new FileInputStream(inputFile); //Entrada estandar de fichero 
    }

    //Parte de Antlr
    ANTLRInputStream input = new ANTLRInputStream(is); //Abrimos el stream de datos sin importar si fue un fichero o un parametro (System.in)
//Usamos el Lexer y el parser para empezar a trabajar
ExprLexer lexer = new ExprLexer((CharStream) input);
CommonTokenStream tokens = new CommonTokenStream(lexer); //Conectamos
ExprParser parser = new ExprParser(tokens); //El parser va a funcionar con los tokens que yo recibo


}

}
