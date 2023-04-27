package org.example

class App1 {
 var currentTime: Long = System.currentTimeMillis()

  fun getValue(): Long {
      return System.currentTimeMillis();
  }
}

fun addAll(vararg numbers: Int): Int {

    return numbers.sum()
}

val close = { n: Int ->
    n * 4
}

fun weird(vararg numbers: Int,string: String): Int{
println(string)
    return numbers.sum();
}


fun main(args: Array<String>) {
    val result = addAll(3, 4, 6, 6, 3)
    println(result)
    println(close(4))
    println(close(3))
    weird(355,77,88, string = "this is a random string")
   var calculated by App1()::currentTime       


        var complexFunction = {a:Int , b:Int,c:Int -> a+b+c}
    println(calculated)
    Thread.sleep(34)
    var calculated1 by App1()::currentTime
    println(calculated1)
    val seekHelp: ClosedRange<String> = "heee".."help"
    for (ch in 'a'..'e') { print(ch) }

    val array = arrayOf(1, 2, 3)
    println(array.javaClass)

}


