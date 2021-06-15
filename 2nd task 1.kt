fun main(){
    // loop from 1- 100
    var i : Int = 1
    while(i <= 100){
        println(i)
        i++
    }
  var numbers : Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for(number in numbers){
        if(number == 5){
            continue
        }
        println(number)
    }
}

