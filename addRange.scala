// Get the arguments from the command line and check there are two of
// them and that they are all integers. (Don't change the next block
// of code.)
val IntegerPattern = """\d+""".r
if (args.length != 2 || args.exists(arg => !IntegerPattern.pattern.matcher(arg).matches)) {
  println("Incorrect arguments to variables.scala. Please provide two integers.")
  System.exit(0)
}

// Obtain the numbers, converting them from Strings to Ints while
// doing so. You'll learn what is going on here later!
val Array(num1, num2) = args map (_.toInt)


// Check that the first number is smaller than the second. If it
// isn't, print a warning message and exit.
import System.out._
if(num1>num2){
	println("Please make sure that first number is smaller that the second.")
	System.exit(0)
}

// Create a range using "to" and the numbers provided as arguments. 


// Print the numbers in the range with "+" in between each one (hint:
// use mkString) and the result of adding them all together (hint: use
// sum)
val range= num1 to num2
val sum=range.sum
println(range.mkString(" + ")+" = "+sum)

