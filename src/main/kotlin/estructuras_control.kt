

fun main() {
    val nombre = "Jesus"

    if (nombre.isNotEmpty()) println("El largo de tu nombre es: ${nombre.length}") else println("Tu nombre esta vacio.")

    val mensaje = if(nombre.isEmpty()) "El nombre estaba vacio" else if (nombre.length > 5) "Tu nombre es largo" else "Tu nombre es corto"
    println(mensaje)

//    when

    val nombreColor = "Carmesi"

    when (nombreColor) {
        "Amarillo" -> println("El amarillo es el color de la alegria")
        "Rojo", "Carmesi" -> println("Roja es la sangre jaja")
        else -> println("No existe ese color")
    }

    val codigo = 200

    when (codigo) {
        in 200..209 -> println("Todo ha ido bien")
        in 400..499 -> println("Not found")
        else -> println("Codigo desconocido")
    }

// Tambien se puede utilizar sin parametro y usarlo como if - else
    val talla_zapatos = 28
    val disponible = when {
        talla_zapatos > 27 -> "En existencia"
        else -> "Zapatos disponbles solo en tallas 27 y 28"
    }

    println(disponible)



}