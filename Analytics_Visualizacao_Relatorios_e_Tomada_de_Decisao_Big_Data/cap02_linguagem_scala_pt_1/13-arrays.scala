// Arrays

// Scala fornece uma estrutura de dados, o array, que armazena uma coleção de tamanho fixo de elementos do mesmo tipo. 
// Uma matriz (array) é usada para armazenar uma coleção de dados, mas geralmente é mais útil pensar em uma matriz 
// como uma coleção de variáveis do mesmo tipo.
// O array é mutável, ao contrário da lista e da tupla, e pode ter n dimensões.

def main(args: Array[String]) = {

   println("Exemplo 1:")

   // Cria um array 
   var arr1 = Array("Portugal", "Espanha", "Holanda")

   // Print
   for ( x <- arr1 ) {
         println( x )
      }

   println("Exemplo 2:")

   // Cria um array
   var arr2 = Array(2.3, 1.7, 4.6, 3.8)

   // Variável para armazenar o total
   var total = 0.0;

   // Soma dos elementos
   for ( i <- 0 to (arr2.length - 1)) {
         total += arr2(i);
   }
      
   println("O Total é: " + total);
   println("O Total é: " + total.toInt);

   println("Exemplo 3:")

   /// Cria um array
   var arr3 = Array(2.3, 1.7, 4.6, 3.8)

   // Variável com o maior valor (consideramos o elemento de índice zero para começar)
   var max = arr3(0);

   // Loop para encontrar o maior valor
   for ( i <- 1 to (arr3.length - 1) ) {
         if (arr3(i) > max) 
            max = arr3(i);
   }
      
   println("O maior valor é: " + max);

   println("Exemplo 4:")

   // Cria um array multidimesional
   var arr_4 = Array.ofDim[Int](3,3)

   // Carrega o array
   for (i <- 0 to 2) {
      for (j <- 0 to 2) {
         arr_4(i)(j) = j;
      }
   }

   // Imprime a matriz
   for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
         print(" " + arr_4(i)(j));
      }
      println();
   }

   // Altera alguns valores do array
   arr_4(0)(0) = 1   
   arr_4(0)(1) = 2
   arr_4(0)(2) = 3

   println();

   // Imprime a matriz
   for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
         print(" " + arr_4(i)(j));
      }
      println();
   }

   println("Exemplo 5:")

   // Cria dois arrays
   var arr_5 = Array(1.9, 2.9, 3.4, 3.5)
   var arr_6 = Array(8.9, 7.9, 0.4, 1.5)

   // Concatena os arrays
   var arr_7 =  arr_5.concat(arr_6)
      
   // Print 
   for ( x <- arr_7 ) { 
      println( x )
   }

   println("Exemplo 6:")

   // Cria um array com range
   var arr_8 = Array.range(10, 20, 2)

   // Print
   for ( x <- arr_8 ) {
      print( " " + x )
   }

   println();

}





