fun main(args: Array<String>) {
    //creat a list of int 5 numbers
    var numbers= mutableListOf(3,5, 7,9,11)
    println(numbers)

    //updet the 3th elment to 12
    numbers[2]=12
    println(numbers)
//check if the 12 is existing
    val number= if (numbers.containsAll(listOf(12))) {
        "Good."
    } else {
        "Ok."
    }
    println(number)
    //delete the elment
    numbers.removeAt(2)
    println(numbers)

    //print the list
    println("St.${numbers}")
}