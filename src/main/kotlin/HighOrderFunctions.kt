fun main(args: Array<String>) {
    val largoDelValorInicial = superFuncion(valorInicial = "Hola!") { valor ->
        valor.length
    }
    println(largoDelValorInicial)

    val lambda: () -> String = functionInception("Enrique")
    val valorLambda: String = lambda()
    println(valorLambda)
}

fun superFuncion (valorInicial: String, block : (String)-> Int) : Int {
    return block (valorInicial)
}

fun functionInception(nombre : String) : () -> String {
    return {
        "Hola desde la lambda $nombre"
    }
}
