// Simple If Else If Demo
fun main (args:Array<String>){
    println("Enter Marks")
    var marks = readLine()!!.toDouble()
    if (marks>=90){
        marks=marks+3
        println("Your grade is A and awaded 3 plus marks")
    } else if (marks>=70 && marks <80){

        println("Your grade is B ")
    } else if (marks>=60 && marks <70){

        println("Your grade is C")
    } else if (marks>=50 && marks <60){

        println("Your grade is Pass")
    } else {
        println(" You are fail")
    }
}