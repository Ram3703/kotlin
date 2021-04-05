package com.example.prject1

import java.util.*
fun main() {
    val s = Scanner(System.`in`)
    var n = s.nextInt()
    var x=0
    var y =1
    println(x)
    println(y)
    for(i in 1..n-2){
        var z=x+y
        println(z)
        x=y
        y=z
    }
}