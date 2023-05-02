package KotlinGrammerBankP

class AccountClass(name: String, age: Int) : BankAtm{

    var name = name
    var age = age

    override fun deposit() {
        age += 1000
    }

    override fun withdraw() {
        age -= 100
    }
}