package com.programmingsquirrel.example

/**
 * Objeto that add two numbers and show the result in the console.
 *
 * (This application or code is to show how is an Scala code).
 *
 * @Autor Cesar Pasillas
 */
object AddTwoNumbers {

  /**
   * Principal method that is executed when the application Starts.
   * @param args CLI Arguments (not are used on this example).
   */
  def main(args: Array[String]): Unit = {

    // Define two numbers to add
    val num1 = 10
    val num2 = 5

    // add the two numbers and stored into a new variable called sum
    val sum = num1 + num2

    // print the result in the console
    println(s"The sum of $num1 and $num2 is $sum")
  }
}
