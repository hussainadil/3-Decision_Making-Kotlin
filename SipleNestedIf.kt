// Simple Nested If Demo
fun main (args:Array<String>){
    println("Enter Marks")
    var marks = readLine()!!.toDouble()
    if (marks>=80){

        if (marks<85){
            println("Your grade is A")
        } else {
            println("Your grade is A+")
        }
    }
    println(marks)
}