import java.awt.MenuItem
import kotlin.math.sign
import java.sql.Array as Array1

fun  main() {
    var text="Salam usaqlar. Bu gun 11-ci dersin tapsirigini yoxlayaciq."
    println(padStart(text, size = 5, item = 'a'))
}
//

fun subString(text: String, starIndex: Int): String {
    var result = ""
    for (index in starIndex..<text.length) {
        result += text[index]
    }
    return result
}

fun subString(text: String, starIndex: Int, endIndex: Int): String {
    var result = ""
    for (index1 in starIndex..endIndex) {
        result += text[index1]
    }
    return result
}

fun stringDrop(text: String,drop:Int):String{
    var result=""
    for(index in 0..text.length-drop){
        result+=text[index]
    }
    return result
}

// Salam usaqlar.
// 00000 Salam usaqlar.
fun padStart(text: String, size: Int, item: Char):String{
//
//    var result=""
//    for(index1 in 0..text.indices-1){
//        result+=text[index1]
//    }
//    return result
}