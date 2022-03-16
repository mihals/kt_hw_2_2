package ru.netology

fun main() {
    val likes: Int = 1

    if (likes % 100 == 11) {
        println("Понравилось $likes человекам")
    } else if (likes % 10 == 1) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}