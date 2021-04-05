package com.example.prject1

import java.util.*
fun main() {
    val s = Scanner(System.`in`)
    var n = s.nextInt()
    for (i in 1..n){
        var c= 0
        for (j in 1..i){
            if (i%j==0){
                c++
            }
        }
        if (c==2){
            println(i)
        }
    }
}