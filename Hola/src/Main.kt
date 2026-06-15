//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*fun main() {

    println("Hola amor")

    var num1 = 13

    println(num1)

}

 */
/*
fun main() {
    println("Ingresa el primer número:")
    val entrada1 = readLine() ?: "0"
    val numero1 = entrada1.toInt()

    println("Ingresa el segundo número:")
    val entrada2 = readLine() ?: "0"
    val numero2 = entrada2.toInt()

    // Guardando la suma
    val resultado = numero1 + numero2

    println("El resultado es: $resultado")
}*/

fun main() {
    var continuar = true

    while (continuar) {
        // 1. Mostrar las opciones del menú
        println("\n=== MENÚ DE OPERACIONES ===")
        println("1. Sumar")
        println("2. Restar")
        println("3. Multiplicar")
        println("4. Dividir")
        println("5. Salir")
        print("Selecciona una opción (1-5): ")

        // 2. Leer la opción seleccionada de forma segura
        val opcion = readLine()?.toIntOrNull() ?: 0

        if (opcion in 1..4) {
            // Solicitar los números solo si la opción es válida
            print("Ingresa el primer número: ")
            val num1 = readLine()?.toDoubleOrNull() ?: 0.0
            print("Ingresa el segundo número: ")
            val num2 = readLine()?.toDoubleOrNull() ?: 0.0

            // 3. Evaluar la operación seleccionada
            when (opcion) {
               //1 1 -> println("Resultado: $num1 + $num2 = ${num1 + num2}")
                1 -> println("Resultado: ${num1 + num2}")
                2 -> println("Resultado: $num1 - $num2 = ${num1 - num2}")
                3 -> println("Resultado: $num1 * $num2 = ${num1 * num2}")
                4 -> {
                    // Validación matemática para evitar el error de división por cero
                    if (num2 != 0.0) {
                        println("Resultado: $num1 / $num2 = ${num1 / num2}")
                    } else {
                        println("Error: No se puede dividir entre cero.")
                    }
                }
            }
        } else if (opcion == 5) {
            println("Saliendo del programa. ¡Hasta luego!")
            continuar = false
        } else {
            println("Opción no válida. Por favor, intenta de nuevo.")
        }
    }
}
