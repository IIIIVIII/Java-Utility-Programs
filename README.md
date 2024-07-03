# Java-Utility-Programs
Java Utility Programs
Project Description
This project consists of multiple small utility programs written in Java. Each program performs a specific function, such as simulating an autonomous racecar, calculating the Collatz sequence, or reversing a string.

File Structure
Main.java: The main entry point of the project, demonstrating the usage of different utility programs.
AutonomousRacecar.java: Simulates an autonomous racecar starting a race.
CollatzConjecture.java: Calculates and prints the Collatz sequence for a given number.
ReverseString.java: Reverses a given string and returns the reversed result.
Prerequisites
Java Version: JDK 8 or higher
How to Run
Place all .java files (Main.java, AutonomousRacecar.java, CollatzConjecture.java, ReverseString.java) in the same directory.
Compile the Java files using the following command:
sh
Copy code
javac Main.java AutonomousRacecar.java CollatzConjecture.java ReverseString.java
Run the program using the following command:
sh
Copy code
java Main
Code Overview
Main.java
This file is the entry point of the program. It demonstrates the usage of different utility classes:

Initializes an AutonomousRacecar object and starts the race.
Initializes a CollatzConjecture object and calculates the Collatz sequence for a given number.
Initializes a ReverseString object and reverses a given string, printing the result.
AutonomousRacecar.java
This file simulates an autonomous racecar. Its main function is:

startRace(): Prints a message indicating the start of the race and simulates race logic.
CollatzConjecture.java
This file calculates the Collatz sequence for a given number. Its main function is:

calculateSequence(int number): Calculates and prints the Collatz sequence for the provided number.
ReverseString.java
This file reverses a given string. Its main function is:

reverse(String input): Returns the reversed version of the provided string.
