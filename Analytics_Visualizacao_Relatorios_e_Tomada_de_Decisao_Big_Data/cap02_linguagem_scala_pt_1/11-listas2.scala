// Listas

// Listas em Scala são objetos imutáveis e devem ter dados do mesmo tipo

def main(args: Array[String]) = {

   println("Exemplo 1:")

   // Cria uma lista 
   val x = List(1, 2, 3)

   // Imprime os elementos da lista
   x.foreach { println }

   println("Exemplo 2:")

   // Variável escalar
   var soma = 0

   // Para cada elemento da lista, somamos o elemento à variável soma e imprimimos o resultado
   x.foreach(soma += _)
   println(soma)

   println("Exemplo 3:")

   // Podemos usar "For Comprehension" em Scala
   val nomes = List("Ronaldo", "Zico", "Joe", "Julia", "Kim")
   for (nome <- nomes) println(nome)

   println("Exemplo 4:")

   // Podemos usar "For Comprehension" em Scala para filtrar elementos
   for (nome <- nomes if nome.startsWith("J")) println(nome)

   println("Exemplo 5:")

   // Loop pela lista
   for (nome <- nomes) {
     
     // Converte cada elemento para maiúsculo e salva em uma variável
     val nome_maiusculo = nome.toUpperCase
     println(nome)
     println(nome_maiusculo)
   }

   println("Exemplo 6:")
   
   // Loop pela lista com condicional
   for (contador <- 0 until nomes.length) {
     
      if( nomes(contador) == "Kim" ){
         println("Kim está na posição " + contador + " da lista de nomes.");
      } else {
         println("Kim não está na posição " + contador + " da lista de nomes.");
      } 
   }


}
