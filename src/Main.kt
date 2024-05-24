fun main() {
    println("-----------------Lesson10_Altay-----------------")
    task4()
}

//ededin cut reqemlerinin ededi ortasini hesabla
fun task1() {
    println("Enter the number:")
    var number= readln().toLong()

    var sum = 0L
    var count=0.0
    while(number>0){
        var numbers=number%10
        number/=10
        if(numbers==0L){
            continue
        }
        if(numbers%2==0L){
            count++
            sum+=numbers
        }
    }
    println("The numerical mean of the even digits of the number:${sum/count}")
}

//Reqemlerinin sayi tek olan eded daxil edilir. Ededin soldan ve sagdan beraberliyin yoxla. 121 1=1, 1234123= 123=123
fun task2() {
    println("Enter the number:")
    var number= readln().toInt()
    var num1=number

    var count=0
    var count1=0
    var rightSideNumber=0

    var control=true
    while(num1>0){
        num1/=10
        count++
    }
    if(count%2==0){
        control=false
    }
    if(!control){
        println("You entered a number with an even number of digits!!")
    }
    var middleNumber=count/2//1234123
    var rightNumbers=0
    var leftNumbers=0 //3 32

    while (count1<middleNumber){ //123412 3
        count1++
        var lastNumber=number%10
        rightNumbers=(rightNumbers*10)+lastNumber
        number/=10
    }
    while(number>0 && number!=1){
        number/=10
        var firstNumber=number%10
        leftNumbers=(leftNumbers*10)+firstNumber
    }
    if(rightNumbers==leftNumbers){
        println("They are equal")
    }
    else{
        println("They are not equal")
    }
    println(rightNumbers)
    println(leftNumbers)
}

//Massivde 3 ve 8e bolunenlerini nezere alma(continue)
fun task3() {
    println("Enter the initial value:")
    var initialValue= readln().toInt()
    println("Enter the final value:")
    var finalValue= readln().toInt()

    for(number in initialValue..finalValue){
        if(number%3==0 || number%8==0){
            continue
        }
        println("Numbers that are not divisible by 3 or 8:$number")
    }
}

//ededin reqemlerinin hasilleri cemi 20-den boyuk olduqda dovrden cixsin(break)
fun task4() {
    println("Enter the initial value:")
    var initialValue= readln().toInt()
    println("Enter the final value:")
    var finalValue= readln().toInt()


    for(number in initialValue..finalValue){
        var sumOfNumbers=0
        var multipleOfNumbers=1
        var num1=number
        while(num1>0){
            var num2=num1%10
            num1/=10
            multipleOfNumbers*=num2
        }
        while(multipleOfNumbers>0){
            var num3=multipleOfNumbers%10
            multipleOfNumbers/=10
            sumOfNumbers+=num3
        }
        if(sumOfNumbers>20){
            println("The sum of the digits of this number is greater than 20:.\"$number\"")
            break
        }
    }
}

//Massivde ededlerin kvadratlari 600-den boyuk olduqda ilk hemin ededi versin (break)
fun task5(){
    println("Enter the initial value:")
    var initialValue= readln().toInt()
    println("Enter the final value:")
    var finalValue= readln().toInt()

    var num1=0
    outer@for(number in initialValue..finalValue){
        while(number*number>600){
            num1+=number
            break@outer
        }
    }
    println("The square of this number is greater than 600:\"$num1\"")
}