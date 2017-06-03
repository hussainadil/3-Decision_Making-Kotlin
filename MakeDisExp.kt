// maiking decission expression
fun main (args:Array<String>){

    var x=10
    var y=20
    var max=if (x>y)x else y
    println(max)

    //when
    var age = 30
    var isYoung= when (age){
        30   ->  true
        else ->  false
    }
    println(isYoung)

}