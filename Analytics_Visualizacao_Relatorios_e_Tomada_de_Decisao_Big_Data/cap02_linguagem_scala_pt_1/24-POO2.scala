// POO

// Cria uma classe com construtor
class Alimento(nomeAlimento: String = "carne") {
  val nome: String = nomeAlimento
}

// Função main
def main(args: Array[String]) = {
      
    // Cria o objeto
    val peixe = new Alimento("salmon")

    // Print
    println("O alimento é: " + peixe.nome)

}


