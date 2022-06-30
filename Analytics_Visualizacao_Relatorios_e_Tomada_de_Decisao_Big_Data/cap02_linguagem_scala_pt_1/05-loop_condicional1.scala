// Loop While e Condicional If

// Função que recebe uma string como argumento
@main def principal(args: String*) =

    // Variável
    var i = 0

    // Loopp
    while i < args.length do

      // Condicional
      if i != 0 then
        print(" ")

      print(args(i))
      
      i += 1

    println()
