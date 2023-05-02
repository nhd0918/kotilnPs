package KotlinGrammerBankP

fun main() {
    val yj0 = AccountClass("yj",500)
    yj0.deposit()
    println(yj0.name + yj0.age)
    yj0.withdraw()
    println(yj0.name + yj0.age)
}