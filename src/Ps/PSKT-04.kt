import java.io.BufferedReader
import java.util.*

/*
* 가장 큰값 및 배열의 index값
* * */
fun main() {
    val arr = Array(9) { IntArray(9)}
    for (i in 0 until 9) {
        var st = StringTokenizer(readln())
        for(j in 0 until 9) {
            arr[i][j] = st.nextToken().toInt()
        }
    }

    var intMax = 0
    var resX: Int = 0
    var resY: Int = 0

    for (i in 0 until 9) {
        for(j in 0 until 9) {
            if( intMax < arr[i][j] ) {
                intMax = arr[i][j]
                resX = i + 1
                resY = j + 1
            }
        }
    }
    if( resX == 0 && resY == 0 ) {
        resX += 1;
        resY += 1;
    }
    println("$intMax")
    print("$resX $resY")
}