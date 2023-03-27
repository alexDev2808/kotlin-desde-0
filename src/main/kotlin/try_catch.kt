fun main(args: Array<String>) {
    val nombre : String? = null
    try {
        throw NullPointerException("Referecia nula")
    }catch (exception : NullPointerException) {
        println("Ocurrio un error")
    } finally {
        println("Finalmente ocurrion un error... saliendo...")
    }


    val primerValor = 10
    val segundoValor = 0
    val resultado : Int = try { primerValor / segundoValor } catch (exception : Exception) { 0 }

    println(resultado)

}