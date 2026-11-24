# TaskDesk – Learning Log

## Week 1: Java Fundamentals and OOP

### Day 1: Setup and First Programs

1. [x] Watch (65 min): Section 1, Introduction. Section 2, all four lectures. Section 3: First Java Program & Main Method; Keywords, Variables & Data Types; Type Conversion & Operators.
2. [x] Read: dev.java Your First Steps in Java, then the variables, primitive types and operators pages in Language Basics.
3. [x] Build: Compile and run a Hello World from the terminal with javac and java , then from IntelliJ. Write TypesPlayground.java : one variable of every primitive type, integer versus decimal division, a cast that loses data, and two strings built at runtime compared with == and with .equals()
4. [ ] Log: Start a "JavaScript versus Java" table in LEARNING.md with ten differences you met today.
5. [x] Drill: The first two exercises on the Exercism Java track.
6. [x] Done when: Both programs run from the terminal and the IDE, and your repo is pushed.

#### *Notes*
- The source code is taken as input to the java compiler.
- The java compiler(javac) loads, verifies and executes the javacode into bytecode. 
- The bytecode is executed by the JVM (runtime env.)
- JRE = JVM + libraries, JDK = JRE + development tools.
- Java execution starts from main method.
- Statements end with semicolon.
- Different datatypes are **int, float, double, char, boolean** (primitives).
- Keywords are inbuilt which cannot be used as variable names. Few are **class, public, static, void, return, while, if, else, boolean, for**.
- Arithmetic operators are **+,-,*,/,%.**
- Comparison operators are **<,.>,<=,>=, ==, !=.**
- Logical operators are **&&** (AND), **||**(OR), **!**(NOT).
- Comparisons return boolean values only.
- Casting can lose data.

#### *What I Learned*
- Learnt to run Java program in IntelliJ. 
- Connected GitHub to my VSCode and commited the changes to my Learning.md
- To write better readable code.
- Learnt java basics, jvm,jre,jdk differences, how javac works,primitive datatypes, operators.
- Understand Js vs Java.

#### *Challenges / Mistakes*

- Faced a main exception in intelliJ then later made my folder as Java source root and the files in the folder are then made java executable files.

------------------------------------------------------------------------

### Day 2: Control flow, Arrays, Methods, Strings

1. [x] Watch (38 min): Section 3: Commenting & User Input; Conditionals & Loops; Arrays, Methods & Strings. Take the Java Fundamentals quiz.
2. [x] Read: The arrays and control-flow pages in dev.java Language Basics.
3. [ ] Build: Port five pure helper functions from one of your Node projects into static methods in a Utils class. Then write a console ticket intake: read a title and a priority with Scanner , validate both, print a summary, and loop until the user types quit .
4. [x] Drill: Course exercises "Grade Calculator" and "Array and String Utilities".
5. [ ] Done when: Each ported method prints the same result as its Node original.

#### *Notes*

- Switch case is more readable than if-else.
- Non-primitive datatypes are String, Array[].
- Strings are **immutable** (cannot modify) and is also an object of java.lang class.
- Few in-built methods in string are **.trim**("remove surrounding spaces"), **.toUpperCase**("convert into uppercase"), **.toLowerCase**("convert into lowercase"), **.length**("count the characters"), **.contains**("checks if text contains another text"), **.equals**("compares text content").
- Arrays are a container that stores a collection of values of same datatype.
- Arrays are fixed size, homogeneous, allocated in heap memory. Few default values are **null, false, true, 0;**
- Return sends a value back.

#### *What I Learned*

- Learnt about conditional statements - if, else, else-if, switch case and looping statements - for, while.
- Implemented conditional statement logic in courseAccess.java.
- Implemented strings and arrays in watchList.java.
- Successfully passed 4/4 testcases on grade calculator.
- Successfully passed 5/5 testcases on arrays and string utilities.
- **if("aeiou".indexOf(c) >= 0)** -> this statement basically checks if the given string has vowels. (c is char variable).
- Implemented 5 pure helper functions with different operations like capitalization of string using .toUpperCase(), finding greatest of three numbers using if-else condition, finding the factorial of a number using for loop, days of the week using switch-case and sum of digits of a number using while loop. These methods take input from the user, process the data from the methods using calls and returns the result (Utils.java).
- Built a ticket intake system with title, priority as fields and validated both to check if its empty and made priority to accept only "high","low","medium" as values by ignoring the case.
- Learnt that .**equalsIgnoreCase()** works in if-else statements and not in while statements.


#### *Challenges / Mistakes*

-Did comparison checking for counting vowels but it returns string and not boolean so changed it into if("aeiou".indexOf(c)>=0).

-----------------------------------------------------------------

### Day 3: Classes, inheritance, packages

1. [x] Watch (67 min): Section 4: Classes, Objects, Constructors, and this Keyword; Inheritance and Method Overriding; super, this vs super, and final Keyword; Java Packages & Access Modifiers.
2. [x] Read: The classes, objects and inheritance pages in dev.java Object-Oriented Programming.
3. [x] Build: Start TaskDesk v0 in package com.taskdesk.model .Write Ticket , User and Comment with private fields, constructors and getters. Add Agent and Customer as subclasses of User . Override toString. In Main , create three users and five tickets and print them.
4. [x] Drill: Course exercises "Build a Student Profile" and Build an Employee Hierarchy".
5. [x] Done when: No field in the model is public, and Main prints readable tickets.

#### *Notes*

- Class is a blueprint that describes what data an object holds and what it can do.
- Object is the instance of the class (created from blueprint).
- Constructors are special method with same name as class - it has no return type, runs when you call 'new' keyword.
- '.this' keyword basically refers to the current object.
- OOPs -> Inheritance lets one class reuse and specialize another class using **"extends"**.
- Rules of overriding in inheritance:
   - Child method name must match parent's method name.
   - Parameters must match for overriding.
   - Same return type.
   - Public parent method cannot become private in child.
   - Static methods are hidden and not overridden.
   - Final methods cannot override.
   - Method Overriding -> Child changes parent method. Method Overloading -> Same class has same method name with different parameters.
   - Dynamic Method Dispatch -> This is a mechanism by which a call to an overridden method is resolved at runtime rather than compile time. 
   - super() keyword is used inside a subclass to directly access fields, variables or members of its immediate parent class. super.method() is used for method calling.
   - final keyword can be on variable, on method and on class. 
   - Access modifier decides who can access what. Types are public, private, no modifier (package private), protected.

#### *What I Learned* 

- BankingApplication.java -> Implementation of access modifier and packages.
- Implemented a student profile to understand classes, constructors, methods and 'this' keyword. 
- Implemented an Employee Hierarchy system using inheritance, constructors, overriding, 'this' and 'super' keywords.
- Implemented com.taskdesk.model with 6 subclasses including main class. Ticket,User,Comment with private fields, constructors and getters, Extended User with Agent and Customer class. Overridden toString() to read the tickets and successfully created three users and printed five tickets.
- 

#### *Challenges / Mistakes*

- 