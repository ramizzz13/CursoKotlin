fun main(args: Array<String>) {
    //Parametros nombrados
    imprimirNombre(nombre = "Ramiz", apellido = "Perez")
}

fun imprimirNombre(nombre: String, segundoNombre: String = "", apellido: String){
    println("Mi nombre es $nombre $segundoNombre y mi apellido es $apellido")
}