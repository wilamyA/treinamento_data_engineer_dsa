// Maps

// Map é uma coleção de pares chave/valor. Qualquer valor pode ser recuperado com base em sua chave. As chaves são exclusivas no Map, 
// mas os valores não precisam ser exclusivos. Os maps também são chamados de tabelas de hash. Existem dois tipos de maps, 
// os imutáveis e os mutáveis, em linguagem Scala.

// Por padrão, Scala usa o map imutável. Se você quiser usar o map mutável, terá que importar a classe:
// scala.collection.mutable.Map explicitamente. Se você quiser usar maps mutáveis e imutáveis no mesmo programa, 
// então você pode continuar a se referir ao map imutável como Map, mas você pode se referir ao map mutável como mutable.Map.

// https://docs.scala-lang.org/overviews/collections/maps.html

def main(args: Array[String]) = {

   println("Exemplo 1:")

   val cores = Map("Vermelho" -> "#FF0000", "Azul" -> "#F0FFFF", "Laranja" -> "#CD853F")

   println( "Chaves : " + cores.keys )
   println( "Valores : " + cores.values )
   println( "Verifca se o mapa de cores está vazio : " + cores.isEmpty )

   println("Exemplo 2:")

   cores.keys.foreach{ i => 
      print("Chave = " + i ) 
      println(", Valor = " + cores(i)) 
   }

   println("Exemplo 3:")

   if( cores.contains( "Vermelho" )) {
      println("Vermelho existe no Map com o valor :"  + cores("Vermelho"))
   } else {
      println("Vermelho não está no Map.")
   }

   println("Exemplo 4:")

   // Cuidado para não confundir com o método map()

   val lista = List(1, 2, 3, 4, 5, 6, 7)

   // Calcula o quadrado de cada número
   val nova_lista = lista.map(x => x * x )
  
   println(nova_lista)


}





