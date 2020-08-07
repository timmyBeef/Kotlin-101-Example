package chapter03

fun main() {
    val name = "tim"
    var healPoints = 100

    // if
    if (healPoints == 100) {
        println(name + "is in exllent condition!")
    } else {
        println(name + "is in awful condition!")
    }

    // use val with if
    val healthStatus = if (healPoints == 100) {
        "is in exllent condition!"
    } else if (healPoints >= 90) {
        "has few scrathes"
    } else {
        "others"
    }
    println(name + " " +  healthStatus)

    val isImmortal = false;
    val auraVisible = healPoints > 50 || isImmortal
    val auracolor = if (auraVisible) "Green" else "NONE"
    println(auracolor)

    // use range
    val healthStatusRange = if (healPoints == 100) {
        "is in exllent condition!"
    } else if (healPoints in 90..99) {
        "has few scrathes"
    } else if (healPoints in 70..89) {
        "has some minor wounds"
    } else {
        "others"
    }

    // more about range
    println()
    println("more about range")
    println(1 in 1..3)       // true
    println((1..3).toList()) // [1, 2, 3]
    println(1 in 3 downTo 1) // true
    println(1 in 1 until 3)  // true
    println(3 in 1 until 3)  // false
    println(2 in 1..3)       // true
    println(2 !in 1..3)      // false
    println('x' in 'a'..'z') // true
    println()

    // when
    val healthStatusWhen = when (healPoints) {
        100 -> "is in exllent condition!"
        in 90..99 -> "has few scrathes"
        in 70..89 -> "has some minor wounds"
        else -> "others"
    }

    // string template
    // name + " " +  healthStatus to "$name $healthStatus"
    println("$name $healthStatus")

    // notice: need " "
    println("${if (true) "yes" else "no"}")
}