// Variables exercise

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



// Start your work here

// Add the numbers and print the result.
import System.out._ //for println function
println(num1 +" + "+num2+ " = "+(num1+num2))

// Multiply the numbers and print the result.
println(num1 +" * "+num2+" = "+(num1*num2))

// Compare the two numbers and set the "smaller" and "larger"
// variables appropriately.
val (smaller,larger)=if(num1<=num2) (num1,num2) else (num2,num1)

// Print out which number is smaller and which is larger.
println("Smaller : "+smaller)
println("Larger :"+larger)

// Calculate the value of adding the two numbers and multiplying the
// result by the smaller number.

println("("+ num1+" + "+num2+") * "+smaller+" = "+(num1+num2)*smaller)