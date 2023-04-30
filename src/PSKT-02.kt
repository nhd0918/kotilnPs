
/*
* 입력을 받고 각 평균값을 구하면된다.
* ObjectOrientedProgramming1 3.0 A+
* IntroductiontoComputerEngineering 3.0 A+
* 20줄을 입력받는다.
* */
fun main(args: Array<String> ) {
    val count: Int = 20
    val map:Map<String,Double> = mapOf(
        "A+" to 4.5,
        "A0" to 4.0,
        "B+" to 3.5,
        "B0" to 3.0,
        "C+" to 2.5,
        "C0" to 2.0,
        "D+" to 1.5,
        "D0" to 1.0,
        "F" to 0.0,
    )
    var sum:Double = 0.0
    var sumScore = 0.0

    for(i in 0 until 20) {
        val s: String = readLine()!!
        val info = s.split(" ")
        val score: Double = info[1].toDouble()
        val grade: String = info[2]

        if(grade.equals("P")) continue
        sum += map.get(grade)!!*score
        sumScore += score
    }
    print(sum/sumScore)
}