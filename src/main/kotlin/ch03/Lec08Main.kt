package ch03

fun main() {
    repeat("Hello World", useNewLine = false)
    printNameAndGender(name = "최태현", gender = "FEMALE")
    printAll("A","B","C")

    val array = arrayOf("A", "B", "C")
    printAll(*array) //가변인자 호출은 배열안에 있는 것들을 꺼내준다 *(스프레드) 붙여야함
}

fun max(a: Int, b: Int) =
    if (a>b) {
        a
    }else {
        b
    }


fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        }else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll(vararg strings: String) { //가변인자 vararg
    for (str in strings) {
        println(str)
    }
}