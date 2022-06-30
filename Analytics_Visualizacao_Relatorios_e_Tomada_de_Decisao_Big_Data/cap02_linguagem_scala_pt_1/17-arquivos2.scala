// Manipulação de Arquivos

// Leitura de Arquivo

import scala.io.Source

def main(args: Array[String]) = {

   // Define o arquivo a ser lido
   val fname1 = "linguagens.txt" 
   
   // Define o arquivo como fonte
   val fSource1 = Source.fromFile(fname1) 
      
   // Loop pela fonte de dados e imprime o próximo elemento, caracter a caracter
   while (fSource1.hasNext)
   {
      println(fSource1.next)
   }
   
   println() 

   // Loop pela fonte de dados e imprime cada linha
   val fname2 = "linguagens.txt" 
   val fSource2 = Source.fromFile(fname2) 

   for(line <- fSource2.getLines)
   { 
      println(line) 
   } 
  
   // Fecha a fonte
   fSource1.close() 
   fSource2.close() 


}





