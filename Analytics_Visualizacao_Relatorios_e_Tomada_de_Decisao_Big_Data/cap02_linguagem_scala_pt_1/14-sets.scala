// Sets

// Set é uma coleção de elementos diferentes do mesmo tipo. Em outras palavras, um Set é uma coleção que não contém elementos 
// duplicados. Existem dois tipos de Sets, os imutáveis e os mutáveis. A diferença entre objetos mutáveis e imutáveis é que quando um 
// objeto é imutável, o objeto não pode ser alterado.

// Por padrão, Scala usa Set imutável. Se você quiser usar o Set mutável, terá que importar a classe:
// scala.collection.mutable.Set explicitamente. Se você quiser usar Sets mutáveis e imutáveis no mesmo programa, você pode 
// continuar a referir-se ao Set imutável apenas como Set, e pode referir-se ao conjunto mutável como mutable.Set.

import scala.collection.SortedSet

def main(args: Array[String]) = {

   println("Exemplo 1:")

   val set_linguagens = Set("C", "C++", "Java", "Scala", "PHP", "Python")

   println("Set Print 1:")
   println(set_linguagens)

   println("Set Print 2:")
   for(linguagem <- set_linguagens)
   {
      println(linguagem)
   }

   println("Exemplo 2:")

   println("Set Imutável:")
   val numeros = Set(1, 6, 2, 12, 7, 3, 11)
   numeros.foreach((item:Int) => println(item))

   // Não pode ser feito
   // numeros += (10,50)

   println("Set Mutável:")
   var numeros_mut = scala.collection.mutable.Set[Int](1, 6, 2, 12, 7, 3, 11)
   numeros_mut += (10,50)
   numeros_mut.foreach((item:Int) => println(item))

   println("Exemplo 3:")
   
   // Vamos ordenar o set anterior
   val numeros_sorted: SortedSet[Int] = SortedSet[Int]() ++ numeros_mut
   numeros_sorted.foreach((item:Int) => println(item))

   println("Exemplo 4:")

   val conjunto1 = Set(15,16,19,220,330,445)
   val conjunto2 = Set(150,160,19,220,315,555)

   println( "conjunto1.intersect(conjunto2): " + conjunto1.intersect(conjunto2) )

}





