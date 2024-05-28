import kotlin.math.min
fun  main() {
    val text= "Salam usaqlar"
    println(stringReplace(text, 's', 'e'))
}
fun subString(text: String, starIndex: Int=0): String {
    var result = ""
    for (index in starIndex..<text.length) {
        result += text[index]
    }
    return result
}
fun subString(text: String, starIndex: Int, endIndex: Int=0): String {
    var result = ""
    for (index1 in starIndex..endIndex) {
        result += text[index1]
    }
    return result
}
fun stringDrop(text: String,drop:Int=0):String{
    var result=""
    for(index in drop..<text.length){
        result+=text[index]
    }
    return result
}
fun padStart(text: String, size: Int, item: Char):String{

    var result=""
    for(index1 in text.length..size){
        result+=item
    }
    result=result+text
    return result
}
fun padEnd(text: String, size: Int, item: Char):String{

    var result=""
    for(index1 in text.length..size){
            result += item
    }
    result=text+result
    return result
}
fun mathPow(element:Int,powerOfNumber:Double):Double{

    var result=0.0
    if(element>0 && powerOfNumber>0){
        var multiply=element
        for(item in 1..<powerOfNumber.toInt()){
            multiply=multiply*element
        }
        result+=multiply
    }
    if(powerOfNumber==0.0){
        result==1.0
    }

    if(powerOfNumber<0.0){
        var multiply=1.0/element
        for(item in -1 downTo powerOfNumber.toInt()+1){
            multiply=(multiply*1.0/element)
        }
        result+=multiply
    }
    return result
}
fun bubbleSort(massiv: Array<Int>):String{
    for(index1 in 0..<massiv.size){
        for(index2 in index1+1..<massiv.size){
            if(massiv[index1]>massiv[index2]){
                val minElement=massiv[index1]
                massiv[index1]=massiv[index2]
                massiv[index2]=minElement
            }
        }
    }
    return massiv.contentToString()
}
fun polindromNumbers(element:Int):Boolean{
    var number=element.toString()
    var reverseNumber=""
    var control=true
    for(index in number.length-1 downTo 0) {
        reverseNumber += number[index]
    }
    if(element!=reverseNumber.toInt()){
        control=false
    }
    return control
}
fun uniqueNumber(element: Int):Boolean{
    val number=element.toString()
    var control=true
    for(index1 in 0..<number.length){
        for(index2 in index1+1..<number.length){
            if(number[index1]==number[index2]){
            control=false
            }
        }
    }
    return control
}
fun selectedNumbers(massiv: Array<Int>): String {
    var count = 0
    for (item in massiv) {
        if (item % 3 == 0 && item % 5 == 0) {
            count++
        }
    }
    val myMassiv = Array(count) {0}
    var index = 0
    for (item in massiv) {
        if (item % 3 == 0 && item % 5 == 0) {
            // Şərti ödəyən elementi yeni massivə əlavə etmək
            myMassiv[index] = item
            index++
        }
    }
    return myMassiv.contentToString()
}
fun indexOf(text: String, item: Char): String {

    var count=0
    for(element in text){
        if(item == element){
            count++
        }
    }
    val myMassive=Array(count) {0}
    var index=0
    for(element in text.indices){
        if(item == text[element]){
            myMassive[index] = element
            index++

        }
    }
    return myMassive.contentToString()
}
fun stringReplace(text:String, oldChar: Char, newChar: Char):String{
    var text1=text
    outer@for(index in 0..<text1.length) {
        if(oldChar==text1[index]){
           text1[index] = newChar
            break@outer
        }
    }
    return text1
}



