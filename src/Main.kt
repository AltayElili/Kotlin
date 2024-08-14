fun main() {

//val myList1= mutableListOf(10,12,4,6,11)
//    println(myList1.removeFirstOrNull())

    val myList4= mutableListOf(3,4,5,1,7,8)
    println(myList4.maxByOrNull {
        it>5
    })
}

//Find
fun <T> myFind(myList1: MutableList<T>, condition:(T)-> Boolean):T?{
    var result:T?=null
    for(item in myList1){
        if(condition(item)){
            result=item
            return result
        }
    }
    return null
}

//FindLast
fun <T> myFindLast(myList2:MutableList<T>, condition: (T) -> Boolean):T?{
    val myNewList= myList2.reversed()
    for(item in myNewList){
        if(condition(item)){
            return item
        }
    }
    return null
}
//removeFirstorNull
fun <T> myRemoveFirstOrNull(myList3: MutableList<T>):T?{
    return if(myList3.isNotEmpty()){
        myList3.removeAt(0)
    }
    else {
        null
    }
}

//FirstOrNull
fun <T> myFirstOrNull(myList4: MutableList<T>):T?{
    return if(myList4.isNotEmpty()){
        myList4[0]
    }
    else {
        null
    }
}

//maxByOrNull
fun <T,K> myMaxByOrNull(myList5: MutableList<T>, condition: (T) -> K):T?{
    var maxElement :T? = myList5[0]
    for(item in myList5){
        if(condition(item)){

        }
    }
}
