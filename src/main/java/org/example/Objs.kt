package org.example

class Objs {
}

object SingleInstance {
    var fgg: String = ""
//        get(){
//           return field
//        }
//        set(value){
//         field = value
//        }

    var number: Number
        get() = number
        set(value) {}

    fun tryEpr(blowup: Boolean): Int {
     return   try {
            if (blowup) {
                throw RuntimeException("Thrown just because!!!!!")
            }
            4
        } catch (e: RuntimeException ) {
            6
        } finally {
           100
        }
    }
}

object DataProviderManager {
    fun registerDataProvider(provider: String) {
    }

    val allDataProviders: Collection<String>
        get() = allDataProviders;
}