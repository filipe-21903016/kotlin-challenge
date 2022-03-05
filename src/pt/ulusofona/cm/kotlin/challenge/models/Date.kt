package pt.ulusofona.cm.kotlin.challenge.models

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Local

data class Date(private var dataString:String) {
    private val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    var data : LocalDate = LocalDate.parse(dataString, formatter)

    override fun toString(): String {
        return data.format(formatter).toString()
    }

    companion object{
        private val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
        fun now() : Date
        {
            val now : LocalDate = LocalDate.now()
            val nowString = now.format(formatter).toString()
            return Date(nowString)
        }
    }

}