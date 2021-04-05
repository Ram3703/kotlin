package com.example.prject1

import java.util.*
fun main() {
    val s = Scanner(System.`in`)
    println("Enter the number")
    var n = s.nextInt()
    var f={p:Int ->
        var s=1
        for (i in 1..p)
        {
            s=s*i
        }
        println("factorial is ${s}")
    }
    f(n)
}