// Tratamento de Exceções

// Classe MyCustomException que estende as funcionalidades da classe Scala Exception
class MyCustomException(s: String) extends Exception(s) {}  

// Classe customizada para tratamento de exceção
class MyCustomExceptionExample {  
    @throws(classOf[MyCustomException])  
    def validate(idade: Int) = {  
        if (idade < 0) {  
            throw new MyCustomException("Idade precisa ser positiva!")  
        }
    }  
}  

// Objeto para executar a função main() com a classe de tratamento customizado de exceções
object MyObject {  
    def main(args: Array[String]) = {  
        var custom_exception = new MyCustomExceptionExample()  
        try {  
            custom_exception.validate(-10)  
        } catch {  
            case e: Exception => println("Ocorreu a seguinte exceção => " + e)  
        }  
    }  
}  