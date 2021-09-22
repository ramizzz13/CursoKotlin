const val PI = 3.1416

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")

    //Variable de lectura y escritura
    var dinero = 10
    println(dinero)
    dinero = 5
    println(dinero)

    //Variable de solo lectura
    val nombre = "Maria"
    println(nombre)

    println(PI)
}