fun main(args: Array<String>)
{

    var num : Int = 0
    var num2 : Int = 0

    println("Введите число...")
    try
    {
	num = readLine()!!.toInt()
    }
    catch(E : NumberFormatException)
    {
	println(E.toString())
    }

    when(num)
    {

	1 -> println("Один")
	2 -> println("Два")
	3 -> println("Три")
	else -> println("Я хз") 

    }

    println("Ввидите второе число...")
    try
    {
	num2 = readLine()!!.toInt()
    }
    catch(E : NumberFormatException)
    {
	println(E.toString())
    }
    println(num + num2)

}