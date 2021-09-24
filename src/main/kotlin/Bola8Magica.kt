//Declaramos los valores de nuestras respuestas
const val RESPUESTA_AFIRMATIVA = "✅"
const val RESPUESTA_NEGATIVA = "❌"
const val RESPUESTA_DUDOSA = "?"

//Unimos las respuestas con los valores

val respuestas = mapOf(
    "Si" to RESPUESTA_AFIRMATIVA,
    "Es cierto" to RESPUESTA_AFIRMATIVA,
    "Totalmente" to RESPUESTA_AFIRMATIVA,
    "Sin duda" to RESPUESTA_AFIRMATIVA,
    "Pregunta en otro momento" to RESPUESTA_DUDOSA,
    "No puedo decirte en este momento" to RESPUESTA_DUDOSA,
    "Puede que si o puede que no" to RESPUESTA_DUDOSA,
    "No va a suceder" to RESPUESTA_NEGATIVA,
    "No cuentes con ello" to RESPUESTA_NEGATIVA,
    "Definitivamente no" to RESPUESTA_NEGATIVA,
    "No lo creo" to RESPUESTA_NEGATIVA
)

fun main(args: Array<String>) {
    println("Hola soy tu bola 8 magica creada en Kotlin. Cual de estas opciones deseas realizar?")
    desplegarMenuInicial()
}

fun desplegarMenuInicial(){
    println()
    println("1. Realizar una pregunta")
    println("2. Revisar todas las respuestas")
    println("3. Salir")

    val valorIngresado = readLine()

    when(valorIngresado) {
        "1" -> realizarPregunta()
        "2" -> mostrarRespuestas()
        "3" -> salir()
        else -> mostrarError()
    }
}

fun realizarPregunta(){
    println("Que pregunta deseas realizar?")
    readLine()
    println("Asi que esa era tu pregunta... La respuesta a eso es: ")
    val respuestaGenerada = respuestas.keys.random()
    println(respuestaGenerada)
    desplegarMenuInicial()
}

fun mostrarRespuestas(){
    println("Selecciona una opcion:")
    println("1. Revisar todas las respuestas")
    println("2. Revisar solo las respuestas afirmativas")
    println("3. Revisar solo las respuestas negativas")
    println("4. Revisar solo las respuestas dudosas")

    val opcionIngresada = readLine()
    when(opcionIngresada){
        "1" -> mostrarRespuestasPorTipo()
        "2" -> mostrarRespuestasPorTipo(tipoRespuesta = RESPUESTA_AFIRMATIVA)
        "3" -> mostrarRespuestasPorTipo(tipoRespuesta = RESPUESTA_NEGATIVA)
        "4" -> mostrarRespuestasPorTipo(tipoRespuesta = RESPUESTA_DUDOSA)
        else -> println("Respuesta no valida. Adios.")
    }
    desplegarMenuInicial()
}

fun mostrarRespuestasPorTipo(tipoRespuesta : String = "TODOS"){

    val imprimirRespuestas : (Map<String, String>) -> Unit = { respuestas -> respuestas.keys.forEach { respuesta -> println(respuesta) }}
    when(tipoRespuesta){
        "TODOS" -> respuestas.keys.forEach { respuesta -> println(respuesta) }
        RESPUESTA_AFIRMATIVA -> respuestas.filterValues { values -> values == RESPUESTA_AFIRMATIVA }
            .also{imprimirRespuestas(it)}

        RESPUESTA_NEGATIVA -> respuestas.filterValues { values -> values == RESPUESTA_NEGATIVA }
            .also{imprimirRespuestas(it)}

        RESPUESTA_DUDOSA -> respuestas.filterValues { values -> values == RESPUESTA_DUDOSA }
            .also{imprimirRespuestas(it)}
    }
}

fun salir(){
    println("Hasta luego!")
}

fun mostrarError(){
    println("Vaya, parace que has elegido una opcion no valida. Vuelve a intentar!")
    desplegarMenuInicial()
}