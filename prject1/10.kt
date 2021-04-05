package com.example.prject1

import java.util.*

fun main() {

    var s = Scanner(System.`in`)
    println("Enter Year : ")
    var y = s.nextInt();

    // checking leap year condition
    val isleap = if (y % 4 == 0){
        if (y % 100 == 0) {
            // Century Year must be divisible by 400 for Leap year
            y % 400 == 0
        } else true
    } else false;

    println("$y is ${if (isleap) "Leap Year" else "Not a Leap Year"} ")
}