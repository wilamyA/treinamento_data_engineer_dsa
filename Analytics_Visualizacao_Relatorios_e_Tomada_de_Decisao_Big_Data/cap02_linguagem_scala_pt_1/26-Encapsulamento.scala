// Encapsulamento

// O encapsulamento é um dos conceitos fundamentais na programação orientada a objetos. 
// Ele descreve a ideia de agrupar dados e métodos que funcionam nesses dados dentro de uma classe.

import scala.collection.mutable.ArrayBuffer

// Cria uma classe com construtor
class Alimento(nomeAlimento: String = "carne") {
  val nome: String = nomeAlimento
}

// Cria uma classe
class Jantar(prato_principal: Alimento, menu: ArrayBuffer[String]) {

  // Método privado (pode ser usado somente dentro da classe)
  private def getMenu: String = {
    menu.mkString(", ")
  }

  // Método público
  def getMenuDesc: String = {
    s"Este jantar terá ${prato_principal.nome} e $getMenu como sobremesa"
  }

  // Método público
  def addMenu(extraItem: String): Unit = {
    menu.append(extraItem)
  }

}

// Função main
def main(args: Array[String]) = {
        
  // Observe como criamos o objeto
  val jantar_dia_dos_namorados = new Jantar(new Alimento("salmon"), ArrayBuffer("alcaparras"))

  // Chama um método da classe
  jantar_dia_dos_namorados.addMenu("chocolate")

  // Chama um método da classe
  println(jantar_dia_dos_namorados.getMenuDesc)

  // Isso não funciona
  // println(jantar_dia_dos_namorados.getMenu)

  // Isso não funciona
  // println(jantar_dia_dos_namorados.prato_principal)

}

 



