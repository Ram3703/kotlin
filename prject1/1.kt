package com.example.prject1
import java.util.*

fun main(){
    val s = Scanner(System.`in`)
    println("enter first number")
    val fn = s.nextInt()
    println("enter second number")
    val sn = s. nextInt()
    println("1.add\n2.sub\n3.mul\n4.mod")
    val n = s.nextInt()
    when(n) {
        1 -> println("${fn+sn}")
        2 -> println("${fn - sn}")
        3 -> println("${fn*sn}")
        4 -> println("${fn%sn}")
        else -> println("Invalid option")
    }
}