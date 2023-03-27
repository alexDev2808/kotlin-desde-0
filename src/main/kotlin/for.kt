fun main(args: Array<String>) {
    val listaDeFrutas = listOf("Manzana", "Pera", "Frambuesa", "Durazno")

//    fruta se convierte en cada elmemento de la listaDeFrutas
    for (fruta in listaDeFrutas) println("Voy a comer: $fruta")

//    forEach, las llaves indican que es una funcion anonima
    listaDeFrutas.forEach { fruta -> println("Voy a comer: $fruta para el desayuno") }

//    map, tranformar datos, devuelve un array
    val caracteresFrutas: List<Int> = listaDeFrutas.map { fruta -> fruta.length }

    println(caracteresFrutas)

// filter, filtrar datos segun cierta condicion
    val listaFiltradas = caracteresFrutas.filter { longitud -> longitud > 5 }

    println(listaFiltradas)

}