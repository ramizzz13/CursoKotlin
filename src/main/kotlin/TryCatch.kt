fun main(args: Array<String>) {
    var nombre : String? = null
    try {
        throw NullPointerException("Referencia nula")
    } catch (exception: NullPointerException){
        println("Ha ocurrido un error")
    } finally {
        println("Finalment ha ocurrido un error... Cerrando aplicacion")
    }

    val primerValor = 10
    val segundoValor = 0
    val resultado : Int = try { primerValor / segundoValor } catch (exception : Exception) { 0 }
    println(resultado)
}