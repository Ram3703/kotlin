package com.example.prject1

import java.util.*
fun main() {
    var s=Scanner(System.`in`)
    var x=s.nextInt()
    palindrome(x)

}
fun palindrome(a:Int):Unit
{
    var i=1
    var count=1
    var a1=ArrayList<Int>()
    a1.add(0)
    while(count<=a-1)
    {
        var i1=i
        var j=1
        var s=0
        while(i>0)
        {
            var r=i%10
            s=s*10+r
            i=i/10
        }
        if(i1==s){
            a1.add(i1)
            count++
        }
        i=i1+j
    }
    for(m in a1)
    {
        println(m)
    }
}