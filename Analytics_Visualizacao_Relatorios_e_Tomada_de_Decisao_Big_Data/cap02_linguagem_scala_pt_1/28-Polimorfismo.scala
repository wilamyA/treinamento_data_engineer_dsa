// Polimorfismo

// Polimorfismo é a capacidade de uma linguagem POO de processar dados de forma diferente dependendo de seus tipos de entradas. 
// Há dois tipos principais de polimorfismo: sobrecarga de método e substituição de método.

// Superclasse
class Veiculo(val numRodas: Int, val cor: String) {

  // Método
  def accelerate(): Unit = { println("Acelerando...") }

}

// Subclasse
class Bike(corBike: String, val tipoBike: String) extends Veiculo(2, corBike) {

  // Substituição de Método
  override def accelerate(): Unit = { println("Acelerando com Moderação...") }

  // Método
  def maxSpeed(): Int = {
    tipoBike match {
      case "estrada" => 60
      case _ => 20
    }
  }

  // Mesmo método anterior mas com outra especificação (sobrecarga de método)
  def maxSpeed(limiteVelocidade: Int): Int = {
  tipoBike match {
    case "estrada" => if(limiteVelocidade < 60) limiteVelocidade else 60
    case _ => if(limiteVelocidade < 20) limiteVelocidade else 20
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
  println("A bike "+ bike1.cor)

  // Chama o atributo da subclasse
  println("na "+ bike1.tipoBike)

  // Cria objeto
  val bike2 = new Bike("verde", "cidade")
  
  // Chama o método da superclasse
  bike2.accelerate()

  // Chama o método da subclasse
  bike2.maxSpeed()

  // Chama o método da subclasse
  bike2.maxSpeed(60)

  // Chama o atributo da superclasse
  println("A bike "+ bike2.cor)

  // Chama o atributo da subclasse
  println("na "+ bike2.tipoBike)



  

}

 



