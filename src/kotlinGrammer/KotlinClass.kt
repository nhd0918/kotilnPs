fun main() {
    val myinfo = MyInfo()

    val dog = Dog("파트",20)
    //InitalValue("박보검")
    val aaa = Calculator()
    //aaa.sumNumber(1,2)
    //Child().disease()
    val dataDog = DataDog("파트라슈",11)
    val dataDog2 = dataDog.copy(name ="파트라슈 여자친구")

    val test1 = Test1.Test1NestedClass()
    //test1.testFun1()

    val test2 = Test4().Test2InnerClass()
    test2.testFun2()

}

// 중첩클래스, 내부클래스의 차이는 원리는???
// 중첩클래스는 부모클래스의 전역변수를 사용하지못한다.
// 중첩 클래스 - 객체지향 / 캡슐화
// 내부 클래스 - RecyclerView
// 내부클래스는 사용가능함.
// 결국 범위가 중요한듯하다.
class Test1 {

    class  Test1NestedClass {
        fun testFun1() {
            println("TestFun1")
        }
    }
}

class Test4 {
    inner class Test2InnerClass{
        fun testFun2() {
            println("TestFun2")
        }
    }
}


// Data Class -> 이름처럼 데이터를 넣어놓는 클래스 ???
class JustDog(var Nname: String, var age :Int)
// Data class vs class의 차이점은?
// Data 서버에서 return받은 값들을 확인하기위햇 사용함. ->
data class DataDog(var name: String, var age: Int)

// 오버로딩 -> 겹겹히 쌓는다. 같은이름의 메서드를 여러개 가지지만 매개변수의 유형과 개수가 다르도록 한다.
// 객체지향을 쓰는이유
// 상속에 대해 간단하게 개념을 본다. -> 뭔가 물려받는다.
// 공통되어있는 코드를 묶기 위해
// 상속과 오버라이딩
// 상속 -> 자식 클래스가 부모 클래스의 멤버를 물려받는다.
// 오버라이딩도 부모클래스의 메소드를 자식 클래스에서 재정의해서 사용할수있다.

// 추상 클래스란? 기존에는 비어있는것? 명세?
// 무조건 다 꽉채워넣어야한다.
// 추상클래스는 공통적인 기능을 구현해야할때에 필요하다.

// 인터페이스 -> 추상클래스랑 비슷함 <-> 왜비슷할까?
abstract class CarBoard {
    abstract fun wheel()
    abstract fun engine()
}

interface CarAuto{
    fun autoDriving()
}

class Bmw() : CarBoard(), CarAuto {
    override fun engine() {
        println("BM 엔진 시동걸림")
    }

    override fun wheel() {
        println("BM 굴러감")
    }

    override fun autoDriving() {
        println("BM 자동주행")
    }

}


/*
abstract class Car{
    // 추상클래스는 이름만 정의해놓은 상태임.
    // 왜 아무것도없을까
    abstract fun wheel()
    abstract fun enginge()
}

class Bmw(): Car() {
    override fun wheel() {
        println("BMW 굴러간다.")
    }

    override fun enginge() {
        println("BMW 엔진 켠다")
    }
}*/

/*open class Car {
    open fun wheel() {
        println("굴러간다.")
    }

    open fun engine() {
        println("시동이 켜졌다.")
    }
}*/
// 원하는 부분만 변경함.
/*
class Bike(): Car() {
    override fun wheel() {
        println("자전거가 굴러간다.")
    }
}
*/



open class AllJobs() {
    init {
        println("일을 합니다.")
    }
}

// 상속과 오버라이딩
open class Parents() {
    fun doing() {
        println("자식을 돌본다")
    }
    open fun disease() {
        println("비염이 있습니다.")
    }
}

// 상속을 해서 사용하는 이유는 관리하기가 편한경우가있기때문이다.
class Child(): Parents() {
    override fun disease() {
        //super.disease()
        println("겁이 많습니다.")
    }
}

class Job3: AllJobs() {
    init {
        println("마케팅을 합니다.")
    }
}

class Job4: AllJobs() {
    init {
        println("근로를 합니다")
    }
}

class Calculator() {
    // 관리의 용이성
    fun sumNumber(a:Int, b:Int) {
        println(a + b)
    }
}

class InitalValue(name : String, age: Int = 20) {
    init {
        println(name)
        println(age)
    }
}

class InitTest() {

    // 생성자
    init {
        println("생성자 초기화")
    }

    fun testInitFun() {
        println("testInitFun")
    }
}

class Dog(name: String, age : Int) {
    val dogName = name
    val dogAge = age
    fun getMyInfo() : String {
        return "$dogName : $dogAge"
    }
}

class  MyInfo() {
    fun getMyAge(): Int {
        return 20
    }
    fun getMyName(): String {
        return "My"
    }

    fun getMyRocate(): String {
        return "seoul"
    }

}

class Test{
    val a = "abc"
}

class Test2(str: String) {
    val b = str
}

class Test3() {
    fun test3Fun() {
        println("test3Fun 출력")
    }
}