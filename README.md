# OOP Mastery Assessment

## Learning Outcomes Assessed

This assessment evaluates your understanding of:

* Encapsulation
* Inheritance
* Polymorphism
* Abstraction
* Interfaces
* Composition
* Aggregation
* Association
* Object Collaboration
* State Management
* Immutability
* Design Principles
* SOLID Principles
* Basic Design Patterns
* Clean Object-Oriented Design

---

# Coding Questions 1–10

## Question 1 — BankAccount

A banking application needs a way to manage customer balances while preventing invalid transactions.

Create a class named:

```java
BankAccount
```

Fields

```java
private String owner;
private double balance;
```

Create the following methods:

```java
deposit(double amount)
withdraw(double amount)
getBalance()
```

Rules

* Negative deposits must be ignored.
* Withdrawals may only occur when sufficient funds exist.
* Balance may never become negative.

Example

Input

```java
BankAccount account =
        new BankAccount(
                "John",
                100
        );

account.deposit(50);
account.withdraw(30);

account.getBalance();
```

Output

```text
120
```

Constraints

* Encapsulation must be used.
* Fields must be private.
* Access to balance must occur through methods.

Hint

Think carefully about protecting the object's internal state.

---

## Question 2 — Car and Engine

A vehicle simulation system needs to model how a car controls its engine.

Create a class named:

```java
Engine
```

Fields

```java
private boolean running;
```

Methods

```java
start()
stop()
isRunning()
```

Create a second class named:

```java
Car
```

Fields

```java
private Engine engine;
```

Methods

```java
startCar()
stopCar()
isCarRunning()
```

Rules

* A car contains exactly one engine.
* Starting the car starts the engine.
* Stopping the car stops the engine.

Example

```java
Car car = new Car();

car.startCar();

car.isCarRunning();
```

Output

```text
true
```

Constraints

* Use composition.
* The engine object must be created inside the car.

Hint

Can a car function without an engine?

---

## Question 3 — Animal Hierarchy

A pet management application stores different types of animals.

Create an abstract class named:

```java
Animal
```

Field

```java
protected String name;
```

Method

```java
makeSound()
```

Create two subclasses:

```java
Dog
Cat
```

Rules

Dog must return:

```text
Woof
```

Cat must return:

```text
Meow
```

Example

```java
Animal dog =
        new Dog("Buddy");

dog.makeSound();
```

Output

```text
Woof
```

Constraints

* Animal must be abstract.
* makeSound() must be overridden.
* Polymorphism should be possible.

Hint

A Dog IS AN Animal.

A Cat IS AN Animal.

---

## Question 4 — Student and Course

A university system needs to track student enrolments.

Create:

```java
Student
Course
```

Student fields:

```java
private String name;
```

Course fields:

```java
private String courseName;
private List<Student> students;
```

Methods

```java
enroll(Student student)
studentCount()
```

Example

```java
course.enroll(john);
course.enroll(mary);

course.studentCount();
```

Output

```text
2
```

Constraints

* A course aggregates students.
* Students may exist without a course.

Hint

This is not composition.

This is aggregation.

---

## Question 5 — Rectangle

A design application needs to calculate areas of shapes.

Create:

```java
Rectangle
```

Fields

```java
private double width;
private double height;
```

Methods

```java
area()
perimeter()
```

Example

```java
Rectangle r =
        new Rectangle(4,5);
```

Output

```text
area = 20
perimeter = 18
```

Constraints

* Fields must be encapsulated.
* Calculations must be performed by the object itself.

---

## Question 6 — User Authentication

A security system needs to validate user passwords.

Create:

```java
User
```

Fields

```java
private String username;
private String password;
```

Methods

```java
changePassword(String oldPassword,
               String newPassword)

login(String password)
```

Rules

* Password changes only succeed when the old password is correct.
* Login succeeds only when passwords match.

Example

```java
user.login("secret");
```

Output

```text
true
```

Constraints

* Direct password access must not be possible.

Hint

This question focuses heavily on encapsulation.

---

## Question 7 — Payment Methods

An online store supports multiple payment methods.

Create:

```java
PaymentMethod
```

as an interface.

Method

```java
pay(double amount)
```

Create implementations:

```java
CreditCardPayment
CashPayment
```

Outputs

```text
Paid with credit card
```

and

```text
Paid with cash
```

Constraints

* Use interfaces.
* Demonstrate polymorphism.

Hint

The store should not care which payment method is used.

---

## Question 8 — Library Book

Create:

```java
Book
```

Fields

```java
private String title;
private boolean borrowed;
```

Methods

```java
borrow()
returnBook()
isBorrowed()
```

Rules

* Borrowed books cannot be borrowed again until returned.

Example

```java
book.borrow();
book.borrow();
```

The second borrow should have no effect.

Constraints

* Object state must be managed correctly.

---

## Question 9 — Employee Hierarchy

Create:

```java
Employee
```

Field

```java
protected String name;
```

Method

```java
calculateBonus()
```

Create:

```java
Manager
Developer
```

Rules

```text
Manager -> 5000
Developer -> 2000
```

Constraints

* Use inheritance.
* Use method overriding.

---

## Question 10 — Shopping Cart

Create:

```java
Product
ShoppingCart
```

Product

```java
name
price
```

ShoppingCart

```java
addProduct()
totalPrice()
```

Example

```text
Laptop = 1000
Mouse = 100

Total = 1100
```

Constraints

* A cart aggregates products.
* Products may exist without a cart.
## Question 11 — Notification Service

A messaging platform supports multiple notification channels.

Create an interface:

```java
NotificationService
```

Method

```java
send(String message)
```

Implement:

```java
EmailNotification
SmsNotification
PushNotification
```

Outputs

```text
Email sent
SMS sent
Push notification sent
```

Constraints

* Use interfaces.
* Demonstrate polymorphism.

---

## Question 12 — Temperature Sensor

Create:

```java
TemperatureSensor
```

Field

```java
private double temperature;
```

Methods

```java
setTemperature(double value)
getTemperature()
isFreezing()
```

Rules

```text
temperature <= 0
```

means freezing.

Example

```java
sensor.setTemperature(-5);
sensor.isFreezing();
```

Output

```text
true
```

Constraints

* Use encapsulation.

---

## Question 13 — Team and Player

Create:

```java
Player
Team
```

Player fields

```java
private String name;
```

Team fields

```java
private List<Player> players;
```

Methods

```java
addPlayer(Player player)
playerCount()
```

Constraints

* Use aggregation.
* Players may exist without teams.

---

## Question 14 — Vehicle Hierarchy

Create an abstract class:

```java
Vehicle
```

Method

```java
move()
```

Create:

```java
Car
Bike
Boat
```

Outputs

```text
Driving
Cycling
Sailing
```

Constraints

* Use inheritance.
* Use polymorphism.

---

## Question 15 — Password Validator

Create:

```java
PasswordValidator
```

Method

```java
isValid(String password)
```

Rules

Password is valid if:

```text
length >= 8
contains a digit
```

Example

```java
isValid("Secret123")
```

Output

```text
true
```

---

## Question 16 — House and Rooms

Create:

```java
Room
House
```

House fields

```java
private List<Room> rooms;
```

Methods

```java
addRoom(Room room)
roomCount()
```

Constraints

* Use composition.
* Rooms belong entirely to one house.

Hint

If the house disappears, so do its rooms.

---

## Question 17 — Shape Calculator

Create:

```java
Shape
```

as an interface.

Method

```java
area()
```

Implement:

```java
Circle
Square
```

Example

```java
Shape shape = new Square(4);
```

Output

```text
16
```

Constraints

* Demonstrate polymorphism.

---

## Question 18 — Light Switch

Create:

```java
LightSwitch
```

Field

```java
private boolean on;
```

Methods

```java
turnOn()
turnOff()
isOn()
```

Example

```java
switch.turnOn();
```

Output

```text
true
```

Constraints

* Manage object state correctly.

---

## Question 19 — Customer and Orders

Create:

```java
Customer
Order
```

Customer fields

```java
private List<Order> orders;
```

Methods

```java
addOrder(Order order)
orderCount()
```

Constraints

* Use aggregation.
* Orders may exist independently.

---

## Question 20 — Employee Payroll

Create an abstract class:

```java
Employee
```

Method

```java
calculatePay()
```

Create:

```java
HourlyEmployee
SalariedEmployee
```

Rules

Hourly:

```text
hoursWorked * hourlyRate
```

Salary:

```text
monthlySalary
```

Constraints

* Use abstraction.
* Use polymorphism.
## Question 21 — Logger Dependency

Create:

```java
Logger
```

Method

```java
log(String message)
```

Create:

```java
UserService
```

Field

```java
private Logger logger;
```

Method

```java
registerUser(String username)
```

Rules

* UserService must use Logger.
* Logger is passed into the constructor.

Constraints

* Demonstrate dependency injection.

---

## Question 22 — Bank Card

Create:

```java
BankCard
```

Fields

```java
private final String cardNumber;
private final String ownerName;
```

Methods

```java
getCardNumber()
getOwnerName()
```

Constraints

* Object must be immutable.
* No setters allowed.

---

## Question 23 — Appliance Hierarchy

Create:

```java
Appliance
```

Method

```java
turnOn()
```

Create:

```java
Fan
Heater
```

Outputs

```text
Fan running
Heater warming
```

Constraints

* Use inheritance.
* Use method overriding.

---

## Question 24 — School Classroom

Create:

```java
Teacher
Classroom
```

Fields

```java
private Teacher teacher;
```

Methods

```java
assignTeacher()
getTeacher()
```

Constraints

* Demonstrate association.

---

## Question 25 — Discount Strategy

Create interface:

```java
DiscountStrategy
```

Method

```java
calculateDiscount(double amount)
```

Implement:

```java
StudentDiscount
SeniorDiscount
```

Rules

```text
Student -> 10%
Senior -> 15%
```

Constraints

* Apply the Strategy Pattern.

---

## Question 26 — Clock

Create:

```java
Clock
```

Fields

```java
hours
minutes
```

Methods

```java
tick()
getTime()
```

Rules

* After 23:59 comes 00:00.

Example

```text
23:59
```

becomes

```text
00:00
```

---

## Question 27 — University Department

Create:

```java
Professor
Department
```

Department fields

```java
private List<Professor> professors;
```

Methods

```java
addProfessor()
professorCount()
```

Constraints

* Use aggregation.

---

## Question 28 — Report Generator

Create interface:

```java
Formatter
```

Method

```java
format(String text)
```

Implement:

```java
PdfFormatter
HtmlFormatter
```

Outputs

```text
PDF: Report
HTML: Report
```

Constraints

* Demonstrate polymorphism.

---

## Question 29 — Product Inventory

Create:

```java
InventoryItem
```

Fields

```java
private String name;
private int quantity;
```

Methods

```java
addStock(int amount)
removeStock(int amount)
getQuantity()
```

Rules

* Quantity may never become negative.

---

## Question 30 — Character Hierarchy

Create abstract class:

```java
GameCharacter
```

Method

```java
attack()
```

Create:

```java
Warrior
Mage
Archer
```

Outputs

```text
Sword Attack
Magic Attack
Arrow Attack
```

Constraints

* Use abstraction.
* Use polymorphism.
