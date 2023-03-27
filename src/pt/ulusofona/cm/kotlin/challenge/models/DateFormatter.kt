package pt.ulusofona.cm.kotlin.challenge.models
import java.text.SimpleDateFormat
import java.util.Date

class DateFormatter(){
    companion object{
        fun format(value: Date): String{
            return SimpleDateFormat("dd-MM-yyyy").format(value)
        }
    }
}