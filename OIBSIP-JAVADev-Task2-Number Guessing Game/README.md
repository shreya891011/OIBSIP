# 🎯 Advanced Number Guessing Game

A console-based Java application that challenges users to guess a randomly generated number. The game includes multiple difficulty levels, score tracking, input validation, file handling for high scores, and a user-friendly menu-driven interface.

This project was developed as part of my **Java Development Internship** to strengthen my understanding of Java programming, Object-Oriented Programming (OOP), loops, conditional statements, exception handling, and file handling.

---

## 📌 Features

- 🎲 Random number generation
- 🎯 Three difficulty levels
  - Easy (1–50 | 10 Attempts)
  - Medium (1–100 | 7 Attempts)
  - Hard (1–200 | 5 Attempts)
- 📈 Attempt counter
- 💡 "Too High" and "Too Low" hints
- ✅ Input validation for invalid entries
- 🔄 Play Again functionality
- ⏱ Time taken to complete the game
- 📊 Scoreboard with:
  - Games Played
  - Games Won
  - Games Lost
  - Win Percentage
  - Best Score
- 🏆 High Score management using File Handling
- 👀 View High Score
- 🔁 Reset High Score
- 🖥️ Menu-driven console interface

---

## 🛠️ Tech Stack

- Java
- Object-Oriented Programming (OOP)
- File Handling
- Exception Handling
- Scanner Class
- Random Class
- NetBeans IDE 8.0

---

## 📂 Project Structure

```
AdvancedNumberGuessingGame
│
├── src
│   └── guessinggame
│       ├── Main.java
│       ├── Game.java
│       ├── Player.java
│       ├── Difficulty.java
│       ├── ScoreBoard.java
│       └── FileManager.java
│
├── highscore.txt
└── README.md
```

---

## 🚀 How to Run

1. Clone the repository

```bash
git clone https://github.com/yourusername/AdvancedNumberGuessingGame.git
```

2. Open the project in **NetBeans IDE 8.0** (or any Java IDE).

3. Build and Run the project.

4. Enter your name.

5. Choose a difficulty level.

6. Start guessing the number.

---

## 🎮 Game Flow

```
Start
   │
   ▼
Enter Player Name
   │
   ▼
Main Menu
   │
   ├── Start Game
   ├── View Scoreboard
   ├── View High Score
   ├── Reset High Score
   └── Exit
   │
   ▼
Select Difficulty
   │
   ▼
Random Number Generated
   │
   ▼
Guess the Number
   │
   ├── Too High
   ├── Too Low
   └── Correct
   │
   ▼
Update Scoreboard
   │
   ▼
Play Again?
```

---

## 📸 Sample Output

```
========================================
      JAVA NUMBER GUESSING GAME
========================================

Enter Your Name : Shreya

========== MAIN MENU ==========
1. Start New Game
2. View Scoreboard
3. View High Score
4. Reset High Score
5. Exit

Enter Choice : 1
```

```
Choose Difficulty

1. Easy
2. Medium
3. Hard

Enter Choice : 2
```

```
Guess the number between 1 and 100

Attempt 1/7 : 40
Too Low!

Attempt 2/7 : 70
Too High!

Attempt 3/7 : 55

🎉 Congratulations!
You guessed the number in 3 attempts.
```

---

## 📚 Java Concepts Used

- Classes & Objects
- Encapsulation
- Methods
- Loops
- Conditional Statements
- Switch Case
- Exception Handling
- File Handling
- Random Number Generation
- User Input Handling
- Menu Driven Programming

---

## 🎯 Learning Outcomes

Through this project, I gained practical experience in:

- Designing object-oriented applications
- Implementing menu-driven console applications
- Managing user input safely
- Working with files to store application data
- Building reusable and modular Java classes
- Applying core Java programming concepts

---

## 🔮 Future Enhancements

- Java Swing GUI version
- Multiplayer mode
- Timer-based challenge mode
- Difficulty customization
- Sound effects
- Online leaderboard
- Database integration using MySQL
- Player profile management

---

## 👩‍💻 Developed By

**Shreya Lathi**

Computer Science Engineering Student

Passionate about Java Development, Problem Solving, and Software Development.

---

## ⭐ If you found this project helpful, c
