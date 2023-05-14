package br.com.first_proj.estruturada

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Date

fun main() {
    val date = Date()
    val localDate = LocalDate.now()
    val localDateTime = LocalDateTime.now()

    // Parse
    var parseFromStr = LocalDate.from(DateTimeFormatter.ofPattern("dd/MM/yyyy").parse("17/02/2023"))
    var parseFromStrWithTime = LocalDateTime.from(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").parse("17/02/2023 04:00"))
    var simpleFormat = SimpleDateFormat("dd/MM/yyyy")
    var simpleFormat2 = SimpleDateFormat("yyyyHHdd")

    var yesterdayDate = simpleFormat.parse("17/02/2023")

    println(parseFromStr)
    println(parseFromStrWithTime)
    println(yesterdayDate)
}
