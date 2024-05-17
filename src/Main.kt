fun main() {
    println("-------------Lesson8_Altay-------------")
    task5()
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
        var text = number.toString()
        for(number1 in text.indices){
            result+=text[number1].digitToInt()
        }
        if(result>10) {
            sum += text.toInt()
            count++
        }
    }
    println("The numerical mean of numbers greater than 10:  \"${sum / count}\"")
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
            println("The sum of even numbers with the inverse of a number:$result")
        }
    }
}

//10 olculu massiv verilmisdir massivde duplikat olan ededlerin cemini tapin.Numune 10 20 10 40 50 20 70 70 70 -5
// Result:10+20+70=100
fun task5() {

    print("Enter the size:")
    val size = readln().toInt()
    val myArray = Array(size) { // 1 2 1 2 3 4 3 4
        println("Enter ${it + 1}-nd number:")
        readln().toInt()
    }
    var result = 0
    for (numberOne in myArray.indices) {
        var count = 0
        for (numberTwo in numberOne+1..<myArray.size) {
            if (myArray[numberOne] == myArray[numberTwo]) {
                count++
            }
        }
        if(count==1){
            result+=myArray[numberOne]
        }
    }
}

//10 olculu massiv verilmisdir ikinci en boyuk elementi tapin
fun task6() {
    print("Enter the size:")
    val size = readln().toInt()
    val numbers = Array(size) { // 10 12 11 10 9 8 13
        println("Enter ${it + 1}-nd number:")
        readln().toInt()
    }
    var max1 = numbers[0] //13
    var max2 = numbers[0] // 12
    for (maxNumber1 in numbers) {
        if (maxNumber1 > max1) {
            max1 = maxNumber1
        }
    }
    for(maxNumber2 in numbers){
        if(maxNumber2 in (max2 + 1)..<max1){
            max2=maxNumber2
        }
    }
    println("The second largest number:$max2")
}

