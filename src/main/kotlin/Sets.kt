fun main(args: Array<String>) {
    //***Set elimina registros repetidos

    //Set inmutables
    val vocalesRepetidas = setOf("a","e","i","o","u","a","e","i","o","u")
    println(vocalesRepetidas)

    //Ser mutables
    val numerosFavoritos = mutableSetOf(1,2,3,4)
    println(numerosFavoritos)
    numerosFavoritos.add(5)
    numerosFavoritos.add(5)
    println(numerosFavoritos)

    numerosFavoritos.remove(5)
    println(numerosFavoritos)

    val valorDelSet = numerosFavoritos.firstOrNull() { numero -> numero > 2 }
    println(valorDelSet)
}