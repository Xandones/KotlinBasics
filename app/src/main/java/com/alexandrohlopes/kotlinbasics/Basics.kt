package com.alexandrohlopes.kotlinbasics

fun main() {
    val myName = "Alexandro" // Immutable string variable - value
    var myAge = 40 // Mutable integer variable
    // myName = "João" -> This line will cause an error because we cannot change the value of a val only of a var
    println("Yo people! My name is $myName and I'm $myAge years old.")

    println("Integer data types")
    val maxByte : Byte = 127 // Size: 8 bits
    val maxShort : Short = 32767 // Size: 16 bits
    val maxInt : Int = 2147483647 // Size: 32 bits - this is the default set for integer numbers, that's why it's not necessary to specify the type.
    val maxLong : Long = 9223372036854775807 // Size: 64 bits
    println("Maximum byte value: $maxByte")
    println("Maximum short value: $maxShort")
    println("Maximum integer (32 bits) value: $maxInt")
    println("Maximum long value: $maxLong")

    println()

    println("Floating point data types")
    val maxFloat : Float = 3.40282346638528860e+38f // Size: 32 bits - It also requires a "f" at the end of the number.
    val maxDouble : Double = 1.79769313486231570e+308 /* Size: 64 bits - this is the default set for floating point numbers, that's why it's
    necessary to specify the type. */
    println("Maximum float value: $maxFloat")
    println("Maximum double value: $maxDouble")

    println()

    println("Boolean - Represents a value which is either true or false.")
    var isRaining = true
    isRaining = false
    println("It is $isRaining that it's raining.")

    println()

    println("Chars stores single characters in a var or val (includes numbers)")
    val first = 'A'
    println("My name starts with $first")

    println()

    println("Strings allows us to work with chains of characters")
    val myStr = "Donald Duck is way cooler than Mickey Mouse."
    var firstChar = myStr[0]
    var lastChar = myStr[myStr.length - 1]
    println("String: $myStr")
    println("The string starts with $firstChar and ends with $lastChar")

    println()

    println("Arithmetic operators: +, -, *, /, %")
    val x = 2.0
    val y = 5.0
    println("$x + $y = ${x + y}")
    println("$x - $y = ${x - y}")
    println("$x * $y = ${x * y}")
    println("$x / $y = ${x / y}") // Since the result is 0.4 and the type is integer, it will show 0 if the type of the variable is integer.
    println("$x % $y = ${x % y}") // Remaining value of the division.

    println()

    println("Comparison operators: ==, !=, >, <, >=, <=")
    val isEqual = 5==3 // If you declare a variable as a comparison it will be a boolean type variable.
    println("Is 5 equal 3? $isEqual")
    val isNotEqual = 5!=5
    println("Is 5 different from 5? $isNotEqual")
    println("Is 5 greater than 3? ${5 > 3}")
    println("Is -5 greater than 3? ${-5 > 3}")
    println("Is -5 greater or equal 3? ${-5 >= 3}")
    println("Is 5 lower than 3? ${5 < 3}")
    println("Is 5 lower or equal 3? ${5 <= 3}")

    println()

    println("Assignment operators: +=, -=, *=, /=, %=")
    var number = 5
    println("The number is $number")
    number += 3
    println("The number plus 3 is equal $number")
    number -= 4
    println("The previous number minus 4 is equal $number")
    number *= 9
    println("The previous number multiplied by 9 is equal $number")
    number /= 3
    println("The previous number divided by 3 is equal $number")
    number %= 2
    println("The modulus of the division of the previous number by 2 is $number") // 12 divided by 2 has no remaining

    println()

    println("Increment and decrement operators (++ and --)")
    println("After an increment, the number still has a value of ${number++}") // Kotlin will do all the code in the line than do the increment
    println("After an increment, the number has a value of ${++number}") // Kotlin will increment the value as soon as asked
    println("After a decrement, the number still has a value of ${number--}") // Kotlin will do all the code in the line than do the decrement
    println("After an decrement, the number has a value of ${--number}") // Kotlin will decrement the value as soon as asked

    println()

    println("If statements")
    val a = 9
    val b = 99
    if (a >= b) {
        println("$a is greater or equal $b")
    }
    else {
        println("$a is lower or equal $b")
    }
    var isRainy = false
    if (isRainy) { // To use boolean variables statements you just need to mention its name.
        println("It is raining outside.")
    }
    else {
        println("It isn't raining outside.")
    }

    println()

    println("When statements")
    val season = 4
    println(season)
    // Single values comparison
    when (season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> { // When also supports multiple lines of code
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid season")
    }
    // Comparison between intervals
    val month = 1
    when (month) {
        12,1,2 -> println("Summer") // Beware: the only way of creating a backwards interval is this one.
        in 3..5 -> {
            println("Fall")
            println("Autumn")
        }
        in 6..8 -> println("Winter")
        in 9..11 -> println("Spring")
        else -> println("Invalid season")
    }
    // Checking data types using When
    var z : Any = true
    when(z) {
        is Int -> println("$z is an Integer")
        is Double -> println("$z is a Double")
        is String -> println("$z is a String")
        else -> println("$z is none of the above")
    }

    println()

    println("While statements - beware: if the condition is always true the loop will become infinite")
    var k = 0
    while (k <= 10) {
        if (k % 2 == 0) {
            print("$k ")
        }
        k++
    }
    print("\n")
    // Using a string as a parameter to a While loop
    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold") {
        if (roomTemp >= 20) {
            feltTemp = "comfortable"
            println("It's comfy now")
        }
        println("Room temperature: $roomTemp ºC | Felt temperature: $feltTemp")
        roomTemp++
    }

    println()

    println("Do while statements - the lines of code inside a Do While loop will run at least once, even if the condition is false ")
    k = 15
    do {
        print("$k ")
        k++
    } while (k <= 10)
    print("\n")

    println()

    println("For loops")
    for (num in 1..10) {
        print("$num ")
    }
    print("\n")
    for (num in 1 until 10) { // Stops 1 step before the condition is achieved
        print("$num ")
    }
    print("\n")
    for (x in 10 downTo 1 step 2) { // Countdowns from 10 to 0 two numbers at a time
        print("$x ")
    }
    println()

    println()

    println("Break and Continue")
    for (i in 1 until 20) {
        if (i / 2 == 5)
            continue // Ignores every step when the specified step occurs and goes to the next one.
        /*
            10 / 2 == 5
            11 / 2 == 5.5 -> This one is rounded to 5
         */
        if (i / 2 == 15)
           break // After the For loop reaches 10 it will stop the loop.
        print("$i ")
    }
    println("End of the For loop")

    println()

    println("Functions")
    myFunction()
    myFunction()
    println("${ addUp(5, 3) }")
}

fun myFunction() {
    println("This came from an additional function.")
}

fun addUp(a : Int, b : Int) : Int {
    return a + b
}