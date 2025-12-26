# Java Final Exam - Comprehensive Study Notes

## Table of Contents
1. [Fundamentals & Basics](#1-fundamentals--basics)
2. [Data Types & Variables](#2-data-types--variables)
3. [Operators & Expressions](#3-operators--expressions)
4. [Strings](#4-strings)
5. [Arrays](#5-arrays)
6. [Object-Oriented Programming](#6-object-oriented-programming)
7. [Inheritance & Polymorphism](#7-inheritance--polymorphism)
8. [Access Modifiers](#8-access-modifiers)
9. [Collections Framework](#9-collections-framework)
10. [Exception Handling](#10-exception-handling)
11. [Multithreading](#11-multithreading)
12. [Java 8+ Features](#12-java-8-features)
13. [JVM, JRE, JDK](#13-jvm-jre-jdk)
14. [Memory Management & Garbage Collection](#14-memory-management--garbage-collection)
15. [I/O & Serialization](#15-io--serialization)

---

## 1. Fundamentals & Basics

### Java Features
- **Object-Oriented**: Everything revolves around objects and classes
- **Platform Independent**: "Write Once, Run Anywhere" (WORA)
- **Automatic Memory Management**: Garbage Collection handles memory
- **No Explicit Pointers**: Safer memory access
- **Robust & Secure**: Strong type checking, exception handling

### Default Package
```java
// java.lang is imported by default
// No need to import String, System, Integer, Math, etc.
System.out.println("Hello"); // System is from java.lang
```

### `null` Comparison
```java
// null == null returns true
System.out.println(null == null); // true
```

---

## 2. Data Types & Variables

### Primitive Data Types & Sizes
```java
// Integer types
byte    -> 1 byte  (8 bits)   Range: -128 to 127
short   -> 2 bytes (16 bits)  Range: -32,768 to 32,767
int     -> 4 bytes (32 bits)  Range: -2^31 to 2^31-1
long    -> 8 bytes (64 bits)  Range: -2^63 to 2^63-1

// Floating-point types
float   -> 4 bytes (32 bits)  Single precision
double  -> 8 bytes (64 bits)  Double precision ✓

// Other types
char    -> 2 bytes (16 bits)  Unicode character
boolean -> 1 bit (true/false) ✓
```

### Default Values
```java
// Static and instance variables get default values
static int x;        // 0
static double d;     // 0.0
static boolean b;    // false
static String s;     // null
static Object obj;   // null

// Local variables MUST be initialized before use
void method() {
    int y;
    // System.out.println(y); // Compilation Error! 
}
```

### Autoboxing and Unboxing
```java
// Autoboxing: primitive → wrapper object
Integer i = 10;  // int 10 automatically boxed to Integer

// Unboxing: wrapper object → primitive
int j = i;       // Integer automatically unboxed to int
System.out.println(j); // 10
```

---

## 3. Operators & Expressions

### Increment/Decrement Operators
```java
// Post-increment (x++): Use current value, then increment
int x = 10;
System.out.println(x++); // Prints 10, then x becomes 11

// Pre-increment (++x): Increment first, then use new value
int y = 10;
System.out.println(++y); // y becomes 11, then prints 11
```

### Comparison with Post-Increment
```java
int a = 5;
if (a++ > 5) {  // Uses 5 for comparison, then a becomes 6
    System.out.println("Yes");
} else {
    System.out. println("No");  // Prints "No" because 5 > 5 is false
}
```

### String Concatenation vs Arithmetic
```java
// Left-to-right evaluation
System. out.println(10 + 20 + "CDAC");  // "30CDAC" (add first, concat second)
System.out.println("CDAC" + 10 + 20);  // "CDAC1020" (concat from start)

// Numeric operations are performed before string concatenation
// when operands are both numbers
```

---

## 4. Strings

### String Immutability
```java
String s = "Java";
s. concat("World");      // Creates new String, doesn't modify s
System.out.println(s);  // Prints "Java"

// Correct way: 
s = s.concat("World");  // Assign back to s
System.out.println(s);  // Prints "JavaWorld"
```

### String Pool vs Heap
```java
String s1 = "Java";              // String literal → String Pool
String s2 = new String("Java");  // new keyword → Heap

// == checks reference equality (memory address)
System.out.println(s1 == s2);    // false (different memory locations)

// .equals() checks content equality
System.out.println(s1.equals(s2)); // true (same content)
```

**Key Points:**
- String literals go to String Constant Pool (for memory efficiency)
- `new String()` always creates a new object on the heap
- Use `.equals()` for content comparison
- Use `==` only for reference comparison

---

## 5. Arrays

### Array Basics
```java
// Array length property
int[] arr = {1, 2, 3};
System.out.println(arr.length); // 3 (not 4)

// Array is 0-indexed
// arr[0] = 1, arr[1] = 2, arr[2] = 3
```

### Array Creation Rules
```java
// Valid array creation
int[] valid = new int[5];    // Array of size 5
int[] valid2 = new int[0];   // Array of size 0 (valid but empty)

// Invalid array creation
int[] invalid = new int[-5]; // NegativeArraySizeException at runtime ✗
```

---

## 6. Object-Oriented Programming

### Object Creation
```java
// 'new' keyword is used to create objects
MyClass obj = new MyClass();  // Calls constructor
```

### Constructor
```java
// Constructor is called automatically when object is created
class Person {
    String name;
    
    // Constructor - same name as class, no return type
    Person(String name) {
        this.name = name;
        System.out.println("Object created");
    }
}

// Usage: 
Person p = new Person("John"); // "Object created" is printed
```

### Private Constructor
```java
class Singleton {
    private Singleton() {}  // Private constructor
}

// From outside the class:
Singleton obj = new Singleton(); // Compilation Error!  ✗

// Use case: Singleton pattern, utility classes
```

### Object Class Methods
```java
// Every class inherits from Object class
// Important Object class methods:
class Object {
    public boolean equals(Object obj) { }  ✓
    public int hashCode() { }
    public String toString() { }
    protected Object clone() { }
    protected void finalize() { }  // Deprecated
}

// NOT in Object class:
// - compareTo() → Comparable interface
// - add() → Collection/List interface
// - put() → Map interface
```

---

## 7. Inheritance & Polymorphism

### Inheritance Keywords
```java
// extends:  Used for class inheritance
class Child extends Parent { }  ✓

// implements: Used for interface implementation
class MyClass implements MyInterface { }

// super:  Refers to parent class
// this: Refers to current class
```

### Preventing Inheritance
```java
// 'final' keyword prevents inheritance
final class CannotBeExtended {
    // This class cannot have subclasses
}

// class Child extends CannotBeExtended { } // Compilation Error! ✗
```

### Method Overloading
```java
// Same method name, different parameters (compile-time polymorphism)
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

### Method Overriding (Runtime Polymorphism)
```java
class A {
    void show() {
        System.out.println("A");
    }
}

class B extends A {
    @Override
    void show() {  // Overriding parent method
        System.out.println("B");
    }
}

// Runtime polymorphism: 
A obj = new B();  // Reference type: A, Object type: B
obj.show();       // Prints "B" (method of actual object type)
```

**Key Concept:** 
- Method called depends on **object type**, not reference type
- Decided at **runtime** (dynamic method dispatch)

---

## 8. Access Modifiers

### Access Level Summary
```java
// From most restrictive to least restrictive: 

private:     // Only within same class ✓
            // Most restrictive

default:    // Within same package only
(no modifier) // Package-private

protected:  // Same package + subclasses in other packages

public:     // Accessible everywhere
            // Least restrictive
```

### Access Modifier Examples
```java
class MyClass {
    private int x;      // Only within MyClass
    int y;              // Within same package (default)
    protected int z;    // Same package + subclasses
    public int w;       // Anywhere
}
```

---

## 9. Collections Framework

### List vs Set
```java
// List: Ordered, allows duplicates
List<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(1);  // Duplicate allowed
System.out.println(list.size()); // 3 ✓

// Set: Unordered, NO duplicates
Set<Integer> set = new HashSet<>();
set.add(1);
set.add(2);
set.add(1);  // Duplicate ignored
System.out.println(set.size()); // 2
```

### Collections That Don't Allow Duplicates
```java
// Set implementations:
HashSet      ✓ // No duplicates, no order
LinkedHashSet  // No duplicates, insertion order maintained
TreeSet        // No duplicates, sorted order

// Allow duplicates:
ArrayList, LinkedList, Vector ✗
```

### Map Interface
```java
// Map stores key-value pairs
// Keys must be unique, values can duplicate

Map<Integer, String> map = new HashMap<>();
map.put(1, "A");    // {1=A}
map.put(1, "B");    // {1=B} - overwrites previous value
System.out.println(map.size()); // 1 ✓
```

### Map Implementations - Order Behavior
```java
// HashMap: No order guaranteed
Map<Integer, String> hashMap = new HashMap<>();

// LinkedHashMap: Maintains insertion order ✓
Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
linkedHashMap.put(3, "C");
linkedHashMap.put(1, "A");
linkedHashMap.put(2, "B");
// Iteration order: 3, 1, 2 (insertion order)

// TreeMap: Sorted by natural order of keys
Map<Integer, String> treeMap = new TreeMap<>();
treeMap.put(3, "C");
treeMap.put(1, "A");
treeMap.put(2, "B");
// Iteration order: 1, 2, 3 (sorted)

// Hashtable: No order (also synchronized, legacy)
```

### Comparable vs Comparator
```java
// Comparable: Natural ordering (within the class)
class Student implements Comparable<Student> {
    int marks;
    
    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks;
    }
}

// Comparator: Custom ordering (external to class)
Comparator<Student> nameComparator = new Comparator<Student>() {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name. compareTo(s2.name);
    }
};

// Usage:
Collections.sort(students);              // Uses Comparable
Collections.sort(students, nameComparator); // Uses Comparator
```

---

## 10. Exception Handling

### Checked vs Unchecked Exceptions
```java
// Unchecked (RuntimeException and subclasses) - not required to handle
NullPointerException           ✓
ArrayIndexOutOfBoundsException
ArithmeticException
NegativeArraySizeException
IllegalArgumentException

// Checked (must be handled or declared) - compiler enforced
IOException                    ✗
SQLException                   ✗
ClassNotFoundException         ✗
FileNotFoundException
```

### Try-Finally Execution
```java
// Finally ALWAYS executes, even if exception occurs
try {
    int x = 10 / 0;  // ArithmeticException
    System.out.println("Try");
} finally {
    System.out.println("Finally");  // This WILL execute
}
// Output: "Finally" then exception is thrown

// Execution order:
// 1. Exception occurs
// 2. Finally block executes
// 3. Exception propagates
```

### Finally Block Key Points
- Executes whether exception occurs or not
- Executes even if `return` statement in try/catch
- Only doesn't execute if:  JVM exits (`System.exit()`) or thread dies

---

## 11. Multithreading

### Starting a Thread
```java
// Method to start a thread:  start() ✓

// Wrong ways: 
thread.run();      // ✗ Doesn't create new thread, runs in current thread
thread.execute();  // ✗ Not a Thread method
thread.init();     // ✗ Not a Thread method

// Correct way:
Thread t = new Thread(() -> {
    System.out.println("Running in new thread");
});
t.start();  // ✓ Creates new thread and calls run() method
```

### Creating Threads
```java
// Method 1: Extend Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
}
MyThread t = new MyThread();
t.start();

// Method 2: Implement Runnable interface (preferred)
class MyRunnable implements Runnable {
    public void run() {
        System.out. println("Thread running");
    }
}
Thread t = new Thread(new MyRunnable());
t.start();

// Method 3: Lambda expression (Java 8+)
Thread t = new Thread(() -> System.out.println("Thread running"));
t.start();
```

---

## 12. Java 8+ Features

### Lambda Expressions
```java
// Syntax: (parameters) -> expression or block
// Symbol: -> ✓

// Examples: 
Runnable r = () -> System.out.println("CDAC");

BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

List<String> names = Arrays.asList("John", "Jane", "Bob");
names.forEach(name -> System.out.println(name));
```

### Method References
```java
// Syntax: ::  (double colon)

// Static method reference
Function<String, Integer> parser = Integer::parseInt;

// Instance method reference
String str = "Hello";
Supplier<Integer> lengthSupplier = str::length;

// Constructor reference
Supplier<ArrayList> listSupplier = ArrayList::new;
```

### Optional Class
```java
// Used to avoid NullPointerException

// Creating Optional
Optional<String> opt1 = Optional.of("CDAC");       // Non-null value
Optional<String> opt2 = Optional.empty();          // Empty Optional
Optional<String> opt3 = Optional.ofNullable(null); // May be null ✓

// Using Optional
String result = Optional.ofNullable(null)
                        .orElse("CDAC");  // Returns "CDAC" ✓

// Other methods:
opt. orElseGet(() -> "Default");      // Lazy evaluation
opt.orElseThrow(() -> new Exception()); // Throw if empty
opt.ifPresent(val -> System.out.println(val)); // Execute if present
```

---

## 13. JVM, JRE, JDK

### Components Overview
```
┌─────────────────────────────────┐
│            JDK                  │  Java Development Kit
│  ┌───────────────────────────┐  │  - Compiler (javac)
│  │         JRE               │  │  - Debugger
│  │  ┌─────────────────────┐  │  │  - Development tools
│  │  │       JVM           │  │  │
│  │  │  - Execution Engine │  │  │
│  │  │  - Garbage Collector│  │  │
│  │  │  - JIT Compiler     │  │  │
│  │  └─────────────────────┘  │  │
│  │  - Class Libraries        │  │
│  └───────────────────────────┘  │
└─────────────────────────────────┘
```

### Roles
```java
// JDK (Java Development Kit)
// - Full development environment
// - Includes JRE + development tools (javac, javadoc, debugger)

// JRE (Java Runtime Environment)
// - Runtime environment to execute Java programs
// - Includes JVM + library classes

// JVM (Java Virtual Machine) ✓
// - Converts bytecode to machine code
// - Platform-dependent (different for Windows, Linux, Mac)
// - Execution engine, garbage collector, JIT compiler

// Compiler (javac)
// - Converts . java source code to .class bytecode
// - Part of JDK, not JVM
```

### Bytecode to Machine Code
**JVM** converts Java bytecode into machine-specific code ✓

---

## 14. Memory Management & Garbage Collection

### finalize() Method
```java
class MyClass {
    @Override
    protected void finalize() {
        System.out.println("GC called");
    }
}

// Key Points:
// - Called by Garbage Collector BEFORE removing object
// - NO GUARANTEE when or if it will be called ✓
// - Deprecated since Java 9
// - Don't rely on it for cleanup
```

### Garbage Collection Characteristics
- Automatic memory management
- Removes unreferenced objects
- Can be suggested using `System.gc()` (not guaranteed)
- finalize() may or may not execute ✓

---

## 15. I/O & Serialization

### Serialization Streams
```java
// Serialization: Object → byte stream (writing)
ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.dat"));
oos.writeObject(myObject);

// Deserialization: byte stream → Object (reading)
ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.dat")); ✓
Object obj = ois.readObject();

// Other streams:
FileInputStream      // Reads bytes from file
BufferedInputStream  // Buffers input for efficiency
DataInputStream      // Reads primitive data types
```

### Stream Types
```java
// Byte Streams (8-bit)
InputStream, OutputStream
FileInputStream, FileOutputStream
BufferedInputStream, BufferedOutputStream
ObjectInputStream, ObjectOutputStream ✓

// Character Streams (16-bit, Unicode)
Reader, Writer
FileReader, FileWriter
BufferedReader, BufferedWriter
```

---

## 16. Control Flow Statements

### Loop with Semicolon Trap
```java
// Semicolon immediately after loop = empty loop body
for(int i = 0; i < 3; i++);  // Loop does nothing 3 times
System.out.print("Java");     // Executes once after loop

// Output: Java (printed once only) ✓

// Common mistake - the semicolon ends the loop! 
```

### do-while Loop
```java
// Only loop guaranteed to execute at least once ✓
do {
    // This executes first
    System.out.println("Executed");
} while (false);  // Condition checked after execution

// Output: Executed (even though condition is false)

// Compare with while:
while (false) {
    System.out.println("Never executed");  // Skipped
}
```

---

## 17. Static Members & Blocks

### Static Block
```java
class Test {
    static int x = 10;
    
    // Static block - executes when class is loaded
    static {
        x = x + 5;  // Modifies x to 15
        System.out.println("Static block executed");
    }
}

// First access to class: 
System.out.println(Test.x);  // Prints 15 ✓

// Execution order:
// 1. Static variable initialization (x = 10)
// 2. Static block execution (x = 15)
// 3. Class is ready for use
```

### Static Initialization Order
```java
class Example {
    static int a = 1;           // 1st:  initialized in order
    static int b = 2;           // 2nd
    
    static {                    // 3rd: static block
        a = 10;
        b = 20;
    }
    
    static int c = a + b;       // 4th: c = 30
}
```

---

## Key Exam Tips & Common Traps

### 1. Post-increment in Conditions
```java
int a = 5;
if (a++ > 5) { }  // Uses 5, then increments to 6
// 5 > 5 is FALSE
```

### 2. String Immutability
```java
String s = "Java";
s. concat("World");  // Creates new string, s unchanged
// MUST assign:  s = s.concat("World");
```

### 3. == vs equals()
```java
String s1 = "Java";           // Pool
String s2 = new String("Java"); // Heap
s1 == s2        // false (different references)
s1.equals(s2)   // true (same content)
```

### 4. Array Length
```java
int[] arr = {1, 2, 3};
arr.length  // 3 (property, not method - no parentheses)
```

### 5. HashMap Key Uniqueness
```java
map.put(1, "A");
map.put(1, "B");  // Overwrites, size = 1
```

### 6. ArrayList Allows Duplicates
```java
list.add(1);
list.add(1);  // Allowed, size = 2
```

### 7. Finally Always Executes
```java
try {
    return;  // Even with return
} finally {
    // This STILL executes
}
```

### 8. Thread start() vs run()
```java
thread.start();  // Creates new thread ✓
thread.run();    // Runs in current thread ✗
```

### 9. Lambda Arrow Operator
```java
() -> { }   // Correct ✓
() => { }   // Wrong ✗
```

### 10. Access Modifiers Order
```
private < default < protected < public
(Most restrictive → Least restrictive)
```

---

## Quick Reference Cheat Sheet

### Data Type Sizes
- `byte`: 1 byte
- `short`: 2 bytes
- `int`: 4 bytes
- `long`: 8 bytes
- `float`: 4 bytes
- **`double`: 8 bytes** ✓
- `char`: 2 bytes
- **`boolean`: true/false** ✓

### Keywords for Object Creation & Inheritance
- **`new`**: Create object ✓
- **`extends`**: Inherit class ✓
- `implements`: Implement interface
- **`final`**: Prevent inheritance ✓

### Collection Ordering
- **`LinkedHashMap`**: Insertion order ✓
- `TreeMap`: Sorted order
- `HashMap`: No order

### Exception Types
- **Unchecked:  `NullPointerException`** ✓
- Checked: `IOException`, `SQLException`, `ClassNotFoundException`

### Thread Methods
- **`start()`**: Start thread ✓
- `run()`: Define thread task
- `sleep()`: Pause thread
- `join()`: Wait for thread to die

### Object Class Methods
- **`equals()`** ✓
- `hashCode()`
- `toString()`
- `clone()`
- `finalize()` (deprecated)

### Interfaces for Comparison
- **`Comparable`**: Natural ordering ✓
- `Comparator`: Custom ordering

### Optional Methods
- **`orElse(value)`**: Return value if empty ✓
- `orElseGet(supplier)`: Lazy evaluation
- `orElseThrow()`: Throw exception if empty
- `ifPresent(consumer)`: Execute if present

### Lambda & Stream Operators
- **`->`**: Lambda expression ✓
- `:: `: Method reference
- `|>`: Not used in Java

### Serialization Streams
- **`ObjectInputStream`**: Deserialize ✓
- `ObjectOutputStream`: Serialize

### Loop Guaranteed to Execute
- **`do-while`**: At least once ✓
- `while`: May not execute at all
- `for`: May not execute at all

### Default Package
- **`java.lang`**: Auto-imported ✓

### JVM Component
- **`JVM`**: Bytecode → Machine code ✓

---

## Practice Questions Strategy

### When You See... 

**"Output?"** → Trace through code line by line
- Check for post/pre increment
- String concatenation vs arithmetic
- Reference vs content equality

**"Which exception?"** → Checked vs Unchecked
- RuntimeException = Unchecked

**"What happens?"** → Compile error vs Runtime error vs Success
- Look for access modifiers
- Check array size
- Verify exception handling

**"Which method/class/interface?"** → Know your core APIs
- Object class methods
- Collection interfaces
- Thread methods
- Optional methods

**"Which keyword?"** → Language syntax
- Inheritance:  `extends`
- Object creation: `new`
- Prevent inheritance: `final`
- Lambda: `->`

---

## Final Preparation Checklist

- [ ] Review all default values for primitive types
- [ ] Practice increment/decrement operator questions
- [ ] Understand String pool vs heap objects
- [ ] Know collection characteristics (order, duplicates)
- [ ] Memorize exception hierarchy (checked/unchecked)
- [ ] Practice polymorphism examples
- [ ] Review access modifier visibility
- [ ] Understand static initialization order
- [ ] Know thread lifecycle and methods
- [ ] Practice Optional and lambda syntax
- [ ] Review try-catch-finally execution order
- [ ] Understand Map key uniqueness
- [ ] Know loop execution guarantees

---

**Good luck with your exam!  🍀**

Focus on understanding concepts rather than memorizing answers. Practice tracing through code execution step by step. 
