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
}