// Listas

// Listas em Scala são objetos imutáveis e devem ter dados do mesmo tipo

def main(args: Array[String]) = {

   // Cria uma lista de strings
   val frutas: List[String] = List("laranja", "melancia", "abacaxi", "goiaba")

   // Cria uma lista de números
   val numeros: List[Int] = List(1, 2, 3, 4)

   // Cria uma variável escalar
   val nums = Nil

   // Inválido:
   // val mix: List[String] = List(1, "melancia")

   println( "Tamanho da lista de frutas: " + frutas.length )
   println( "Head da lista de frutas: " + frutas.head )
   println( "Tail da lista de frutas: " + frutas.tail )
   println( "Reverse da lista de frutas: " + frutas.reverse )
   println( "Checa se a lista de frutas está vazia : " + frutas.isEmpty )
   println( "Checa se a variável está vazia : " + nums.isEmpty )
   println( "Primeiro elemento da lista de números : " + numeros(0) )
   println( "Segundo elemento da lista de números : " + numeros(1) )
   println( "Soma da lista de números : " + numeros.sum )
   println( "Valor máximo da lista de números : " + numeros.max )
   println( "Valor mínimo da lista de números : " + numeros.min )

}
