// Estas constantes no cambian, se generan antes de la ejecucion
// Declarar en tiempo de compilacion
const val PI = 3.1415;


// funcion main -> punto de entrada de la app
fun main(args: Array<String>) {
//    variables creadas en tiempo de ejecucion
//    variables de lectura y escritura
    var dinero = 1000
    dinero -= 50
    println(dinero)

//    Variables de solo lectura
    val nombre = "Jesus Alexis"
    println(nombre)
    println(PI)
}