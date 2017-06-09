import java.time.Year
import java.util.*

fun main(args: Array<String> ){

    /* InPut */
    print("Tkaye sally le dayk bwnt bnwse:")
    var YearOfBirth:Int= readLine()!!.toInt()

    /* process */
    var year= Calendar.getInstance().get(Calendar.YEAR) // eme bo ewe katy computer eke bene nek xot boy bnwsey , bo ewey sallekanysh gorra to updatey nakaytawa xoy le kompywterekewe raykeshe
    var age= year - YearOfBirth

    /* Out Put */

    println("To Tement $age Salle")
    println("Her Temen Drej byt")



}
