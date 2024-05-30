@file:Suppress("UNREACHABLE_CODE")

fun main() {
    println(summaryRec(100))
}

//rekursiv funksiya vasitesile faktorial hesablanmasi
fun factorialRec(item: Int):Int{
    return if(item == 1)
    { 1 }
    else {
        item*(factorialRec(item-1))
    }
}

//1-100 kimi ededlerin rekursiv funksiya ile toplanmasi
//100+99
//99+98
//98+97
//97+96

fun summaryRec(item:Int):Int{
    return if(item==1)
    {1}
    else {
        item + summaryRec(item-1)
    }
}

//faktorialin tail rekursiv funksiya ile tapilmasi
tailrec fun factorialTailRec(item:Int, step: Int):Int{
    //5-1, 5*1
    //4-1, 4*5
    //3-1, 3*20
    //2-1, 2*60
    //item 1 olur deye son step neye beraberdise onu verir
    return if(item==1){step}
    else factorialTailRec( item-1 ,item*step)
}

