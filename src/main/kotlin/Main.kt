const val PI = 3.1416

fun main(args: Array<String>) {
/*    println("Hello World!")

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

    val boolean = true
    val numeroLargo = 3L
    val double = 2.7182
    val float = 1.1f

    val primerValor = 20
    val segundoValor = 10
    val tecerValor = primerValor - segundoValor
    val cuartoValor = primerValor.minus(segundoValor)
    println(tecerValor)
    println(cuartoValor)

    val apellido = "Perez"
    val nombre2 = "Ramiz"
    val nombreCompleto = "Mi nombre es $nombre2 $apellido"
    println(nombreCompleto)*/

    val nombre = "Maria"

    /*if(nombre.isNotEmpty()){
        println("El largo de nuestra variable nombre es ${nombre.length}")
    }else {
        println("Error, la variable esta vacia")
    }*/

    if(nombre.isNotEmpty()) println("El largo de nuestra variable nombre es ${nombre.length}") else println("Error, la variable esta vacia")

/*    var mensaje : String
    if (nombre.length > 4){
        mensaje = "Tu nombre es largo!"
    } else {
        mensaje = "Tienes un nombre corto"
    }*/

    val mensaje : String = if (nombre.length > 4){
        "Tu nombre es largo!"
    } else if (nombre.isEmpty()){
      "Nombre esta vacio"
    } else {
        "Tienes un nombre corto"
    }
    println(mensaje)
}