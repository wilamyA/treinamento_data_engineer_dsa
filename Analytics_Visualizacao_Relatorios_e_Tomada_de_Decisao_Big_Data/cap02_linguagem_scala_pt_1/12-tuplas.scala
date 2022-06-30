// Tuplas

// A tupla em Scala é uma estrutura de dados que combina um número fixo de itens.
// Ao contrário de uma lista, uma tupla pode conter objetos com tipos diferentes, mas também são imutáveis.

def main(args: Array[String]) = {

   println("Exemplo 1:")

   // Cria uma tupla com dados do mesmo tipo
   val t = (100, 200, 300, 400)

   // Soma os elementos da tupla
   val soma = t._1 + t._2 + t._3 + t._4

   // Print
   println( "Soma dos elementos: " + soma )

   println("Exemplo 2:")

   // Cria uma tupla com dados de diferentes tipos
   val tupla = new Tuple3(10, "hello", 'A')

   // Imprime todo o conteúdo da tupla
   println(tupla)

   println("Exemplo 3:")

   // Cria uma tupla com dados do mesmo tipo
   val t_num = (4,3,2,1)
      
   // Loop para imprimir cada elemento da tupla
   t_num.productIterator.foreach { i => println("Valor = " + i )}

   println("Exemplo 4:")

   // Cria uma tupla com dados de diferentes tipos
   val t_mix = new Tuple4('Z', "Hello", 10, 45D)
      
   println("Concatena todos os elementos como string: " + t_mix.toString() )

   println("Exemplo 5:")

   // Cria uma tupla com dados de diferentes tipos
   val t_mix2 = new Tuple5('Z', "Hello", 10, 45D, "Teste")
      
   // Loop para imprimir cada elemento da tupla convertendo para string
   t_mix2.productIterator.foreach { i => println("Valor = " + i.toString() )}

   println("Exemplo 6:")

   // Cria uma tupla com dados de diferentes tipos
   val t2 = new Tuple2("Scala", "Hello")
      
   // Loop para imprimir cada elemento da tupla convertendo para string
   println("Elementos com ordem invertida: " + t2.swap )


}
