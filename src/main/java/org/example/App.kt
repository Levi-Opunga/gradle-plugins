package org.example

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.LinkedHashMap
import kotlin.reflect.KProperty
import kotlin.time.Duration.Companion.microseconds

class App {
    var number = 3;

    companion object{
      @JvmStatic  fun main(args: Array<String>) {
            val list = listOf<String>("word", "in", "english")


          var jList = ArrayList<String>()
          var stringified = list.joinToString(
                postfix = "}",
                prefix = "{",
                separator = "+",

                ) {
                it
            }
            val joinTo = list.joinTo(
                buffer = StringBuilder(),
                postfix = "}",
                prefix = "{",
                separator = "+_+",
            )
            stringified.apply {
                println(joinTo)
            }
          var min = list.min()
          println("min $min")
          var map1: List<Int> = list.map { gg -> gg.length }

          var generateSequence = generateSequence(5) { it * 5 }
            val split = "Random words in a java program".split(" ")
            split.onEachIndexed { index, s ->
                println(index)
            }
          var complexList = listOf<List<String>>(list,list.map { it +it })
          var flat =  complexList.flatten()
          println(flat)
          println(Runtime.getRuntime().availableProcessors())
            // var sme =split.reduceRight { s, acc -> acc+s }.let { println(it) }
            var string: String = String()
          val message = "af b cgg dwet e".split(" ").fold(1) { acc, s -> acc * s.length }
          println("message $message")
          fun greet() = "Hello"
          println(greet())
            val main = Main()
            val and: Number by App()::number
            println(and)
            //repeat(4) { it -> println(it) }

          main.streamNums()
        var map = HashMap<Number, String>(10)
          map[0] = "value0"
          map[1] = "value1"
          map[2] = "value2"
          map[3] = "value3"
          assert(map.size==1)
          var mapValues = map.mapValues { (k, v) ->
              "$k"+" $v"
          }
          mapValues.forEach {
              println(it)
          }
          for ((i,v) in split.withIndex()){
                println("index $i value $v")
          }

          map.onEachIndexed(action = {i,(index, value) -> println(value)})
          println(SingleInstance.tryEpr(true))
          println("---------------------------------------")
          list.stream().parallel().forEach {
              Thread.sleep(3000)
              println(it)
          }
          
      }

    }




}