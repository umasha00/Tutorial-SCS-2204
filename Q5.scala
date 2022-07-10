def profit( ticketPrice: Int, attendance: Int) : Int = { return (attendance*ticketPrice) - ( 500 + 3*attendance); };

var decPrice = 5;
var decAttendance = 20;
println("Enter the normal ticket price:");
val ticketPrice : Int = scala.io.StdIn.readInt();
println("Enter the attendance:");
val attendence : Int = scala.io.StdIn.readInt();

var a = profit(ticketPrice, attendence); 
var b = profit(ticketPrice+decPrice,attendence -decAttendance);
var c = profit(ticketPrice-decPrice, attendence +decAttendance);

var bestProfit = if ( a>b && a>c) a else if ( b>a && b>c ) b else c;

if( bestProfit ==a )
    println("The best ticket price is Rs:"+ ticketPrice + "\n\n");
else if ( bestProfit ==b)
    println("The best ticket price is Rs:"+ (ticketPrice + decPrice)+ "\n\n");
else
    println("The best ticket price is Rs:"+ (ticketPrice - decPrice) + "\n\n" );