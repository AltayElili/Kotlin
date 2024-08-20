fun main() {
    
    try {
//        val myText="Bpgpn myyn drr"
//        println(checkVowels(myText))

        val myList4= mutableListOf(1,3,6,4,12,7)
        println(checkDublicates(myList4))
    }catch (error:NoVowelsException){
        println(error.message)
    }catch (error:DublicateNumberException){
        println(error.message)
    }
}

//DivideNumbers adinda bir funksiya olur ve int tipinde 2 parametr qebul edir.(dividend, divisor).Eger divisor 0 olarsa
//verilmis eded 0 bolune bilmedi xetasi atsin.Bu funksiyani cagirdigimiz xetani tutmaga calisaq ve eger xeta bas vererse
//funksiyadan gelen xetani ekrana cixardaq(ex.message)
fun divideNumbers(dividend:Int, divisor:Int){
    try{
        dividend/divisor
    }catch (error:ArithmeticException){
        println("Cannot be divided by zero!!!")
    }
}

//Iki funksiya olur tryNumber ve checkEvenNumber
//checkEvenNumber ededin cut olub olmamagin yoxlayir ve geriye deyer qaytarmir.Sadece eger eded 2 ye bolunmurse xeta atir
//ve IllegalArgumentException atir ve message olaraq eded tekdir deyir.
//tryNumber funksiyasi int tipinde parametr qebul edir ve bu qebul eden parametri checkEvenNumbere gonderir.
//Bu funksiya checkEvenNumberi cagiranda xetani tutur eger xeta bas vermirse bu eded cutdur ekrana cixardir eks halda
//xeta verer messageni ekrana cixardir.
fun checkEvenNumber(item1:Int){
    if(item1%2!=0){
        throw IllegalArgumentException("Eded tek ededdir")
    }
}

fun tryNumber(item2:Int){
    try {
        checkEvenNumber(item2)
    }catch (error:IllegalArgumentException){
        println("")
    }

}

//checkVowels adinda funksiya olsun ve string tipinde bir deyer qebul etsin funksiya hec bir deyer qaytarmasin.Eger
//funksiyada sait yoxdusa xeta qaytaracaq ve Metnde sait yoxdur mesaji verecek.Ancaq bu xeta ucun oz sexsi xeta classinizi
//yaratmalisiz. NoVowelsException classini yaradirsiz bu tipde xetani atirsiz. checkVowels funksiyasi cagirilan yerde eger
//hec bir xeta vermezse bu metnde sait var eger xeta bas vererse geri donderdiyiniz xeta mesajini ekrana cixartmaq.
fun checkVowels( text:String){
    val myList= mutableListOf("a", "e" , "ə", "i","ı", "o", "ö", "u", "ü", "A", "I", "Ə", "İ", "Ö", "Ü", "U", "E", "O")
    var control=false
    for(item1 in myList) {
        for (item2 in text) {
            if(item1==item2.toString()){
                control=true
                break
            }
        }
    }
    if(control){
        println("metnde sait var")
    }
    else{
        throw NoVowelsException("Metnde sait yoxdur")
    }
}

class NoVowelsException(message: String):Exception(message)

//checkDuplicates adinda bir funksiya olur bu funksiya Int tipinde list qebul edir.Bun funksiyanin isi duplicatin olub
//olmamagini yoxlayir.Eger duplicat olarsa Duplicate_Number_Exception adinda sexsi exception classinin xetasini atir.Bu
//funksiya cagirilan yerde xetani tutur eger xeta varsa mesaji ekrana cixardir.Xeta yoxdu duplikat element yoxdur messaji
//ekrana cixir.
fun checkDublicates(myList:MutableList<Int>):String{
    val string="Dublikate element yoxdur"
    for (index1 in myList.indices) {
        for (index2 in index1+1..<myList.size) {
          if(myList[index1]==myList[index2]) throw DublicateNumberException("Bu siyahida dublicate element var")
        }
    }
    return string
}

class DublicateNumberException(message:String):Exception(message)
