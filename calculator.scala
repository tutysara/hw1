// Calculator exercise

// Get the arguments from the command line and check there are three of
// them and that they are of the right type. (Don't change the next block
// of code.)
val IntegerPattern = """\d+""".r
val Operators = """(plus|minus|times|div)""".r
args match {
  case Array(first, op, second) => 
    if (!IntegerPattern.pattern.matcher(first).matches 
        || !IntegerPattern.pattern.matcher(second).matches) {
      println("Please provide integers as arguments to the operator.")
      System.exit(0)
    }
    if (!Operators.pattern.matcher(op).matches) {
      println("Please provide a valid operator.")
      System.exit(0)
    }

  case _ => 
    println("Incorrect number of arguments to calculator.scala. Please provide three arguments.")
    System.exit(0)
}


// Start your work here. The code above has ensured that the inputs
// are correct, so you don't need to worry about that.

// Initialize variables num1, op and num2 based on the values in the args array.
val Array(num1s,op,num2s)=args
val num1=num1s.toInt
val num2=num2s.toInt


// Obtain a result by using the string name of the operator to choose
// which arithmetic operation to use.
val res=op match {
	case "plus" => num1+num2
	case "minus" => num1-num2
	case "times" =>num1*num2
	case "div"=>(num1/num2.toDouble)
}
import System.out._
println(num1 +" "+op+" "+num2+" = "+res)


// Print the result.


