import java.util.Scanner
import kotlin.math.min

//// zadanie 1
fun timeAgo(secondsAgo: Int):String
{
    return when (secondsAgo) {
        in 0..60 -> "Был(а) только что"
        in 61..60*60 -> "${calculationMin(secondsAgo/60)} назад был(а) в сети "
        in 60*60+1..24*60*60 -> "${calculationHours(secondsAgo/(60*60))} назад была(а) в сети"
        in 24*60*60+1..48*60*60 -> "Был(а) в сети вчера"
            in 48*60*60+1..72*60*60 -> "Был(а) всети позавчера"
        else -> "Был(а) всети давно"
    }
}
fun calculationMin (minutes:Int):String{
    return when{
        minutes % 10 in 2..4 -> "$minutes минуты"
        minutes % 100 in 11..14 -> "$minutes минут"
        minutes % 10 == 1 -> "$minutes минуту"

        else -> "${minutes}минут"
    }
}
fun calculationHours(hours:Int):String{
    return when{
        hours % 10 in 2..4 -> "$hours часа"
        hours % 100 in 11..14 -> "$hours часов"
        hours % 10 == 1 -> "$hours час"

        else -> "${hours}часов"
    }
}
fun main(){
    println("Введите сколько секунд назад вы были всети")
    val scanner = Scanner(System.`in`)
    val secondsAgo = scanner.nextLine().toInt()
    println(timeAgo(secondsAgo))
}


