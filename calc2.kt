import kotlin.math.*

fun main(args: Array<String>)
{
    if(args.size != 3)
    {
	println("Неверное количество аргументов.")
	return
    }

    try
    {
	args[0].toInt()
    }
    catch(e : Exception)
    {
	println(e.toString())
	return
    }

    try
    {
	args[1].toInt()
    }
    catch(e : Exception)
    {
	println(e.toString())
	return
    }

    try
    {
	args[2].single()
    }
    catch(e : Exception)
    {
	println(e.toString())
	return
    }

    when(args[2])
    {

	"+" -> println((args[0].toInt() + args[1].toInt()).toString())
	"-" -> println(args[0].toInt() - args[1].toInt())
	"x" -> println(args[0].toInt() * args[1].toInt())
	"/" -> println(args[0].toInt() / args[1].toInt())
	"^" -> println(Math.pow(args[0].toDouble(), args[1].toDouble()).toInt())
	else -> println("Incorrect the task.")

    }

}
