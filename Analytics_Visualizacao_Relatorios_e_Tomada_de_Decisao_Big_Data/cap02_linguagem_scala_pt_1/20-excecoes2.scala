// Tratamento de Exceções

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

def main(args: Array[String]) = {
      try {
         val f = new FileReader("arquivo5.txt")
      } catch {
         case ex: FileNotFoundException => {
            println("Arquivo não encontrado")
         }
         
         case ex: IOException => {
            println("IO Exception")
         }
      } finally {
         println("Nada mais a fazer...")
      }
   }