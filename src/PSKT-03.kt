import java.io.BufferedReader
import java.util.*

/*
* N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
* A배열, B배열, C배열
* 행렬의 조건은 행과열이 같은 행렬의 배열의 값의 조건이 맞아야한다.
* * */
fun main() {
    var st = StringTokenizer(readln())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val arr = Array(n) { IntArray(m)}
    for (i in 0 until n) {
        st = StringTokenizer(readln())
        for(j in 0 until m) {
            arr[i][j] = st.nextToken().toInt()
        }
    }

    for (i in 0 until n) {
        st = StringTokenizer(readln())
        for(j in 0 until m) {
            arr[i][j] += st.nextToken().toInt()
        }
    }

    for (i in 0 until n) {
        for(j in 0 until m) {
            print("${arr[i][j]}" + " ")
        }
        println()
    }

}