// Tipos de Dados

// Função main
def main(args: Array[String]) =

    // Declara e atribui o valor da variável do tipo Int
    var a :Int = 10;

    // O tipo da variável é definido por inferência
    var b = 20;

    // Usamos val para criar constantes e não variáveis
    val nome = "Bob"
    val sobrenome :String = "Silva"
      
    // Print
    println("Primeira variável: " + a); println("Segunda variável: " + b); 
    println("Nome Completo: " + nome + sobrenome)
