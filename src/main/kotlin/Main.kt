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

// Tipos de datos
    val boolean = true; //Boolenas true o false
    val numeroLargo : Long = 1000000000 // o 10000L
    val numDecimal = 4524.2 // Numeros decimales por defecto son Doubles
    val numFlotante = 104.4f // Flotantes van con una f al final

//    Al crear una variable cada tipo de dato tiene sus propios metodos y propiedades
//    En Kotlin todo es un objeto!

    val primer_valor = 50
    val segundo_valor = 25
    val tercer_valor = primer_valor - segundo_valor
    println(tercer_valor)

    val apellidoP = "Tenorio"
    val apellidoM = "Hernandez"

//  Template String / interpolacion
    val apellidos = "Mis apellidos son: $apellidoP $apellidoM"
    println(apellidos)
//    En los templates se pueden desarrollar operaciones van en ${}
    println("La suma del primer y segundo valor es: ${primer_valor + segundo_valor} MXN")


}