// POO

// Cria uma classe
class Alimento {
  val nome: String = "carne"
  var peso: Int = 1
}

// Função main
def main(args: Array[String]) = {
      
    // Cria o objeto
    val file_mignon = new Alimento

    // Modifica o valor de um atributo do objeto
    file_mignon.peso = 2

    // Print
    println("Peso do filé: " + file_mignon.peso)

}

  



