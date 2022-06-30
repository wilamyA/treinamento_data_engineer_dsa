// Herança

// A herança é um mecanismo que permite derivar uma classe de outra, permitindo que a classe derivada reutilize 
// atributos e métodos da classe primária. A classe que herda os atributos e métodos é chamada de subclasse, enquanto a classe 
// que os fornece é chamada de superclasse. A subclasse herdará todos os atributos e métodos não privados definidos na superclasse.

// Superclasse
class Veiculo(val numRodas: Int, val cor: String) {

  // Método
  def accelerate(): Unit = { println("Acelerando...") }

}

// Subclasse
class Bike(corBike: String, val tipoBike: String) extends Veiculo(2, corBike) {

  // Método
  def maxSpeed(): Int = {
    tipoBike match {
      case "estrada" => 60
      case _ => 20
    }
  }
}

// Função main
def main(args: Array[String]) = {
        
  // Cria objeto
  val bike1 = new Bike("vermelha", "estrada")
  
  // Chama o método da superclasse
  bike1.accelerate()

  // Chama o atributo da superclasse
  println("A bike " + bike1.cor)

  // Chama o atributo da subclasse
  println("na "+ bike1.tipoBike)

  
}

 



