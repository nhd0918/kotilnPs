import java.io.BufferedReader
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.max

/*
* 진수 변환
* ZZZZZ 36 <-
* 알파벳 대문자를 10부터 시작하여 A ~ Z까지의 수를
* * * */
fun main() {
    // 기본적인 배열
    val arr = Array(5) { IntArray(5) }
    // 가변 배열
    val arr1 = mutableListOf<Array<String>>()
    // 배열 MAP
    val map: Map<String,Int> = mapOf(
        "1" to 2
    )

    for(i in 0 until 5) {
        for(j in 0 until 5) {
            arr[i][j] = i
        }
    }

    for(i in 0 until 5) {
        for(j in 0 until 5) {
            print("${arr[i][j]}")
        }
        println()
    }

}