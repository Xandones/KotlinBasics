package com.alexandrohlopes.kotlinbasics

fun main() {
    val myName = "Alexandro" // Immutable string variable - value
    var myAge = 40 // Mutable integer variable
    // myName = "João" -> This line will cause an error because we cannot change the value of a val only of a var
    println("Yo people! My name is $myName and I'm $myAge years old.")

    // Integer types
    val maxByte : Byte = 127 // Size: 8 bits
    val maxShort : Short = 32767 // Size: 16 bits
    val maxInt : Int = 2147483647 // Size: 32 bits - this is the default set for integer numbers, that's why it's necessary to specify the type.
    val maxLong : Long = 9223372036854775807 // Size: 64 bits
    println("Maximum byte value: $maxByte")
    println("Maximum short value: $maxShort")
    println("Maximum integer (32 bits) value: $maxInt")
    println("Maximum long value: $maxLong")

}