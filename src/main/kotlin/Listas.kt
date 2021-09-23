fun main(args: Array<String>) {
    //Lista inmutable
    val listaDeNombres = listOf("Juan", "Enrique", "Camila")
    println(listaDeNombres)

    //Lista mutable (que se puede cambiar)
    val listaVacia = mutableListOf<String>()
    println(listaVacia)

    listaVacia.add("Juan")
    println(listaVacia)

    val valorUsandoGet = listaVacia.get(0)
    println(valorUsandoGet)

    val valorUsandoOperator = listaVacia[0]
    println(valorUsandoOperator)

    val primerValor: String? = listaDeNombres.firstOrNull()
    println(primerValor)

    listaVacia.removeAt(0)
    println(listaVacia)

    listaVacia.add("Enrique")
    println(listaVacia)
    listaVacia.removeIf { caracteres -> caracteres.length > 3 }
    println(listaVacia)

    //Array
    val myArray = arrayOf(1,2,3,4)
    println("Nuestro array is $myArray")
    println("Array como lista ${myArray.toList()}")

}