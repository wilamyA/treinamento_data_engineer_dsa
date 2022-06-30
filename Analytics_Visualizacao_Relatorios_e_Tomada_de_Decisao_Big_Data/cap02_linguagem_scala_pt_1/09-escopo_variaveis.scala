// Escopo de Variáveis

@main def printTabela() =

  var i = 1
  // este bloco é o escopo da variável i

  while i <= 10 do

    var j = 1
    // este  bloco é o escopo das variáveis i e j

    while j <= 10 do

      val p = (i * j).toString
      // este  bloco é o escopo das variáveis i, j e p

      var k = p.length
      // este  bloco é o escopo das variáveis i, j, p e k

      while k < 4 do
        print(" ")
        k += 1

      print(p)
      j += 1

    // este bloco é escopo das variáveis i e j; p e k estão fora de escopo neste bloco

    println()
    i += 1

  // aqui somente a variável i está em escopo
