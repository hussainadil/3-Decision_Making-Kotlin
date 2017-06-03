// Simple If Demo
fun main (args:Array<String>){
    println("Enter Marks")
    var marks = readLine()!!.toDouble()
    if (marks>80){
        println("Your grade is A")
    }
    println(marks)
}