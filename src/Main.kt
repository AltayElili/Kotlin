fun main() {

//      val myList = mutableListOf(
//        Person("Altay", 24, 177),
//        Person("Vusal", 25, 172),
//        Person("Eli", 26, 183))
//    myList?.let {
//        PersonTable(userName = it.name, age = it.age )
//    }



//    val myObject=Retrofit()
//    myObject.apply{
//        name="Altay"
//    }.apply { age=25 }.apply { myObject.setToken() }
}

//1.String tipinde nullable deyisesiniz olsun.Scoped funksiyadan istifade edilmelidi ve bosluqlari silib ve metnin
// birinci herfini boyuk edib alinan neticeni ekrana cixardin
fun task1() {
    var myText: String? = "bugun ayin 16-dir"
    myText = myText?.run {
        this.trim()
        this[0].uppercase() + myText?.substring(1)
    }
    println(myText)
}

//2.Bir Person,PersonTable,Db classiniz olsun.Db Classinizin icinde insert funksiyasi olsun ve persontableni qebul etsin.
//Person classinin Listini yaradin ve 3 setir daxil edin.Scoped functiondan istifade ederek Person classinin(mapsiz)
// PersonTable classina vecirib insert funksiyasini cagirin.
//Qeyd edim her defe meselen person.name yazmaga ehtiyac qalmasin
    data class Person(
        val name: String,
        val age: Int,
        val height: Int
    )

    data class PersonTable(val userName: String, val age: Int)

    data class Db(val idk: String) {
        fun insert(personTable: PersonTable) {

        }
    }

//3.Eyni 2-ci mesele sadece person listinde person nullable olacaq


//4.Retrofit classiniz olsun ve 3 dene funksiya olsun setBaseUrl,setTimeOut,setToken.Bu classin obyektini yaradan zaman
// scoped functiondan istifade edin
    fun task4(){
        class Retrofit {
        }
        var name = ""
        var age: Int = 0
        fun setBaseUrl() {}
        fun setTimeOut() {}
        fun setToken() {}
    }

//5.Int tipinde listiniz olsun bura 2 index 10 elementi elave edib sonuncu elementi silin ve scoped funskiyadan istifad
// edin
fun task5() {
        val myList1= mutableListOf(23,45,65,7687,21,354,2,21,43,756,3,23)
    myList1.let {
        it.removeLast()
        println(myList1)
    }
}