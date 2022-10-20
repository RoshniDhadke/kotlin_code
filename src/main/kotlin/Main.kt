/*fun new(a:Int){
   if(a<100){
       println("you have $a notification ")
   }else{
       println("your phone has blunk with $a notification ")
   }
}
fun main(){
    new(51)
    new(120)
}*/
fun new(age:Int,monday:Boolean):Int{
    return when(age){
        in 1..12 -> 15
        in 13..60-> if(monday==true)25 else 30
        in 61..100-> 20
        else->-1
    }


}
fun main(){
    println("12 year movie ticket price is ${new(12,false)} ")
    println("25 year movie ticket price is ${new(25,true)}")
    println("75 year movie ticket price is ${new(75,false)}")
}