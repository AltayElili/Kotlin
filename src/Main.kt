import kotlin.contracts.contract

fun main() {
    println("-------------Lesson8_Altay-------------")
    task4()
}


//100-1000 araliginda butun reqemleri tekrar olan ededlerin ededi ortasini tapin.Numune:111,222 111+222/2 2 burda
// el ile yazilmasin bu 4,5,6 reqemler ucunde odensin
fun task1() {

    println("Enter the initial value:")
    val initialValue = readln().toInt()
    println("Enter the final value:")
    val finalValue = readln().toInt()
    var result = 0
    var countSameDigits1=0
    for (item in initialValue..finalValue) {
        var text = item.toString()
        var countSameDigits = 0
        for (itemIndex1 in text.indices) {
            for (itemIndex2 in itemIndex1 + 1..<text.length) {
                if (text[itemIndex1] == text[itemIndex2]) {
                    countSameDigits++

                }
            }
        }
        if (countSameDigits == text.length*(text.length-1)/2) {
            countSameDigits1++
            result += item
        }
    }
    if(countSameDigits1>0){
        println("""The numerical average of the numbers in the range you entered that have all the same digits:
        ${result / countSameDigits1.toDouble()}""".trimMargin())
    }
    else {
        println("There are no numbers in the range you entered that have all the same digits.")
    }
}

//100-1000 araliginda butun sade ve murekkeb ededlerin sayini tapan proqram yazin.Her ikisinin sayini
fun task2() {
    println("Enter the initial value:")
    val initialValue = readln().toInt()
    println("Enter the final value:")
    val finalValue = readln().toInt()
    var sumOfSimpleDigitsCount = 0
    var sumOfComplexDigitsCount = 0
    for (number in initialValue..finalValue) {
        var control=false
        for(number1 in 2..<number){
            if(number%number1==0){
                control=true
            }
        }
        if(!control && number!=1){
            sumOfSimpleDigitsCount++
        }
        if(control && number!=2){
            sumOfComplexDigitsCount++
        }
    }
    println("Number of multiple numbers:$sumOfComplexDigitsCount")
    println("Number of prime numbers:$sumOfSimpleDigitsCount")

}

//100-1000 araliginda reqemlerinin cemi 10-dan boyuk olan ededlerin ededi ortasini tapin.
// Numune 945=17(true) 123=6(false)
fun task3() {
    println("Enter the initial value:")
    val initialValue = readln().toInt()
    println("Enter the final value:")
    val finalValue = readln().toInt()
    var sum=0
    var count=0.0
    for (number in initialValue..finalValue) {
        var result=0
        var text=number.toString()
        for(number1 in text.indices){
            result+=text[number1].digitToInt()
        }
        if(result>10) {
            sum += text.toInt()
            count++
        }

    }
    println(sum / count)
}

//100-1000 araliginda ededin tersi cut olan ededlerin cemini tapin. 123=321(false) 442=244(true)
fun task4() {
    println("Enter the initial value:")
    val initialValue = readln().toInt()
    println("Enter the final value:")
    val finalValue = readln().toInt()
    for (number in initialValue..finalValue) {
        val text=number.toString()
        var result=""
        for(numberIndex in text.length-1 downTo 0){
            result+=text[numberIndex]
        }
        if(result.toInt()%2==0){
            println("$result")
        }
    }
}