
**Rock, Paper, Scissors Game 🎮**

A simple command-line Rock, Paper, Scissors game developed in Java. The user selects Rock, Paper, or Scissors, while the computer randomly generates its choice. The program then compares both choices and determines the winner.

**📌 Project Overview**

This project is a beginner-friendly Java console application created to practice fundamental programming concepts such as:

User input
Random number generation
Conditional statements
Logical operators
Input validation
Basic game logic
🎯 How the Game Works

The player is asked to choose one of three options:

0 - Rock
1 - Paper
2 - Scissors


The computer then randomly selects one of the same three options.

The program compares the two choices and displays one of the following results:

User Wins
Computer Wins
It's a Tie
🕹️ Game Rules

The standard Rock, Paper, Scissors rules are used:

User Choice	Beats
🪨 Rock	✂️ Scissors
📄 Paper	🪨 Rock
✂️ Scissors	📄 Paper

If both the user and computer choose the same option, the result is a tie.

**🔢 User Choices**
Input	Choice
0	Rock
1	Paper
2	Scissors

Any number outside the range 0–2 is considered invalid.

**💻 Technologies Used**
Java
java.util.Scanner
java.util.Random
🧠 Program Logic

**1. Get User Input**

The program uses the Scanner class to read the user's choice:

Scanner Scanner = new Scanner(System.in);
int UserChoice = Scanner.nextInt();

**2. Validate User Input**

The program checks whether the user's choice is between 0 and 2:

if (UserChoice < 0 || UserChoice > 2) {
    System.out.println("Invalid choice - Please run the program again and enter 0, 1 or 2");
    return;
}


If the input is invalid, the program displays an error message and exits.

**3. Generate the Computer's Choice**

The computer uses Java's Random class:

int ComputerChoice = new Random().nextInt(3);


nextInt(3) generates a random number from 0 to 2.

**4. Determine the Winner**

The program first checks whether both choices are the same:

if (UserChoice == ComputerChoice) {
    System.out.println("its a tie, play again");
}


It then checks the conditions under which the user wins:

else if (
    (UserChoice == 0 && ComputerChoice == 2) ||
    (UserChoice == 1 && ComputerChoice == 0) ||
    (UserChoice == 2 && ComputerChoice == 1)
) {
    System.out.println("User Wins ! Congratulations!!!");
}


If neither a tie nor a user win occurs, the computer wins:

else {
    System.out.println("Computer Wins!");
}

**▶️ Example Output**
User Wins
Welcome to !!! Rock, Paper, Scissors Game !!!
Enter the User Choice
0-Rock, 1-Paper, 2-Scissors
0
0
2
User Wins ! Congratulations!!!


In this example:

User     → Rock
Computer → Scissors
Result   → User Wins

Computer Wins
Welcome to !!! Rock, Paper, Scissors Game !!!
Enter the User Choice
0-Rock, 1-Paper, 2-Scissors
1
1
2
Computer Wins!

Tie
Welcome to !!! Rock, Paper, Scissors Game !!!
Enter the User Choice
0-Rock, 1-Paper, 2-Scissors
2
2
2
its a tie, play again

******❌ Invalid Input Example**
Welcome to !!! Rock, Paper, Scissors Game !!!
Enter the User Choice
0-Rock, 1-Paper, 2-Scissors
5
5
Invalid choice - Please run the program again and enter 0, 1 or 2

**📁 Project Structure**
project/
└── src/
    └── day4/
        └── Rock_Paper_Scissors_Game.java

🚀 How to Run
Using an IDE

Open the project in a Java IDE such as:

IntelliJ IDEA
Eclipse
Visual Studio Code

Locate:

Rock_Paper_Scissors_Game.java


and run the main() method.

Using the Terminal

Compile the Java file:

javac Rock_Paper_Scissors_Game.java


Then run the program:

java day4.Rock_Paper_Scissors_Game

📚 Java Concepts Practiced

This project demonstrates:

Classes and methods
The main() method
Scanner for user input
Random for random number generation
int variables
if, else if, and else
Comparison operators
Logical AND (&&)
Logical OR (||)
Input validation
return statements
Closing resources with Scanner.close()
🔮 Future Improvements

**Possible improvements for future versions include:**

Allowing the user to play multiple rounds.
Adding a score counter.
Displaying the computer's choice as Rock, Paper, or Scissors instead of a number.
Adding a "Play Again" option.
Handling invalid non-numeric input.
Using a switch statement for the user's choice.
Creating separate methods for input, game logic, and displaying results.
Following Java naming conventions more closely.
🎓 Purpose

