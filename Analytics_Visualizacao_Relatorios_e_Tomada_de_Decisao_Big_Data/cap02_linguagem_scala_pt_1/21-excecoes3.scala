// Tratamento de Exceções

import java.io.IOException

def main(args:Array[String]) =
    {  
        try
        {
            var N = 5/0 
        } 
        catch 
        {
            case i: IOException => 
            {
                println("IOException.")
            }
            case a: ArithmeticException => 
            {
                println("Arithmetic Exception.")
            }
   
        }
   
    }  