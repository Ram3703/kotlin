package com.example.prject1
/*
class Ram{
    var a_no: Int =0
    var name: String = ""
    var amt: Float =0.toFloat()
    fun insert(ac:Int,n:String,am:Float){
        a_no=ac
        name= n
        amt=am

    }
}
fun main(){
    var r= Ram()
    r.insert(12345,"Ram",1000f)
    println("${r.a_no}")
}
class outerClass{
    private var name: String = "Ashu"
    inner class innerClass{
        var description: String = "code inside nested class"
        private var id: Int = 101
        fun foo(){
            //  print("name is ${name}") // cannot access the outer class member
            println("Id is ${id} ")
            println("${name}")
        }
    }
}
fun main(args: Array<String>){
// nested class must be initialize
    println(outerClass().innerClass().description) // accessing property
    outerClass().innerClass().foo() // object creation
    //obj.foo() // access member function
    //println(outerClass.nestedClass().name)
}
class myClass(val name: String, var id: Int) {


    init {
        println("${name}")
        println("${id}")
    }
}
fun main(args: Array<String>){
    val myclass = myClass ("Ram",101)

    println("Name = ${ myclass.name}")
    println("Id = ${ myclass.id}")
}

open class Parent{

    constructor(name: String, id: Int){
        println("this executes first")
        println("Name = ${name}")
        println("Id = ${id}")
    }

    constructor(name: String, id: Int,pass: String){
        println("this executes third")
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${pass}")
    }
}
class Child:Parent{
    constructor(name: String, id: Int):this(name,id, "mypassword"){
        println("this executes second")
        println("Name = ${name}")
        println("Id = ${id}")
    }

    constructor(name: String, id: Int,pass: String):super(name,id,"password"){
        println("this executes forth")
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${pass}")
    }
}
fun main(args: Array<String>){
    val obj1 = Child("Ashu", 101)
    val obj2 = Parent("Ashu", 101,"mypassword")
}

open class Base() {
    var a = 1 // public by default
    private var b = 2 // private to Base class
    protected open val c = 3  // visible to the Base and the Derived class
    internal val d = 4 // visible inside the same module
    protected fun e() { } // visible to the Base and the Derived class

}

class Derived: Base() {
    // a, c, d, and e() of the Base class are visible
    // b is not visible
    override val c = 9 // c is protected

}

fun main(args: Array<String>) {
    val base = Base()
    // base.a and base.d are visible
    // base.b, base.c and base.e() are not visible
    val derived = Derived()
    // derived.c is not visible
    print("${base.a}")
    print("${base.b}")
    print("${base.c}")
    print("${base.d}")
}

fun main(){
    var myArray:IntArray = intArrayOf(2,3,4,5)

    for (e in myArray){
        println(e)
    }
}

fun main(){
    var l:List<Any> = listOf<Any>(2,"kdbw",5,"jdwc",6,"dncwl")
    for (i in l){
        print(i)
    }
    println()
  /*  for (index in 0..l.size-1){
        println(l[index])
    }*/
    println(l.get(1))
    println(l.indexOf(5))
    println(l.lastIndexOf(5))
    println(l.size)
    println(l.contains("jdwc"))
    println(l.subList(2,4))
    println(l.isEmpty())
    println(l.drop(1))
    println(l.dropLast(2))
} */
fun main(){
    var ml = mutableListOf<Any>()
    var ml1 = mutableListOf<Any>(2,"hdb",4,"djk")
    var ml2 = mutableListOf<Any>("hid",4,"wdbwcd")
    ml.add(1)
    ml.add("Ram")

    //println(ml[1])
    ml.add(2,"Prasda")

   // println("hdchkbcjkbdkc")
    ml.add(3)
    ml.addAll(ml1)
    ml.remove("Prasda")
    ml.removeAt(2)
    ml.removeAll(ml1)
    ml.set(0,"ram")
    //ml.retainAll(ml2)
    for (i in ml2) {
        println(i)
    }
    ml2.clear()
    for (i in ml) {
        println(i)
    }
    for (i in ml2) {
        println(i)
    }
    println(ml1.subList(1,3))
}