// Here are some lists of countries in North America and South
// America. (Don't change the next two lines.)
val NorthAmerica = List("USA", "Mexico", "Canada")
val SouthAmerica = 
  List("Venezuela", "Bolivia", "Argentina", "French Guiana", "Paraguay", "Chile", 
       "Ecuador", "Brazil", "Guyana", "Peru", "Uruguay", "Colombia", "Suriname")



// Start your work here
var countries=args.sorted
// Get the arguments from the command line, convert them to a sorted
// List that is stored in the variable "countries" and print them.
println("Part (a)")
println("Considering : "+countries.mkString(" "))



// For each test country, see whether it is in North America, South
// America, or if we don't have any information about it (i.e. it is
// an "unknown" country).
println("\nPart (b)")
for(country <-countries.reverse){
	val continent=
		if (NorthAmerica.contains(country))"North America"
		else if (SouthAmerica.contains(country)) "South America"
		else "??"
		
	println(country +" : "+ continent)
}


// Print out how many unknown countries were given. Make sure that
// you deal with English agreement appropriately.
println("\nPart (c)")

val noOfUnknown=countries.filter(c => 	(	!NorthAmerica.contains(c) &&
											!SouthAmerica.contains(c)
										)
								).length
println	("There "+
		(if(noOfUnknown==1) "is" else "were ")+
		noOfUnknown+" unknown "+
		(if(noOfUnknown==1) "country" else "countries")
		)
	


