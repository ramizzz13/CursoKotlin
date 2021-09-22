fun main(args: Array<String>) {
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