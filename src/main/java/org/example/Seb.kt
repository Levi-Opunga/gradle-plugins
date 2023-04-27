package org.example

import kotlin.math.pow

class Power {
    fun getSubArray(array: Array<Int>): MutableSet<Array<Int?>> {
        val sets: MutableSet<Array<Int?>> = HashSet<Array<Int?>>();
        val subsets = 2.toDouble().pow(array.size)
        println("subsets $subsets")
        for (l in 0..subsets.toInt()) {
            val set: Array<Int?> = arrayOfNulls<Int>(4);
            array.forEachIndexed { index, i ->
                println("$l $index $i")
                println(1.shl(index))
                if ( l.and(1.shl(index)) != 0) {
                    println("here")
                    set[index]= i
                }
            }
            sets.add(set)

        }
        return sets;
    }

}

fun bitCount(number: Int):Pair<Int,String>{
    val binary =Integer.toBinaryString(number)
    var count = 0
    for (i in binary.indices){

        println("$number ${1.shl(i)}")

        println(number and ( 1 shl i))

        if(number and (1 shl i )!=0){
            count++
        }
    }
  return Pair(count, binary)

}

fun main(){
 val strings=   Power().getSubArray(arrayOf(1,2,3,4)).map { it -> it.filter { it!=null } }
    println(strings)
    bitCount(2103344520).also { println(it) }
    9137383839393399381.toLong().toString(2).also { println(it) }
}

