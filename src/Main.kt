fun main(){

    task3()
}

//  6 olculu int tipinde massiv verilib.Bu massive ededler ekrandan daxil edilir.Bu massivin max elementini tapin.
fun task1() {
    println("Enter the numbers:")
    val numbers = IntArray(6) { readln().toInt()}
    val maxNumber = numbers.maxOrNull()
    println("Max number:$maxNumber")
    if (numbers==numbers) {
        println("Be ededler beraberdir")
    }
}

//6 olculu int tipinde massiv verilib.Bu massive ededler ekrandan daxil edilir.Bu massivin min elementini tapin.

fun task2() {
    println("Enter the numbers:")
    val numbers = IntArray(6) { readln().toInt()}
    val minNumber = numbers.minOrNull()
    println("Min number:$minNumber")
    if (numbers==numbers){
        println("Be ededler beraberdir")
    }
}

//6 olculu int tipinde massiv verilib.Bu massive ededler ekrandan daxil edilir.Bu massivin elemenlerinin ededi ortasini tapin.

fun task3() {
    println("Enter the numbers:")
    val numbers = IntArray(6) { readln().toInt()}
    var sum = numbers
    for (numAverage in numbers){
        sum+=numAverage
        var average = sum / 6
        println("Bu ededlerin ededi ortasi:$sum")
    }
}