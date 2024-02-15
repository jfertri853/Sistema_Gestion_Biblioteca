package org.example

/**
 * Función que proporciona un mensaje de préstamo basado en el tipo de usuario y el libro
 *
 * @param user Usuario que solicita el préstamo
 * @param book Libro que se va a prestar
 *
 * @return Mensaje que indica cuándo debe devolverse el libro
 */
fun loan(user: User, book: Book): String = when(user) {
    is User.Student -> "Devuelve ${book.title} dentro de 14 días"
    is User.Professor -> "Devuelve ${book.title} dentro de 28 días"
    is User.Visitor -> "No puedes tomar prestado libros"
}


fun main() {
    val student = User.Student("123", "Pepe", "Biología")
    val professor = User.Professor("987", "Juan", "Geología")
    val visitor = User.Visitor("456", "Ana")

    val braveNewWorld = Book("A brave new world", "Aldous Huxley", 1932)
    val benHur = Book("Ben Hur", "Lewis Wallace", 1880)
    val javaParaNovatos = Book("Java para novatos", "A. M. Vozmediano", 2017)

    println(loan(student, javaParaNovatos))
    println()
    println(loan(professor, benHur))
    println()
    println(loan(visitor, braveNewWorld))
}