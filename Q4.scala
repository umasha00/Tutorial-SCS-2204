object q4 extends App {
    def wage(x:Int) : Int = x*250;

    def ot(x:Int) : Int = x*85;
    
    def income(h1:Int,h2:Int):Int= wage(h1)+ot(h2)
    
    def tax(income:Int):Double=income*.12
    
    def salary(h1:Int,h2:Int):Double=income(h1,h2)-tax(income(h1,h2))

    println(salary(40, 20));
}