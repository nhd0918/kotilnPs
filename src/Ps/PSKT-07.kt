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
    val nums = listOf<Int>(2,3,4,5)
    val t = 9
    val arr = IntArray(2)

    for(i in nums.indices) {
        if( nums.size - 1 != i) {
            if( t == nums[i] + nums[i + 1] ) {
                arr[0] = i
                arr[1] = i + 1
            }
        }
    }

}