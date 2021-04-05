package com.example.prject1

import java.util.*
fun main() {
    val s = Scanner(System.`in`)
    println("Enter the price")
    var p = s.nextInt()
    println("Enter quality")
    var q = s.nextInt()
    var b= q*p
    println("Bill is ${b}")
    var d = b-(b*0.15)
    println("after discount: ${d} ")
}