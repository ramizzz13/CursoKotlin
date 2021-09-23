fun main(args: Array<String>) {
    val fraseAleatoria = "En Platzi nunca paramos de aprender"
    imprimerFrase(randomcase(fraseAleatoria))

    val fraseAleatoria2 = "Texto con una funcion de extension".randomcase2()
    imprimerFrase(randomcase(fraseAleatoria2))
}
fun imprimerFrase(frase: String) : Unit{
    println("Tu frae es: $frase")
}

fun randomcase(frase : String) : String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2) == 0){
        frase.uppercase()
    }else {
        frase.lowercase()
    }
}

//Funcion de extension
fun String.randomcase2() : String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2) == 0){
        this.uppercase()
    }else {
        this.lowercase()
    }
}