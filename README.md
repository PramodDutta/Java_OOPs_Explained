- Website - https://thetestingacademy.com
- Author - Pramod

# OOPs Concept Java in 1 Shot

- Oops (Object-Oriented Programming) concepts are fundamental principles in Java that enable developers to create modular and reusable code. 

- Java is an object-oriented programming language, and it supports the four main principles of OOP: encapsulation, inheritance, polymorphism, and abstraction. Let's briefly discuss each of these concepts:


# Constructor

Constructor is used to construct the object of a class.

- A constructor’s name must be exactly the same as the name of its class.
- constructor is a special method because it does not have a return type


- Default Constructor
- Param Constructor
- This Demo
- Copy Constructor in Java


# Encapsulation

Encapsulation in OOP refers to binding the data and the methods to manipulate that data together in a single unit (class).



Encapsulation is normally done to hide the state and representation of an object from outside



a good convention is to declare all the data members or instance variables of a class private

### Advantages of Encapsulation
- Classes are easier to change and maintain.
- We can specify which data member we want to keep hidden or accessible.
- We decide which variables have read/write privileges (increases flexibility).


Create a Rectangle Class

1. Input Length, Width.
2. get Area - L * W
3. Default C, Parameter C



// Class Rectangle
class Rectangle {

// Private Fields
private int length;
private int width;

// Default Constructor
public Rectangle() {
this.length = 0;
this.width = 0;
}

// Parameterized Constructor
public Rectangle(int length, int width) {
this.length = length;
this.width = width;

}

// Method to calculate Area of a rectangle
public int getArea() {
return this.length * this.width;
}

}

class Demo {

public static void main(String args[]) {

    Rectangle obj = new Rectangle(2, 2);
    System.out.println(obj.getArea());

}

}


## Access Modifiers 

### Access Modifiers

They are used to impose access restrictions on different data members and member functions.

### Three types of access modifiers in Java

- Private  : A private member cannot be accessed directly from outside the class
- Public : members can be directly accessed by anything which is in the same scope as the class object.
- Protected :access level to the protected members lies somewhere between private and public.
  protected data members can be accessed inside a Java package
- Default :  The default access is similar to the protected. It also has package-level access


Example of Cop and Police

Private Gun, public CheckGun, Shoot is Private or Protected!

# Inheritance

## What is Inheritance?
- Inheritance provides a way to create a new class from an existing class
- new class is a specialized version of the existing class such that it inherits all the non-private fields (variables) and methods of the existing class.
- The existing class is used as a starting point or as a base to create the new class.

#### The IS A relationship

A square IS A shape
Java IS A programming language
Car IS A vehicle

#### Terms

- SuperClass (Parent Class or Base Class)
- SubClass (Child Class or Derived Class)

*An object of the child class can use* :
- All non-private members defined in the child class.
- All non-private members defined in the parent class.

The extends Keyword

SubClass extends SuperClass{
//contents of SubClass
}


this keyword in Java is used to refer to the instance of the current class.

the super keyword in Java is used to refer to the SuperClass members from inside the immediate Subclass.


### Use of Super
Accessing parent class fields
Calling a parent class method
Using with constructors (Calling parent default constructors)

### Types of Inheritance
- Single - Vehicle class (Super class) and the Car class (Sub class)
- Multi-level
    - A Car IS A Vehicle
    - A Tesla EV IS A Car
- Hierarchical
    - A Tesla Car IS A Vehicle
    - A Tesla Truck IS A Vehicle

In Java, Multiple and Hybrid inheritance are applicable using interfaces only.

- Multiple
    - A Hyundai Elantra IS A Car
    - A Hyundai Elantra IS A Sedan
- Hybrid
    - A combustion engine is an engine
    - An electric motors engine is an engine
    - A Hybrid engine combines both combustion engine and electric motors



Super Keyword

this keyword in Java is used to refer to the instance of the current class
the super keyword in Java is used to refer to the SuperClass members from inside the immediate Subclass.

What Super can Do?
You can use Super to Accessing parent class fields.
Calling a parent class method#

# Polymorphism

#### What is Polymorphism?

Poly means many and Morph means forms.

polymorphism refers to the same object exhibiting different forms and behaviors

Shape Class. The exact shape you choose can be anything. It can be a rectangle, a circle, a polygon or a diamond. So, these are all shapes but their properties are different.

#### Method overriding aka Dynamic /Runtime polymorphism
Shape[] shape = new Shape[2]; // Creating shape array of size 2

    shape[0] = new Circle(2); // creating circle object at index 0
    shape[1] = new Rectangle(2, 2); // creating rectangle object at index 1

    System.out.println("Area of the Circle: " + shape[0].getArea());
    System.out.println("Area of the Rectangle: " + shape[1].getArea());


#### Method Overloading aka Static polymorphism

Arguments must be different in the case of overloading.

int add(int num1, int num2)
int add(int num1, int num2, int num3 )
int add(int num1, int num2, int num3, int num4 )


#dynamic or runtime polymorphism

Shape obj1 = new Circle(3);
Shape obj2 = new Rectangle(2, 3);
obj1.getArea();
obj2.getArea();

``` obj1.getArea() will execute getArea() method of the subclass Circle class. ```

``` obj2.getArea() will execute getArea() method of the subclass Rectangle class. ```

# Abstraction

### Abstraction

showing only the essential features of an object to the user and hiding the inner details to reduce complexity.

TV Vol Up
Car Driving


Math.min() class

### How to achieve abstraction.

Abstract Classes
Interfaces

#### Abstract methods
public abstract void methodName(parameter(s));

#### Abstract class
abstract class ClassName {

// Implementation here

}

#### An interface is just like a class and specifies the behavior that a class must implement.

interface interfaceName {

// Code goes here

}

An interface can have:

- abstract method(s)
- default method(s)
- static method(s)
- private method(s)
- private static method(s)
- public static final variable(s)

Interfaces allow us to achieve 100% abstraction.
Interfaces can be used to achieve multiple inheritance.
