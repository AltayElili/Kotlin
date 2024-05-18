fun main () {
println("_________________Lesson9_Altay_________________")

    task11()

}

//6 olculu int tipinde massiv verilib.Bu massive ededler ekrandan daxil edilir.Bu massivin max elementini tapin.
fun task1() {
    println("Enter the size:")
    var size= readln().toInt()
    var numbers=Array(size){
        println("Enter the ${it+1}-nd number ")
        readln().toInt() }

    var max=numbers[0]
    for(item in numbers){
        if(item > max){
            max=item
        }
    }
    println("Max number is: $max")
}
//6 olculu int tipinde massiv verilib.Bu massive ededler ekrandan daxil edilir.Bu massivin min elementini tapin.
fun task2() {
    println("Enter the size:")
    var size= readln().toInt()
    var numbers=Array(size){
        println("Enter the ${it+1}-nd number ")
        readln().toInt() }

    var min=numbers[0]
    for(item in numbers){
        if(item < min){
            min=item
        }
    }
    println("Min number is: $min")
}

//6 olculu int tipinde massiv verilib.Bu massive ededler ekrandan daxil edilir.Bu massivin elemenlerinin ededi
// ortasini tapin.
fun task3(){
    println("Enter the size:")
    var size= readln().toInt()
    var numbers=Array(size){
        println("Enter the ${it+1}-nd number ")
        readln().toInt() }

    var sum = 0
    var count=0
    for (item in numbers){
        sum +=item
        count++
    }
    var average=sum/count
println("The numerical mean of the numbers entered: $average")
}

//100-1000 kimi ededlerin icinden unikal ededleri ekrana cixardin.Numune 123,653 reqemler tekrarlanmir
fun task4() {
    println("Enter the initial value:")
    val initialValue= readln().toInt()
    println("Enter the final value:")
    val finalValue= readln().toInt()
    for (item in initialValue..finalValue){
        var text=item.toString()
        var control=false
        for(index1 in text.indices){
            for(index2 in index1+1..<text.length){
                if(text[index1] == text[index2]){
                    control=true
                }
            }
        }
        if(!control && item>10){
            println(item)
        }
    }
}

//100-1000 kimi ededlerin icinden polindrom ededler ekrana cixardin:Numune 121,242,111 soldan ve sagdan eyni cur oxunur
fun task5() {
    println("Enter the initial value:")
    val initialValue = readln().toInt()
    println("Enter the final value:")
    val finalValue = readln().toInt()
    for (item in initialValue..finalValue) {
        var text=item.toString()
        var result=""
        for(index in text.length-1 downTo 0 ){
              result+=text[index]
            }
        if(result==text){
            println(item)
        }
    }
}


//1-100 kimi ededlerin icinden hem 3 hemde 9 bolunen ededlerin cemini cixardin
fun task6() {
    println("Enter the initial value:")
    val initialValue = readln().toInt()
    println("Enter the final value:")
    val finalValue = readln().toInt()
    for(item in initialValue..finalValue){
        if(item%3==0 && item%9==0){
            println("$item")
        }
    }
}
//"Bugun  28.03.2023 tarixinde 27 qeza bas vermisdir" cumlesinde ededlerin cemini tapın(Dovr ile)
fun task7(){
    var text="Bugun  28.03.2023 tarixinde 27 qeza bas vermisdir"
    var sum=0
    for(number in text){
        if(number.isDigit()) {
            sum += number.digitToInt()
        }
    }
    println("$sum")
}

//1-100 kimi ededlerin icinden sade ededlerin cemini tapin
fun task8(){
    println("Enter the initial value:")
    val initialValue = readln().toInt()
    println("Enter the final value:")
    val finalValue = readln().toInt()

    var sum=0
    for(number in initialValue..finalValue){
        var control = false
        for(item in 2..<number){
                if (number % item == 0) {
                    control = true
                }
            }
        if(!control && number!=1){
            sum+=number
            println("$sum")
        }
    }
}
//1-100 kimi ededlerin icinden murekkeb ededlerin cemini tapin
fun task9() {

    println("Enter the initial value:")
    val initialValue = readln().toInt()
    println("Enter the final value:")
    val finalValue = readln().toInt()

    var sum=0
    for(number in initialValue..finalValue){
        for(item in 2..<number){
            if (number % item == 0) {
            }
            sum+=number
        }
        println("$number")
    }
    println("$sum")
}
//1-100 kimi ededlerin icinden hem 3 ve ya 8 bolunen ededlerin cemini tapin.
fun task10() {
    println("Enter the initial value:")
    val initialValue = readln().toInt()
    println("Enter the final value:")
    val finalValue = readln().toInt()

    var sum=0
    for(numbers in initialValue..finalValue){
        if(numbers%3==0 || numbers%8==0){
            sum+=numbers
        }
    }
    println("$sum")
}
//6 olculu int tipinde massiv verilib.Bu massive ededler ekrandan daxil edilir.Bu massivi artan sirada duzun.
fun task11() {
    println("Enter the size:")
    var size= readln().toInt()
    var numbers=Array(size){
        println("Enter the ${it+1}-nd number ")
        readln().toInt() }
    //10 5 11
    for(item in numbers.indices){
        for (item2 in numbers.indices){
            if(numbers[item]<numbers[item2]){
                var result=numbers[item]
                numbers[item]=numbers[item2]
                numbers[item2]=result
            }
        }
    }
    println(numbers.contentToString())
}
//100-1000 araliginda butun reqemleri tekrar olan ededlerin ededi ortasini tapin.Numune:111,222 111+222/2 2 burda el ile yazilmasin bu 4,5,6 reqemler ucunde odensin
//100-1000 araliginda butun sade ve murekkeb ededlerin sayini tapan proqram yazin.Her ikisinin sayini
//100-1000 araliginda reqemlerinin cemi 10-dan boyuk olan ededlerin ededi ortasini tapin.Numune 945=17(true) 123=6(false)
//100-1000 araliginda ededin tersi cut olan ededlerin cemini tapin. 123=321(false) 442=244(true)
//10 olculu massiv verilmisdir massivde duplikat olan ededlerin cemini tapin.Numune 10 20 10 40 50 20 70 70 70 -5  Result:10+20+70=100
//10 olculu massiv verilmisdir ikinci en boyuk elementi tapin