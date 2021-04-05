package com.example.prject1

/*fun main(){
  /*  var i= "Ram"
   // i =  "prs"
    print(i)
    val s:String ="""
        hkvbiyv
        dicnld
        dlvjl;vs        nsdvk;
    """
    print(s)
    var a:Int=10
    var j:Long = a.toLong()
    println(j)
    val a=6
    val b=8
    var max =if (a>b){
        println("a is greater")
        a
    }
    else{
        println("b is greater")
        b
    }
    print("max=$max")
    var i=4
    when(i){
        1,2 -> print("one, two")
        3,4 -> print("three, four")
        else -> print("Inavalid number")
    }
    //print(j)
    val id = arrayOf(1,2,3,4,5)
 //   for(i in id.indices){
   //     println("id[$i]:"+id[i])
        //print(i)
    for (i in 10 downTo 1 step 2){
        if (i==6){
            break
        }
        println(i)
    num(4,5)
}
fun num(a:Int,b:Int){
    val add= a+b
    println(add)
    var lambda = {a:Int -> println("The sum is $a")}
    addnumber(num1:20,num2:30,lambda)
}*/

 */
fun main(args: Array<String>){
    val myLambda: (Int) -> Unit= {s: Int -> println(s) } //lambda function
    addNumber(5,10,myLambda)
}
fun addNumber(a: Int, b: Int, mylambda: (Int) -> Unit ){   //high level function lambda as parameter
    val add = a + b
    mylambda(add) // println(add)
}