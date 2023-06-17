package com.example.kotlinspringboot.basic

class BasicInformation {
// Unlike Java, you do not need to match your file name to your class name.

    /* This is
    comment
     */

    // for single line comment.


    // You do not need ; to break statements.


    // Like JavaScript, you can create functions outside classes.
    // So there is no need to stuff your functions as static members of classes like what you do in C# or Java.
    // Kotlin has string templates, which is awesome. e.g. "$firstName $lastName" for simple variable name or "${person.name} is ${1 * 2}" for any expressions.
    // You can still do the string concatenation if you like e.g. "hello " + "world", but that means being stupid.
    // It has no tuple although Kotlin's data classes is an option to use in place of tuple.

    // Variables
    //  Unlike Java or C#, you declare the type of a variable after the name
    var name : String = "sammas" // Use var when the variable value is to be modified
    val surname : String = "colkesen" //  val where the variable value will not change after first assigned.similar to  final keyword in Java.
    //  More primitive types: Char, String, Boolean.
    //  val variable must be initialized at declaration.
    // All variable declarations in Kotlin must be initialized.
    //  The keyword void common in Java or C# is called Unit in Kotlin.
    //  Number primitive types are as follows: Double, Float, Long, Int, Short, Byte.
    //  There is no automatic conversion between types. You have to explicitly convert them.




    //ControlStructures
    fun isPersonLegalAge(age : Integer) {
        if (age > 18){
            println("$age is greater than 18.")
        }else{
            println("$age is less than 18")
        }
    }
}