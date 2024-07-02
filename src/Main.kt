fun main () {

//    val day= Days.Tuesday
//    val status= WorkStatus.inGraduation
//    println("Salary is: ${salary(day, status)} ")
    val months=Months(MonthStatus.Jule)
    when(months.status){
        MonthStatus.January -> {
            println("Season is Winter")
        }
        MonthStatus.February -> {
            println("Season is Winter")
        }
        MonthStatus.March -> {
            println("Season is Winter")
        }
        MonthStatus.April -> {
            println("Season is Spring")
        }
        MonthStatus.May -> {
            println("Season is Spring")
        }
        MonthStatus.June -> {
            println("Season is Spring")
        }
        MonthStatus.Jule -> {
            println("Season is Summer")
        }
        MonthStatus.August -> {
            println("Season is Summer")
        }
        MonthStatus.September -> {
            println("Season is Summer")
        }
        MonthStatus.October -> {
            println("Season is Autumn")
        }
        MonthStatus.November -> {
            println("Season is Autumn")
        }
        MonthStatus.December -> {
            println("Season is Autumn")
        }
    }

}
class Months(val status: MonthStatus){

}

enum class MonthStatus(val number:Int){

    January(1),
    February(2),
    March(3),
    April(4),
    May(5),
    June(6),
    Jule(7),
    August(8),
    September(9),
    October(10),
    November(11),
    December(12)
}


enum class WorkStatus{
    inGraduation,
    inBusinessTrip,
    OnlineWorking,
    notAtWork
}

enum class Days {
    Monday,
    Tuesday,
    Wednesday,
    Thirsday,
    Friday,
    Saturday,
    Sunday
}

fun salary(day: Days, workStatus: WorkStatus): Int {
    val salary= 1000
    return if(day in Days.Monday .. Days.Friday) {
        salary
    } else {
        when (workStatus) {
            WorkStatus.inGraduation -> salary + 40
            WorkStatus.OnlineWorking -> salary + 20
            WorkStatus.inBusinessTrip -> salary + 50
            WorkStatus.notAtWork -> salary
        }
    }
}