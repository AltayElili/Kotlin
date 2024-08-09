fun main() {
    val myList1= mutableListOf(5,10,6,7,11,23,8,13,10)
    println(mySingle(myList1){
        it%5==0 && it%3==0
    })

    val myList2= listOf(5,10,15,20,25,30,45)
    println(myFindLast(myList2) {
        it%10==0
    })

    val myList3 = listOf(
        Customer("Huseyn", 21, 177),
        Customer("Pirqulu", 18, 167),
        Customer("Agababa", 23, 192),
        Customer("Mesedi", 32, 187)
    )
    println(myCount(myList3) {
        it.age>20 && it.height>170 && it.height<190
    })

    val myList4= mutableListOf(
        Person(1, "Altay"),
        Person(2, "Vuqar"),
        Person(3, "Nemet"),
        Person(4, "Vuqar"),
        Person(5, "Altay"),
        Person(6, "Vidadi")
    )
    println(myDistinctBy(myList4){
        it.name
    })

    val myList5= mutableListOf(6,10,18,19,22,25,30,45)
    println(myDropWhile(myList5) {
        it%2==0
    })
}

////single funksiyasinin analoqunu yazmaq.Cagirilan hissede 5 ve 3 bölünen ededi tapmaq
fun <T> mySingle(myList1: List<T>, condition: (T)-> Boolean) :T {
    var count = 0
    var result : T = 0
    for(item in myList1){
        if(condition(item)){
            count++
            result=item
        }
        if(count==1){
            return throw result
        }
    }
    return -1
}

//findlast funksiyasinin analoqunu yazmaq.Cagirilan hissede 10 bölünen ededlerin icinden en sonuncusunu tapmaq
fun <T> myFindLast(myList2:List<T>, condition: (T) -> Boolean):T {
    var myNewList = myList2.reversed()
    for (item in myNewList) {
        if (condition(item)) {
            return item
        }
    }
    return -1
}

//count funksiyasinin analoqunu yazmaq.Customer(name,age,height) modeli olsun.List bu tipde olsun.Yasi 20-den boyuk boyu
// ise 170-den boyuk 190-dan kicik müşterinin sayini tapsın.
data class Customer(val name:String, val age:Int, val height:Int)

fun <T> myCount(myList3:List<T>, condition: (T) -> Boolean):Int {
    var count=0
    for(item in myList3){
        if(condition(item)){
            count++
        }
    }
    return count
}

//distinctBy funksiyasinin analoqunu yazmaq.Person(id,name) modeli olsun.List bu tipde olsun.Cagirilan hissede name
//gore distinct etmek mümkün olsun.
data class Person(val id:Int, val name:String)

fun <T,K> myDistinctBy(myList4:List<T>, condition: (T) -> K):MutableList<T>{
    var mySet= mutableSetOf<K>()
    var myNewSet= mutableListOf<T>()
    for(item in myList4){
        val selectedItem=condition(item)
        if(mySet.add(selectedItem)){
            myNewSet.add(item)
        }
    }
    return myNewSet
}


//dropWhile funkasiyasinin analoqunu yazmak.Cagirilan hissede cut ededi silmek.
fun <T> myDropWhile(myList5:MutableList<T>, condition:(T)->Boolean):List<T>{
    var control=false
    var myNewList= mutableListOf<T>()
    for(item in myList5){
        if(control){
            myNewList.add(item)
        }
        else if (!condition(item)) {
            myNewList.add(item)
            control=true
        }
    }
    return myNewList
}

