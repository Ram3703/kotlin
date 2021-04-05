package com.example.prject1

import java.util.*
import java.math.*
fun  main(){
    val s = Scanner(System.`in`)
    println("Enter the radius")
    val r = s.nextInt()
    println("Area of circle")
    println("${3.14*r*r}")
    println("Perimeter of circle")
    var p= 2*3.14*r
    Math.round(p)
    println("${p}")
    println("side of square")
    var si = p/4
    Math.round(si)
    println("${si}")
}