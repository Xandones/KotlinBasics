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
}