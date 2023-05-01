import java.io.BufferedReader
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.max

/*
* 가장 큰값 및 배열의 index값
* 가변적인 배열을 입력받고 가장큰 배열의 길이값을 기준으로 하나더 생성해서 가로로 출력하면되는 문제다.
* * * */
fun main() {
    val arr = mutableListOf<List<String>>()

    var maxLength = 0
    // 가변적인 배열을 입력받기 위한 코드
    for(i in 0 until 5) {
        // 한줄을 입력받는다.
        val input = readLine() ?: ""
        val inputArry = input.map { it.toString() }
        arr.add(inputArry)
        maxLength = maxOf(maxLength,inputArry.size)
    }

    val newArr = Array(arr.size) { Array(maxLength){""} }
    for(i in 0 until arr.size) {
        for(j in 0 until arr[i].size) {
            newArr[i][j] = arr[i][j]
        }
    }

    for(i in 0 until maxLength) {
        for(j in 0 until arr.size) {
            print("${newArr[j][i]}")
        }
    }

}