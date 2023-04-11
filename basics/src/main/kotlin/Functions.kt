// calculate square
fun squareInt(x: Int):Int {
    return x * x
}

fun sumDoubles(a:Double, b:Double ,c:Double):Double {
    return a + b + c
}



fun main()
{
    val result = squareInt(8)
    val sum = sumDoubles(5.5, 65.72, 21.80)
    duplicate("I love naan bread")

    println(".....")
    println(result)
    println(".....")
    println(sum)
    println(".....")
}

fun duplicate(z:String):String{
    var count = 0
    while (count < 2){
        println(z)
        count++
    }
    return z
}