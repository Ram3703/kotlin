package com.example.prject1

fun main(){
    var a = arrayOf(4,8,6,2)
    var l = { ->
        var r = a.sorted()
        println("Smallest element is ${r[0]}")
        println("Largest element is ${r[a.size-1]}")
    }
}