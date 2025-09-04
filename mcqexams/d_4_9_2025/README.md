# Java Objective Questions (Medium–Difficult)

## Q1. Which of the following statements about Java classes and objects is true? 
a) Every Java program must have at least one object.  
b) A class can exist without creating any object.  
c) An object can exist without a class.  
d) All classes must be abstract.

## Q2. 
```java
class Student {
    String name;
    int age;
    Student(String n, int a) {
        name = n;
        age = a;
    }
}

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Raj", 20);
        System.out.println(s1.name + " " + s1.age);
    }
}
```

What will be the output?  
a) Raj 20  
b) Compilation error  
c) Null 0  
d) Runtime error

## Q3. Which keyword in Java is used to call one constructor from another constructor in the same class? 
a) super  
b) this  
c) new  
d) final

## Q4. 
```java
class Demo {
    static int x = 10;
    int y = 20;
    
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        d1.x = 50;
        d1.y = 100;
        System.out.println(d2.x + " " + d2.y);
    }
}
```

What will be printed?  
a) 50 20  
b) 10 20  
c) 50 100  
d) 10 100

## Q5. Which is true about static members? 
a) Belong to the class, not objects.  
b) Memory allocated separately for each object.  
c) Cannot be accessed without creating an object.  
d) Declared using final.

## Q6. 
```java
class Employee {
    int id;
    String name;
}

public class Company {
    public static void main(String[] args) {
        Employee[] e = new Employee[3];
        System.out.println(e[0]);
    }
}
```

What will the output be?  
a) null  
b) 0  
c) Compilation error  
d) Garbage value

## Q7. Encapsulation in Java is mainly achieved using: 
a) private variables + public methods  
b) static variables  
c) constructors  
d) interfaces only

## Q8. 
```java
class A {
    private int data = 40;
    private void msg() {
        System.out.println("Hello");
    }
}

public class Test {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.data);
    }
}
```

What will happen?  
a) Prints 40  
b) Compilation error  
c) Runtime error  
d) Hello

## Q9. Which concept allows a subclass to acquire properties and methods of a superclass? 
a) Polymorphism  
b) Abstraction  
c) Inheritance  
d) Encapsulation

## Q10. 
```java
class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B");
    }
}

public class Test {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
```

Output will be:  
a) Class A  
b) Class B  
c) Compilation error  
d) Runtime error

## Q11. Which of the following supports compile-time polymorphism in Java? 
a) Method overloading  
b) Method overriding  
c) Abstract classes  
d) Interfaces

## Q12. 
```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Test {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
```

Output?  
a) Drawing Circle  
b) Drawing Shape  
c) Compilation error  
d) Runtime error

## Q13. What does the keyword this refer to in Java? 
a) The current object  
b) The parent object  
c) A static reference  
d) None

## Q14. 
```java
class Test {
    int x;
    Test(int x) {
        this.x = x;
    }
    void display() {
        System.out.println(x);
    }
}

public class Main {
    public static void main(String[] args) {
        Test t = new Test(100);
        t.display();
    }
}
```

What will be the output?  
a) 0  
b) 100  
c) Compilation error  
d) Garbage value

## Q15. Which statement is correct about final class? 
a) It cannot be instantiated.  
b) It cannot be inherited.  
c) It cannot have methods.  
d) It must be abstract.

## Q16. 
```java
final class Vehicle {}

class Car extends Vehicle {
    void run() {
        System.out.println("Running");
    }
}
```

What will happen?  
a) Running  
b) Compilation error  
c) Runtime error  
d) Nothing

## Q17. Which keyword is used to call the parent class constructor? 
a) super  
b) this  
c) parent  
d) base

## Q18. 
```java
class A {
    A() {
        System.out.println("A constructor");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("B constructor");
    }
}

public class Test {
    public static void main(String[] args) {
        B obj = new B();
    }
}
```

What will be printed?  
a) B constructor  
b) A constructor B constructor  
c) Compilation error  
d) Runtime error

## Q19. Which access modifier allows access within the same package but not from outside? 
a) public  
b) private  
c) protected  
d) default

## Q20. 
```java
class Parent {
    protected int value = 100;
}

class Child extends Parent {
    void display() {
        System.out.println(value);
    }
}

public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
```

What will be printed?  
a) 0  
b) 100  
c) Compilation error  
d) Runtime error

## Q21. Which of the following cannot be declared as static? 
a) Variable  
b) Method  
c) Constructor  
d) Nested class

## Q22. 
```java
class Test {
    static int count = 0;
    Test() {
        count++;
    }
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println(count);
    }
}
```

What will be the output?  
a) 1  
b) 2  
c) 0  
d) Compilation error

## Q23. Which statement is false? 
a) Abstract classes can have constructors.  
b) Interfaces can have static methods.  
c) final methods can be overridden.  
d) A class can implement multiple interfaces.

## Q24. 
```java
class A {
    void display() {
        System.out.println("A");
    }
}

class B extends A {
    void display() {
        System.out.println("B");
    }
}

class C extends B {
    void display() {
        super.display();
    }
}

public class Test {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}
```

Output?  
a) A  
b) B  
c) C  
d) Compilation error

## Q25. Which keyword prevents a variable from being modified after initialization? 
a) const  
b) final  
c) static  
d) private

## Q26. 
```java
class Test {
    final int x = 10;
    void change() {
        x = 20;
    }
}
```

What will happen?  
a) Prints 20  
b) Compilation error  
c) Runtime error  
d) Prints 10

## Q27. Which is true about constructors? 
a) They can be inherited.  
b) They cannot have return type.  
c) They must be static.  
d) They can be final.

## Q28. 
```java
class Test {
    private Test() {}
    public static void main(String[] args) {
        Test t = new Test();
    }
}
```

What will happen?  
a) Compilation error  
b) Runtime error  
c) Creates object successfully  
d) Null pointer exception

## Q29. Which of the following concepts allows multiple classes to have different implementations of the same method? 
a) Inheritance  
b) Polymorphism  
c) Encapsulation  
d) Abstraction

## Q30. 
```java
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a = new Cat();
        a.sound();
    }
}
```

What will be the output?  
a) Bark Bark  
b) Meow Meow  
c) Bark Meow  
d) Compilation error
