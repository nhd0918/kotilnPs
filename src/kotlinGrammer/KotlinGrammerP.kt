fun main() {
    // 변수 var val 둘의 차이점 동작원리?
    // val은 불변변수이다.
    // var은 가변변수이다.
    val test1 = "1234"
    val test2 = 1234
    val test3 = 1234.1234
    // 자료형, 숫자, 문자, boolean 차이
    // 형 변환
    // null type
    // println(test1::class.java.simpleName)
    // 데이터 타입 선언, long은 19자리까지만 되는듯??
    val test4 : Int = 1234
    val test5 : Long = 1234123412341234512
    // 데이터 타입 형변환
    val test6 = test4.toString()
    //println(test6::class.java.simpleName)
    val test7 : String = "1234"
    val test8 = Integer.parseInt(test7)
    // 코틀린 NULL의 안정성을 구하기위함. NULL은 없는거다. 무엇이??
    val test9 = null
    // 코틀린은 NULL에 대해 엄격한편. 그이유는?
    val test10 : String? = null
    // ?의 의미는 무엇?? -> null일수도 있다.

    // if else
    // when
    val studentScore1 = 100
    // if vs when의 동작 원리는??
    /* 문제1
    * 학생의 점수 출력
    * */

    val score1 = 102

    if( score1 > 100 ) {
       // println("A")
    } else if(score1 in 91..99) {
       // println("B")
    } else if(score1 in 81..89) {
       // println("C")
    } else if(score1 in 71..79) {
      //  println("D")
    } else {
     //   println("F")
    }

    // 리스트와 filter
    // 물음표와 느낌표
    // 반복문
    // 리스트 선언
    val testList1 = ArrayList<String>()
    testList1.add("a")
    testList1.add("b")
    testList1.add("c")

    val testList2 = listOf("a","b","c")
    // 리스트의 불변 형태임 왜???
    val testList3 = mutableListOf<String>("a","b","c")
    testList3.add("d")
    // println(testList3)
    // filter
    val testList4 = listOf("std1","std2","std3","std4","1a",null)
    // 앞글자만 s를 가져올꺼다.
    // println(testList4.filter { it.startsWith("s") })
    // null인경우는 filter가 안된다.
    // testList4.filterNotNull().filter { it.startsWith("s") }
    var test11 : String = "a"
    var test12 : String = "b"

    test11 = test12
    //println(test11)
    // "?", "!!" <- 널이 아니다
    var test13 : String = "c"
    var test14 : String? = "d"
    test13 = test14!!
    // 반복문
    val test15 = listOf("a","b","c","d","f")
    for( i in test15 ) {
        //println(i)
    }
    // 기본 1~10으로 들어감
    for( i in 1..10) {
        //println(i)
    }

    // 만약에 2or3씩 증가하고싶으면 step를 쓰면됨
    // $의 의미는?
    for(i in 1..10 step 2) {
       // println("i: $i")
    }

    for( i in 1..3) {
        for(j in 1..3) {
           // println("i: $i j is $j")
        }
    }

    // List
    // Map
    // Set
    val testList11 = listOf("a","b","c")
    // mutableListOf() <-> listOf() 와의 차이점은??
    // 왜 mutable은 리스트내에서 변환이 가능한데 List는 왜 안되지??
    val testList12 = mutableListOf("a","b","c","d")
    testList12.add("e")
    // Map은 왜쓸까??
    // 10 , 철수
    // 11 , 짱구
    // 12 , 훈이
    val mutableList1 = mutableListOf<Int>()
    mutableList1.add(5)
    mutableList1.add(10)
    mutableList1.add(15)
    mutableList1.add(20)

    val mutableList2 = mutableListOf<String>()
    mutableList2.add("유리")
    mutableList2.add("철수")
    mutableList2.add("짱구")
    mutableList2.add("훈이")

    // 만약에 리스트에서 키에 대해 value값을 찾기위해서는
    val findInext = mutableList1.indexOf(10)
    //println(mutableList2[findInext])

    val testMap1 = mutableMapOf<Int,String>()
    testMap1.put(5,"유리")
    testMap1.put(10,"짱구")

    // Set -> 중복 허용을 안해줌. 순서는 보장이되나?
    val testSet1 = mutableSetOf("a","b","c","c")
    testSet1.add("d")
    testSet1.add("e")

    // while
    // List Map -> 복습
    // Iterator
    // while <- for문과 비슷함.
    var cnt = 0
    while(cnt < 100) {
        // cnt = cnt + 1
        cnt++
    }

    // list/map while문을 이용한 응용방법
    val testLL1 = mutableListOf("a","b","c")
    for (i in testLL1) {
     //   println(i)
    }

    val testLL2 = mutableMapOf<Int,String>()
    testLL2.put(1,"일")
    testLL2.put(2,"이")
    testLL2.put(3,"삼")

    for(i in testLL2) {
        //println(i)
    }
    val testLL3 = mutableMapOf<Int,String>()
    testLL3[1]  = "유리1"
    testLL3[10] = "유리2"
    testLL3[20] = "유리3"

    val testLL4 = mutableListOf("a","b","c")
    val testIterator = testLL4.listIterator()
    // 리스트내에서 변수값을 찾는다.
    // println(testIterator.next())
    // 값이 다음번에 값이있는지 찾아봄
    // println(testIterator.hasNext())
    // 인덱스를 뒷쪽으로 이동해야한다.
    // println(testIterator.previous())
    /*while(testIterator.hasNext()) {
        println(testIterator.next())
    }*/

    val std = mutableMapOf<Int,String>()
    std[99] = "민지"
    std[20] = "철수"
    std[100] = "하영"
    std[88] = "코알라"
    // key, value 값 찾기
    for(i in std) {
        if( i.key >= 50 ) {
            //println(i.value)
        }
    }

    val resValue = sum(2,4)
    // 논리연산
    // and or <-의미
    val map1 = mutableMapOf<Int,String>()
    map1.put(50,"일")
    map1.put(70,"이")
    map1.put(60,"삼")
    map1.put(50,"삼")
    map1.put(70,"삼사오오")

    for(i in map1) {
        if( i.key >= 50 && i.value.length >= 3) {
           // println( i.value )
        }
    }

    val testString = "동해물과 백두산이 마르고 닳도록"
    // println(testString.subSequence(0,2))
    val newTestString = testString.split(" ")

    val testList00 = ArrayList<String>()
    testList00.add("abc1@naver.com")
    testList00.add("abc2@naver.com")
    testList00.add("abc1@kakao.com")
    testList00.add("naver@google.com")

    // 1번째 방법으로는 naver라는 텍스트가 포함되어있는지 찾기
    for (i in testList00) {
        if( i.contains("naver") ) {
            //println(i)
        }
    }

    // 2번째 @뒤에 naver텍스트를 찾는다.
    for(i in testList00) {
        if( i.contains("@") ) {
            val index = i.indexOf("@")
            if( i.substring(index,i.length).contains("naver") ) {
                //println(i)
            }
        }
    }

    val emailList = ArrayList<String>()
    for(i in testList00) {
        emailList.add(i.split("@")[1].split(".")[0])
    }
    var ccnt = 0;
    for(i in emailList) {
        if( i == "naver" ) {
            ccnt++
        }
    }

    // 엘비스 연산자라는??
    // null이라는 친구는 뭐임?? -> 아무것도 없는녀석임.
    // val str = "" , val number = 0
    var nullTest : String = ""

    println(find2(null))


}
// 엘비스 연산자의 이점은? 비슷하게사용하는 다른 문법은?
fun find2(str : String?): Int {
    return str?.length ?: 0
}


// 현재 코드내에서 복잡하기때문에 엘비스를 쓸꺼임.
fun find1(str: String?): Int {
    var resCnt = 0
    if( str!= null ) {
        resCnt = str.length
    }
    return resCnt
}

fun find(str: String?): Int?{
    return str?.length
}



// 리턴하는 타입이 필요하다.
fun sum(a: Int, b: Int): Int {
    val res = a + b
    return res
}

fun abc() {
    // 지역변수
    val a = 10
    val b = 20
    val c = a + b
    println(c)

}