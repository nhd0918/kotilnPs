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
    val nums = listOf<Int>(3,3)
    val target = 6
    val arr = IntArray(2)

    loop@for(i in 0..nums.size) {
        for(j in i + 1..nums.size - 1) {
            if( nums[i] + nums[j] == target ) {
                arr[0] = i
                arr[1] = j
                break@loop
            }
        }
    }
    println("${arr[0]} ${arr[1]}")
}