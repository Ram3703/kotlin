package com.example.prject1
import java.util.*
fun main() {
    val s = Scanner(System.`in`)
    println("Enter three subjects marks")
    var s1 = s.nextInt()
    var s2 = s.nextInt()
    var s3 = s.nextInt()
    var t = s1 + s2 + s3
    println("total : ${s1 + s2 + s3}")
    println("Percentage is : ${t / 3}")


}