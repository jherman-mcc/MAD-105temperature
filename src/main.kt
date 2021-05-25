import kotlin.math.abs

fun main (args: Array<String>) {
    var temp = 80
    var low = 97.5
    var high = 99.5

    while (temp != 0) {
        print("Enter the current temperature: ")
        temp = readLine()!!.toInt()
        if (temp < 97.5)
            println("Temperature is $temp and it is low")
        else if (temp > 99.5)
            println("Temperature is $temp and it is high")
        else
            println("Temperature is $temp and it is normal")
    }


}