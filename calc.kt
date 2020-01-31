import kotlin.math.*

fun main(args: Array <String>){

    var num_one: Int = 0
    var num_two: Int = 0
    var task: Char

    println("Enter a number one...")
    try
    {
	num_one = readLine()!!.toInt()
    }
    catch(e : NumberFormatException)
    {
	println(e.toString())
	return
    }
    println("Enter a number two...")
    try
    {
	num_two = readLine()!!.toInt()
    }
    catch(e : NumberFormatException)
    {
	println(e.toString())
	return
    }
    println("Enter a task...")
    try
    {
    task = readLine()!!.single()
    }
    catch(e : IllegalArgumentException)
    {
	println(e.toString());
	return
    }
    when(task){

	'+' -> println(num_one + num_two)
	'-' -> println(num_one - num_two)
	'*' -> println(num_one * num_two)
	'/' -> println(num_one / num_two)
	'^' -> println(Math.pow(num_one.toDouble(), num_two.toDouble()).toInt())
	else -> println("Incorrect task.")

    }

}
