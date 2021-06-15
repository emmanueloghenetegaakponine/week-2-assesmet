fun main() {
    // question one
    var No: Int = 10
    var returnNo = if (No == 10) {
        println("No is equal to 5")
    } else {
        println("No is not equal to 10")
    }
}

//question two
// loop from 1- 100
fun main() {
    var i: Int = 1
    while (i <= 100) {
        println(i)
        i++
    }
    var numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (number in numbers) {
        if (number == 5) {
            continue
        }
        println(number)
    }
}



//question 3
fun main() {
    var m: Int = 10
    while (m <= 20) {
        if (m % 2 == 0) {
            println(m)
        }
        m++
    }
}

fun main() {
    var m: Int = 20
    while (m <= 30) {
        if (m % 3 == 0) {
            println(m)
        }
        m++
    }
}
// question 4
var user1 : user1 = user1("ochuko", "Delta", 20, "warri", 65000.00)
println("name : ${user1.name}")
println("state : ${user1.state}")
println("age : ${user1.age}")
println("town : ${user1.town}")
println("salary : ${user1.salary}")


var user2 : user2 = user2("uche", "Anambra", 25, "Awka", 75000.00)
println("name : ${user2.name}")
println("state : ${user2.state}")
println("age : ${user2.age}")
println("town : ${user2.town}")
println("salary : ${user2.salary}")


var user3 : user3 = user3("osaro", "Edo", 28, "Benin", 68000.00)
println("name : ${user3.name}")
println("state : ${user3.state}")
println("age : ${user3.age}")
println("town : ${user3.town}")
println("salary : ${user3.salary}")


var user4 : user4 = user4("paul", "Delta", 22, "Asaba", 67500.00)
println("name : ${user4.name}")
println("state : ${user4.state}")
println("age : ${user4.age}")
println("town : ${user4.town}")
println("salary : ${user4.salary}")


var user5 : user5 = user5("Frank", "Rivers", 32, "portharcourt", 69000.00)
println("name : ${user5.name}")
println("state : ${user5.state}")
println("age : ${user5.age}")
println("town : ${user5.town}")
println("salary : ${user5.salary}")
}

class user1{
    var name : String = ""
    var state : String = ""
    var age : Int = 0
    var town : String = ""
    var salary : Double = 0.0

    constructor(name:String, state:String, age:Int, town:String, salary:Double){
        this.name = name
        this.state = state
        this.age = age
        this.town = town
        this.salary = salary
    }
}

class user2{
    var name : String = ""
    var state : String = ""
    var age : Int = 0
    var town : String = ""
    var salary : Double = 0.0

    constructor(name:String, state:String, age:Int, town:String, salary: Double){
        this.name = name
        this.state = state
        this.age = age
        this.town = town
        this.salary = salary
    }
}

class user3 {
    var name: String = ""
    var state: String = ""
    var age: Int = 0
    var town: String = ""
    var salary: Double = 0.0

    constructor(name: String, state: String, age: Int, town: String, salary: Double) {
        this.name = name
        this.state = state
        this.age = age
        this.town = town
        this.salary = salary
    }
}

class user4{
    var name: String = ""
    var state: String = ""
    var age: Int = 0
    var town: String = ""
    var salary: Double = 0.0

    constructor(name: String, state: String, age: Int, town: String, salary: Double) {
        this.name = name
        this.state = state
        this.age = age
        this.town = town
        this.salary = salary
    }
}

class user5{
    var name: String = ""
    var state: String = ""
    var age: Int = 0
    var town: String = ""
    var salary: Double = 0.0

    constructor(name: String, state: String, age: Int, town: String, salary: Double) {
        this.name = name
        this.state = state
        this.age = age
        this.town = town
        this.salary = salary
    }
