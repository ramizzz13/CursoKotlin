fun main(args: Array<String>) {
    //FOR
    val listaFrutas = listOf("Manzana", "Pera", "Frambuesa", "Durazno")
/*    for (fruta in listaFrutas){
        println("Hoy voy a comerme una fruta llamada $fruta")
    }*/
    for (fruta in listaFrutas) println("Hoy voy a comerme una fruta llamada $fruta")

    //FOREACH
    listaFrutas.forEach { fruta -> println("oy voy a comerme una fruta nueva  que se llamada: $fruta") }

    //MAP
    val caracteresDeFruta: List<Int> = listaFrutas.map { fruta -> fruta.length }
    println(caracteresDeFruta)

    //FILTER
    val listaFiltrada = caracteresDeFruta.filter { largoDeFruta -> largoDeFruta > 5 }
    println(listaFiltrada)
}