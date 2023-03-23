

fun main() {
    val nombre = "Jesus"

    if (nombre.isNotEmpty()) println("El largo de tu nombre es: ${nombre.length}") else println("Tu nombre esta vacio.")

    val mensaje = if(nombre.isEmpty()) "El nombre estaba vacio" else if (nombre.length > 5) "Tu nombre es largo" else "Tu nombre es corto"
    println(mensaje)


}