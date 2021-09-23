fun main(args: Array<String>) {
    val myLambda: (String) -> Int = { valor -> valor.length}
    val lambdaEjecutada: Int = myLambda("Hola Platzi")
    println(lambdaEjecutada)

    val saludos = listOf("Hello", "Hola", "Ciao")
    val longitudSaludos = saludos.map(myLambda)
    println(longitudSaludos)
}