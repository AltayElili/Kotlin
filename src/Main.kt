fun main() {

////             FindLast task
//    val myList1= listOf(5,10,15,20,25,30,45)
//    println(myList1.findLast {
//        it%10==0
//    })
//    println(myFindLast(myList1){
//        it%10==0
//    })
//
////                   DropWhile Task
//    val myList2= mutableListOf(6,10,18,19,22,25,30,45)
//    println(myList2.dropWhile {
//        it%2==0
//    })
//    println(myDropWhile(myList2) {
//        it%2==0
//    })
////
////                 Count task
//    val myList3 = listOf(
//        Customer("Huseyn", 21, 177),
//        Customer("Pirqulu", 18, 167),
//        Customer("Agababa", 23, 192),
//        Customer("Mesedi", 32, 187)
//    )
//    println(myList3.count {
//        it.age>20 && it.height>170 && it.height<190
//    })
//    println(myCount(myList3) {
//        it.age>20 && it.height>170 && it.height<190
//    })
//
////                  Single Task
//    val myList4= listOf(5,10,16,20,25,30,46)
//      println(mySingle(myList4){
//        it%3==0 && it%5==0
//    })
//
////     DistinctBy Task
//   val myList5 = listOf(
//       Person(1, "Altay"),
//       Person(2, "Vuqar"),
//       Person(3, "Nemet"),
//       Person(4, "Vuqar"),
//       Person(5, "Altay"),
//       Person(6, "Vidadi")
//   )
//    println(myList5.distinctBy {
//        it.name
//    })
//    println(myDistinctBy(myList5){
//        it.name
//    })

}
// 1 sert 1 list daxilinde yalniz 1 ve ya 1den cox defe odenirse single elementin ozunu qaytarir, hec odenmirse -1
// qaytarir
//single funksiyasinin analoqunu yazmaq.Cagirilan hissede 5 ve 3 bölünen ededi tapmaq
fun mySingle(list: List<Int>, condition: (Int)-> Boolean):Int{
    var count=0
    var result=0
    for(item in list){
        if(condition(item)){
            count++
            result+=item
        }
    }
    if(count==1){
        return result
    }
    return -1
}

//findlast funksiyasinin analoqunu yazmaq.Cagirilan hissede 10 bölünen ededlerin icinden en sonuncusunu tapm
fun myFindLast(list: List<Int>, condition: (Int)-> Boolean){
    for(item in list.size-1 .. 0){
        var control=false
        if(condition(list[item])){
            control=true
        }
        if(control){
            println(item)
        }
    }
}

//count funksiyasinin analoqunu yazmaq.Customer(name,age,height) modeli olsun.List bu tipde olsun.Yasi 20-den boyuk
// boyu ise 170-den boyuk 190-dan kicik müşterinin sayini tapsın.
data class Customer(val name:String, val age:Int, val height:Int )

fun myCount(list: List<Customer>, condition: (Customer) -> Boolean) :Int{
    var count=0
    for(element in list){
        if(condition(element)){
            count++
        }
    }
    return count
}

//dropWhile funkasiyasinin analoqunu yazmak.Cagirilan hissede cut ededi silmek.
fun myDropWhile(list: MutableList<Int>, condition: (Int) -> Boolean) :List<Int>{
    var control=false
    val myList= mutableListOf<Int>()
    for(item in list){
        if(control){
            myList.add(item)
        }
        else if(!condition(item)){
            myList.add(item)
            control=true
        }
    }
    return myList
}

data class Person(val id:Int, val name:String )

fun myDistinctBy(list: List<Person>, condition: (Person) -> String):List<Person>{
    val mySet= mutableSetOf<String>()
    val myList = mutableListOf<Person>()
    for(item in list){
        val name = condition(item)
        if(mySet.add(name)){
            myList.add(item)
        }
    }
    return myList
}