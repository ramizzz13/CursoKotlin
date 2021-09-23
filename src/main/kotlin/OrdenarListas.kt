fun main(args: Array<String>) {
    val numerosDeLoteria = listOf(11,22,43,56,78,66)

    val numerosSorted = numerosDeLoteria.sorted()
    println(numerosSorted)

    val numerosDeLoteriaDescendientes = numerosDeLoteria.sortedDescending()
    println(numerosDeLoteriaDescendientes)

    val ordenarPorMultiplos = numerosDeLoteria.sortedBy { numero -> numero < 50 }
    println(ordenarPorMultiplos)

    val numerosAleatorios = numerosDeLoteria.shuffled()
    println(numerosAleatorios)

    val numerosEnReversa = numerosDeLoteria.reversed()
    println(numerosEnReversa)

    val mensajeDeNumero = numerosDeLoteria.map { numero -> "Tu numero de loteria es $numero" }
    println(mensajeDeNumero)

    val numerosFiltrados = numerosDeLoteria.filter { numero -> numero > 50 }
    println(numerosFiltrados)
}