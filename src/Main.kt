fun main() {

    task4()
}

//8 olculu list verilir.Hemin listde duplicate olan elementleri silmek Numune:1,2,3,5,7,3,2 Netice 1,5,7
fun task1() {
    println("Enter the size:")
    var numbers = readln().toInt()
    var myList1 = List(numbers) {
        println("Enter ${it + 1}-nd number: ")
        readln().toInt()
    }
    val myList2 = mutableSetOf<Int>()
    for (item1 in myList1) {
        myList2.add(item1)
    }
    println(myList2)
}

//8 olculu list verilir.Hemin liste unikal ededleri listden silmek.
//Numune:111,2221,332,567,778,321,232 Netice 567,321
fun task2() {
    println("Enter the size:")
    var numbers = readln().toInt()
    val myList1 = mutableListOf<Int>()
    for(i in 0 until numbers){
        println("Enter ${i + 1}-nd number: ")
        myList1.add(readln().toInt())
    }
    var myList2= mutableListOf<Int>()


    for(item in myList1){
        var numberToString=item.toString()
        var control=false
        outer@for(index2 in numberToString.indices){
            for(index3 in index2+1..<numberToString.length){
                if(numberToString[index2]==numberToString[index3]){
                    control=true
                    break@outer
                }
            }
        }
        if(!control){
            myList2.add(item)
        }
    }
    println(myList2)
}

//8 olculu mapListi verilb ve bu listde Key olarak studentId ve onun qiymeti saxlanilir
//Hemin listi qiymete uygun olarak artan sirada nizamlayın
fun task3() {
    var studentGrades= mutableMapOf(
        "studentId" to 78,
        "studentId" to 56,
        "studentId" to 56,
        "studentId" to 99,
        "studentId" to 67,
        "studentId" to 100,
        "studentId" to 51,
        "studentId" to 34,
        "studentId" to 17)

    for(item1 in studentGrades.values){
        for(item2 in item1+1..<studentGrades.values){
            if(item1>item2){
                var change=studentGrades.values[item1]
                studentGrades.values[item2]=studentGrades.values[item1]
                studentGrades.values[item2]=change
            }
        }
    }
    println(studentGrades)
}

//8 olculu setListi verilib ve bu listde 2 ve 8 bölünen ededlerin cemini tapin
fun task4() {
    println("Enter the size:")
    var numbers = readln().toInt()
    val mySet = mutableSetOf<Int>()
    for(i in 0 until numbers){
        println("Enter ${i + 1}-nd number: ")
        mySet.add(readln().toInt())
    }
    var sum=0
    for(item in mySet){
        if(item%2==0 || item%8==0){
            sum+=item
        }
    }
    println(sum)
}

//8 olculu list verilir ve bu listde tekrar olan ededlerin cemini tapan
//10,20,30,10,20,30,40,10,20  Netice:10+20+30=60
fun task5() {
    println("Enter the size:")
    var numbers = readln().toInt()
    val myList1 = mutableListOf<Int>()
    for(i in 0 until numbers){
        println("Enter ${i + 1}-nd number: ")
        myList1.add(readln().toInt())
    }
    var count=0
    var sum=0
    for(item1 in myList1.indices){
        for(item2 in (item1 + 1)..<(myList1.size - 1)){
            if(myList1[item1]==myList1[item2]){
                count++
            }
            if(count==1){
                sum+=myList1[item1]
            }
        }
    }
    println(sum)
}