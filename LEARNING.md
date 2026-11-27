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
3. [x] Build: Port five pure helper functions from one of your Node projects into static methods in a Utils class. Then write a console ticket intake: read a title and a priority with Scanner , validate both, print a summary, and loop until the user types quit .
4. [x] Drill: Course exercises "Grade Calculator" and "Array and String Utilities".
5. [x] Done when: Each ported method prints the same result as its Node original.

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

---------------------------------------------------------------------------------------------------------

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


#### *Challenges / Mistakes*

- Had some difficulties in commiting files to GitHub because of unresolved files, then used AI assistance to figure out the exact problem I need to solve. 

--------------------------------------------------------------------------------------------------------

### Day 4: Encapsulation, static, abstraction, lambdas

1. [x] Watch (49 min): Section 4: Encapsulation & Data Hiding; The static Keyword; Abstraction: abstract classes & interfaces; Functional Interfaces & Lambda Expressions.
2. [x] Read: The interfaces pages in dev.java Object-Oriented Programming, then the first lambda tutorial in Generics, Lambda, and Pattern Matching.
3. [x] Build: Enforce status moves inside Ticket , so an illegal move is refused. Add a static id counter. Write a Notifier interface with ConsoleNotifier and EmailNotifier . Define your own TicketFilter functional interface and call a filter method with lambdas for urgent tickets and for one agent's tickets.
4. [x] Drill: Any three of "Bank Account with Encapsulation", "Shapes with Abstraction and Polymorphism","Track Library Members with Static Members", "Build a Notification System" and "Apply Discounts with Lambda Expressions".
5. [x] Done when: Code outside Ticket cannot put a ticket into an illegal status.

#### *Notes*

- Encapsulation is basically data hiding. The methods in the particular class controls how outside code can interact with it.  Eg. Salary is private so encapsulation helps in hiding the data. 
- Getters and Setters are the methods or behavior used in the encapsulation mechanism. 
- Setters should validate and not blindly assign.
- static fields store data shared across all objects of that class and its methods run without needing an object.
- static final Constants are one value for the whole class and cannot be reassigned. 
- static keyword can be called with ClassName.VariableName and it does not need an object to be called. 
- Abstraction lets developers hide unnecessary internal details and expose what is necessary. It also lets different classes share a common way to interact.
- Abstraction can be implemented using Abstract classes and Interfaces. 
- Interface defines what it can do without telling what it will be doing. 
- Abstract class is an incomplete parent class and it can hold shared fields and methods but cannot be instantiated directly.
- Functional Interface is an interface with exactly one abstract method.
- Lambda expression implements the functional interface. 
- L.E implement the single abstract method.

#### *What I Learned* 

- Drilled "Bank Account with Encapsulation", "Shapes with Abstraction and Polymorphism","Track Library Members with Static Members", "Build a Notification System" and "Apply Discounts with Lambda Expressions" (course exercises). Helped me understand the concepts of encapsulation. inheritance, abstraction, abstract class, polymorphism, overriding, overloading, interfaces, static usage and lambda expressions for functional interfaces. 
- I enforced status moves using boolean if-else condition which sets the newStatus to curStatus if the move is legal and updates the time and returns true/false.
- Implemented a dynamic id counter using static in Ticket.java which generates Id automatically with incrementation ( static id).
- Implemented notification interface with Email and Console notification. 
- Built and defined a TicketFilter interface with lambda expression that retrieves URGENT and Agent tickets.

#### *Challenges / Mistakes*

- Faced some exception error because of gap but fixed it with .trim().

---------------------------------------------------------------------------------------------------------

### Day 5: Polymorphism, the Object class, finish v0

1. [x] Watch (20 min): Section 4: Java Memory & Object Class; Polymorphism in Java. Take the Object Oriented Programming quiz.
2. [x] Read: Finish dev.java Object-Oriented Programming. Then find the records tutorial under Getting to Know the Language. The course does not cover records, and you use them for every API payload from Week 3.
3. [x] Build: Implement equals and hashCode on Ticket . Add a console menu: create a ticket, list tickets,assign, change status, add a comment, quit. Keep all data in memory. Write a README that says how to run it. Tag v0 .
4. [ ] Drill: None. The checkpoint proof task takes this slot

#### *Notes*

- Every java class inherits from java.lang.Object -> common methods are toString(),equals(), hashCode() and can be used using @Override.
- toString() helps in reading the data. equals() helps to check if two objects are equal and return boolean value. It will also check null value or if this class belongs to any other class it will return false. hashCode() returns the hashcode of an object. 