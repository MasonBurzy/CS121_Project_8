# CS121-Project-8

# Algorithm "Guesser.java"


## Menu
3 options
	Exit
	Human Guesser
	Computer Guesser
ask the user to choose option 0-2
print the option they choose

## Main Loop
loop everything only break if "0" is chosen to Exit

## Human Guesser
Create random int 1-100 using Math.random()
print random
boolean - create intTurns starting at "1)"
ask to choose a number 1-100
if guess is higher than random int
	print too high statement
if guess is lower than random int
	print too low statement
if guess is equal to random int
	print success statement


## Computer Guesser
create int upper at 100
create int lower at 1
create a getMean function that find the mean of the lower and upper
print computer guess with getMean solution
boolean - create intTurns starting at "1)"
ask user for too high, too low, or correct
if too low, run getMean and guess again
if too high, run getMean and guess again
if correct, print menu



