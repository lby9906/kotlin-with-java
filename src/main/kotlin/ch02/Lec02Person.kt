package ch02

fun Main() {
    val person = Person("공부하는 개발자")
    startsWithA(person.name)
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}