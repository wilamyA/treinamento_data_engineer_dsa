// Tipos de Dados

// Função main
def main(args: Array[String]) =

    // Variáveis e Constantes
    var a: Byte = 1
    var b: Int = 5
    val c: Long = 10000
    var d: Short = 4
    val e: Double = 2.0
    val f: Float = 3.0
    var g: String = "Hello"
    var h: Char = 'A'
    var i = 123   
    val j = 1.0 
    var l = 1_000L   
    val m = 2.2D     
    val n = 3.3F  
    var o = BigInt(1_234_567_890_987_654_321L)
    var p = BigDecimal(123_456.789)
    val q = List(1, 2, 3)

    println("Variável do tipo Byte: " + a)
    println("Variável do tipo Int: " + b)
    println("Variável do tipo Long: " + c)
    println("Variável do tipo Short: " + d)
    println("Variável do tipo Double: " + e)
    println("Variável do tipo Float: " + f)
    println("Variável do tipo String: " + g)
    println("Variável do tipo Char: " + h)
    println("Variável do tipo Int (Inferência): " + i)
    println("Variável do tipo Double (Inferência): " + j)
    println("Variável do tipo Long: " + l)
    println("Variável do tipo Double: " + m)
    println("Variável do tipo Float: " + n)
    println("Variável do tipo BigInt: " + o)
    println("Variável do tipo BigDecimal: " + p)
    println("Estrutura de Dados do Tipo Lista: " + q)
    println("Segundo Elemento da Lista: " + q(1))
