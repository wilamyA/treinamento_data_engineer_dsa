// Loop While e Condicional If com {}

// Função que recebe uma string como argumento
@main def principal(args: String*) = {
    var i = 0;
    while (i < args.length) {
      if (i != 0) {
        print(" ");
      }
      print(args(i));
      i += 1;
    }
    println();
  }