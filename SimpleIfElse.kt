// Simple If Else Demo
fun main (args:Array<String>){
    println("Enter Marks")
    var marks = readLine()!!.toDouble()
    if (marks>80){
        println("Your grade is A")
    }
        else {
        println("Your grade is not A")
    }

    println(marks)
}