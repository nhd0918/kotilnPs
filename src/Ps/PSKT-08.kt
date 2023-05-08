import java.io.BufferedReader
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.max


fun main() {
    val map = mapOf<String,Int>(
        "I" to 1,
        "V" to 5,
        "X" to 10,
        "L" to 50,
        "C" to 100,
        "D" to 500,
        "M" to 1000
    )
    val str = "III"
    val booleanArray = BooleanArray(str.length)

    var numberMax = 0
    var numberMin = 0
    var numberResult = 0
    for(i in str.indices) {
        for((key,value) in map) {
            if( booleanArray[i] == false ) {
                if( key == str[i].toString() ) {
                    if( str.length - 1 != i ) {
                        if( str[i].toString() == "I" ) {
                            if( str[i + 1].toString()== "V" || str[i + 1].toString() == "X" ) {
                                numberMax = map.get(str[i + 1].toString())!!
                                numberMin = value
                                numberResult += numberMax - numberMin
                                booleanArray[i + 1] = true
                            } else {
                                numberResult += value
                            }
                        } else if( str[i].toString() == "X" ) {
                            if( str[i + 1].toString()== "L" || str[i + 1].toString() == "C" ) {
                                numberMax = map.get(str[i + 1].toString())!!
                                numberMin = value
                                numberResult += numberMax - numberMin
                                booleanArray[i + 1] = true
                            } else {
                                numberResult += value
                            }
                        } else if( str[i].toString() == "C" ) {
                            if( str[i + 1].toString()== "D" || str[i + 1].toString() == "M" ) {
                                numberMax = map.get(str[i + 1].toString())!!
                                numberMin = value
                                numberResult += numberMax - numberMin
                                booleanArray[i + 1] = true
                            } else {
                                numberResult += value
                            }
                        } else {
                            numberResult += value
                        }
                    } else {
                        numberResult += map.get(str[i].toString())!!
                    }
                }
            }
        }
    }
    println(numberResult)
}