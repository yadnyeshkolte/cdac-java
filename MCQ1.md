# Java Technical Questions and Answers

### Question 1
**Output?**
```java
System.out.println(null == null);
```
- [ ] a. false
- [ ] b. Runtime error
- [x] **c. true**
- [ ] d. Compilation error

**Explanation:** In Java, comparing `null` with `null` using the equality operator `==` returns `true`.

---

### Question 2
**What will be printed?**
```java
class Test {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(arr.length);
    }
}
```
- [ ] a. Runtime error
- [ ] b. 4
- [x] **c. 3**
- [ ] d. 2

**Explanation:** The array `arr` is initialized with 3 elements (`1, 2, 3`). The `.length` property returns the number of elements in the array.

---

### Question 3
**Which interface is used to sort objects naturally?**
- [ ] a. Cloneable
- [ ] b. Comparator
- [ ] c. Serializable
- [x] **d. Comparable**

**Explanation:** The `Comparable` interface is used to define the natural ordering of objects (e.g., using the `compareTo` method). `Comparator` is used for custom, external ordering.

---

### Question 4
**Output?**
```java
static int x;
System.out.println(x);
```
- [x] **a. 0**
- [ ] b. Garbage value
- [ ] c. 1
- [ ] d. Compilation error

**Explanation:** Static member variables in Java are automatically initialized to their default values. The default value for an `int` is `0`.

---

### Question 5
**What is the output?**
```java
String s = "Java";
s.concat("World");
System.out.println(s);
```
- [ ] a. Compilation error
- [ ] b. JavaWorld
- [x] **c. Java**
- [ ] d. World

**Explanation:** Strings in Java are immutable. The `concat()` method returns a *new* String instance with the concatenated value, but `s` remains unchanged because the result was not assigned back to `s`.

---

### Question 6
**Which keyword is used to inherit a class in Java?**
- [ ] a. super
- [ ] b. implements
- [x] **c. extends**
- [ ] d. inherits

**Explanation:** The `extends` keyword is used for class inheritance. `implements` is used for interfaces.

---

### Question 7
**Output?**
```java
String s1 = "Java";
String s2 = new String("Java");
System.out.println(s1 == s2);
```
- [ ] a. true
- [ ] b. Runtime error
- [ ] c. Compilation error
- [x] **d. false**

**Explanation:** `s1` refers to an object in the String Constant Pool. `s2` refers to a new object created on the heap. The `==` operator checks for reference equality (memory address), so they are not the same object.

---

### Question 8
**Which Map implementation maintains insertion order?**
- [x] **a. LinkedHashMap**
- [ ] b. TreeMap
- [ ] c. Hashtable
- [ ] d. HashMap

**Explanation:** `LinkedHashMap` maintains the order in which elements were inserted. `TreeMap` sorts by key, and `HashMap` does not guarantee any order.

---

### Question 9
**What will be the output?**
```java
class Test {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x++);
    }
}
```
- [ ] a. 11
- [ ] b. Compilation error
- [x] **c. 10**
- [ ] d. 9

**Explanation:** The post-increment operator (`x++`) returns the current value of `x` (which is 10) before incrementing it. The print statement receives 10.

---

### Question 10
**Which exception is unchecked?**
- [x] **a. NullPointerException**
- [ ] b. SQLException
- [ ] c. ClassNotFoundException
- [ ] d. IOException

**Explanation:** Unchecked exceptions extend `RuntimeException`. `NullPointerException` is a runtime exception. The others listed are checked exceptions required to be handled at compile time.

---

### Question 11
**Which method is used to start a thread?**
- [ ] a. init()
- [ ] b. run()
- [ ] c. execute()
- [x] **d. start()**

**Explanation:** The `start()` method allocates resources and calls the `run()` method in a new thread of execution. Calling `run()` directly executes the code in the current thread.

---

### Question 12
**Output?**
```java
for(int i=0;i<3;i++);
System.out.print("Java");
```
- [ ] a. Infinite loop
- [ ] b. Compilation error
- [x] **c. Java**
- [ ] d. JavaJavaJava

**Explanation:** The semicolon `;` immediately following the `for` statement terminates the loop body. The loop runs 3 times doing nothing. Afterward, the print statement executes once, printing "Java".

---

### Question 13
**Output?**
```java
List<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(1);
System.out.println(list.size());
```
- [x] **a. 3**
- [ ] b. Compilation error
- [ ] c. 2
- [ ] d. 1

**Explanation:** `ArrayList` allows duplicate elements. Three elements were added to the list, so the size is 3.

---

### Question 14
**Which collection does not allow duplicate elements?**
- [ ] a. ArrayList
- [ ] b. LinkedList
- [ ] c. Vector
- [x] **d. HashSet**

**Explanation:** The `Set` interface (implemented by `HashSet`) prevents duplicate elements. Lists and Vectors allow duplicates.

---

### Question 15
**Output?**
```java
class Test {
    static int x = 10;
    static { x = x + 5; }
}
System.out.println(Test.x);
```
- [ ] a. 10
- [ ] b. Compilation error
- [x] **c. 15**
- [ ] d. 5

**Explanation:** The static block executes when the class is loaded. `x` is initialized to 10, then the static block adds 5, making it 15.

---

### Question 16
**What will be printed?**
```java
int a = 5;
if (a++ > 5)
    System.out.println("Yes");
else
    System.out.println("No");
```
- [ ] a. Runtime error
- [x] **b. No**
- [ ] c. Yes
- [ ] d. Compilation error

**Explanation:** `a++` is post-increment. The comparison uses the original value `5`. `5 > 5` is false. Therefore, the `else` block executes, printing "No".

---

### Question 17
**Output?**
```java
Integer i = 10;
int j = i;
System.out.println(j);
```
- [ ] a. Compilation error
- [ ] b. Runtime error
- [x] **c. 10**
- [ ] d. null

**Explanation:** Java performs automatic "unboxing" when assigning a wrapper object (`Integer`) to a primitive type (`int`). The value 10 is extracted and assigned to `j`.

---

### Question 18
**Which primitive data type occupies 8 bytes?**
- [ ] a. float
- [ ] b. int
- [x] **c. double**
- [ ] d. short

**Explanation:** A `double` is a 64-bit IEEE 754 floating point number, which occupies 8 bytes. `int` and `float` are 4 bytes; `short` is 2 bytes.

---

### Question 19
**What happens?**
```java
class Test {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } finally {
            System.out.println("Finally");
        }
    }
}
```
- [ ] a. Compilation error
- [ ] b. Exception only
- [ ] c. Finally
- [x] **d. Finally then exception**

**Explanation:** The division by zero throws an `ArithmeticException`. The `finally` block is guaranteed to execute before the thread terminates due to the unhandled exception. It prints "Finally" and then the program crashes with the exception stack trace.

---

### Question 20
**Which method is called automatically when an object is created?**
- [ ] a. finalize
- [x] **b. constructor**
- [ ] c. main
- [ ] d. init

**Explanation:** Constructors are special methods invoked automatically when an instance of an object is created using the `new` keyword.

---

### Question 21
**Which package is imported by default in every Java program?**
- [ ] a. java.net
- [ ] b. java.util
- [ ] c. java.io
- [x] **d. java.lang**

**Explanation:** The `java.lang` package (containing fundamental classes like `String`, `System`, `Integer`) is automatically imported by the compiler.

---

### Question 22
**Output of the following?**
```java
System.out.println(10 + 20 + "CDAC");
```
- [ ] a. Compilation error
- [ ] b. CDAC30
- [ ] c. 1020CDAC
- [x] **d. 30CDAC**

**Explanation:** Addition works from left to right. `10 + 20` is evaluated as integer addition (30). Then `30 + "CDAC"` is evaluated as string concatenation ("30CDAC").

---

### Question 23
**Which component converts Java bytecode into machine code?**
- [ ] a. JRE
- [x] **b. JVM**
- [ ] c. JDK
- [ ] d. Compiler

**Explanation:** The JVM (Java Virtual Machine), specifically its execution engine (interpreter/JIT compiler), converts bytecode into native machine code for execution. The `Compiler` (javac) converts source code to bytecode.

---

### Question 24
**What will happen?**
```java
class Test {
    public static void main(String[] args) {
        int[] a = new int[-5];
    }
}
```
- [ ] a. Runtime error
- [ ] b. Compilation error
- [ ] c. Array of size 0
- [x] **d. NegativeArraySizeException**

**Explanation:** Specifying a negative size for an array results in a `NegativeArraySizeException` at runtime.

---

### Question 25
**Which keyword is used to define a lambda expression?**
- [x] **a. ->**
- [ ] b. =>
- [ ] c. <>
- [ ] d. ::

**Explanation:** The arrow token `->` is used to introduce a lambda expression in Java. *(Note: The option `a` in the image appears as encoded HTML `&gt;` which represents `>`. Combined with the dash it forms the arrow `->`)*.

---

### Question 26
**Output?**
```java
System.out.println( Optional.ofNullable(null).orElse("CDAC"));
```
- [x] **a. CDAC**
- [ ] b. Compilation error
- [ ] c. Runtime error
- [ ] d. null

**Explanation:** `Optional.ofNullable(null)` returns an empty Optional. The `orElse("CDAC")` method returns the default value "CDAC" because the Optional is empty.

---

### Question 27
**Which method belongs to Object class?**
- [ ] a. compareTo()
- [ ] b. add()
- [x] **c. equals()**
- [ ] d. put()

**Explanation:** The `equals()` method is defined in the root `java.lang.Object` class and is inherited by all Java classes.

---

### Question 28
**Which keyword is used to create an object?**
- [ ] a. static
- [ ] b. this
- [x] **c. new**
- [ ] d. class

**Explanation:** The `new` keyword is used to instantiate a class (create an object).

---

### Question 29
**Which data type is used to store true or false values?**
- [x] **a. boolean**
- [ ] b. int
- [ ] c. byte
- [ ] d. char

**Explanation:** The `boolean` primitive type is capable of storing only two possible values: `true` and `false`.

---

### Question 30
**What will be printed?**
```java
class Test {
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("CDAC"));
        t.start();
    }
}
```
- [x] **a. CDAC**
- [ ] b. Runtime error
- [ ] c. No output
- [ ] d. Compilation error

**Explanation:** The lambda expression is a valid implementation of the `Runnable` interface. `t.start()` starts the thread which executes the print statement.

---

### Question 31
**Which keyword prevents inheritance?**
- [ ] a. private
- [x] **b. final**
- [ ] c. static
- [ ] d. abstract

**Explanation:** If a class is declared as `final`, it cannot be subclassed (inherited from).

---

### Question 32
**Which loop is guaranteed to execute at least once?**
- [ ] a. enhanced for
- [ ] b. for
- [x] **c. do-while**
- [ ] d. while

**Explanation:** The `do-while` loop evaluates its condition at the end of the loop body, guaranteeing that the body executes at least once.

---

### Question 33
**Which concept allows method name reuse with different parameters?**
- [x] **a. Overloading**
- [ ] b. Inheritance
- [ ] c. Encapsulation
- [ ] d. Overriding

**Explanation:** Method Overloading allows multiple methods in the same class to have the same name but different parameter lists (signatures).

---

### Question 34
**What will be printed?**
```java
class A {
    void show() { System.out.println("A"); }
}
class B extends A {
    void show() { System.out.println("B"); }
}
A obj = new B();
obj.show();
```
- [ ] a. Compilation error
- [ ] b. Runtime error
- [x] **c. B**
- [ ] d. A

**Explanation:** This demonstrates runtime polymorphism (method overriding). The object is of type `B`, so `B`'s version of `show()` is executed, even though the reference variable is of type `A`.

---

### Question 35
**What happens?**
```java
class Test {
    protected void finalize() {
        System.out.println("GC");
    }
}
```
*(Code snippet implies object creation)*
- [ ] a. Guaranteed execution
- [ ] b. Compile error
- [x] **c. finalize may or may not execute**
- [ ] d. Runtime error

**Explanation:** The `finalize()` method (deprecated in newer Java versions) is called by the Garbage Collector before an object is removed. However, there is no guarantee *when* or *if* the GC will run immediately, so execution is not guaranteed.

---

### Question 36
**Which stream is used for object serialization?**
- [x] **a. ObjectInputStream**
- [ ] b. DataInputStream
- [ ] c. BufferedInputStream
- [ ] d. FileInputStream

**Explanation:** While `ObjectOutputStream` is used to *write* (serialize) objects, `ObjectInputStream` is the corresponding class used to *read* (deserialize) objects. Among the choices provided, it is the only stream specifically designed for the Java Object Serialization mechanism.

---

### Question 37
**Which of the following is a feature of Java?**
- [ ] a. Manual memory management
- [x] **b. Object oriented**
- [ ] c. Pointer based
- [ ] d. Platform dependent

**Explanation:** Java is an Object-Oriented language. It uses automatic memory management (Garbage Collection), does not support explicit pointers, and is platform-independent ("Write Once, Run Anywhere").

---

### Question 38
**Which access modifier makes a member accessible only within the same class?**
- [ ] a. protected
- [ ] b. default
- [x] **c. private**
- [ ] d. public

**Explanation:** The `private` modifier is the most restrictive access level, allowing access only within the class where the member is defined.

---

### Question 39
**Output?**
```java
Map map = new HashMap();
map.put(1, "A");
map.put(1, "B");
System.out.println(map.size());
```
- [ ] a. Compilation error
- [ ] b. Runtime error
- [x] **c. 1**
- [ ] d. 2

**Explanation:** Maps store key-value pairs where keys must be unique. Inserting the key `1` a second time overwrites the previous value associated with that key. The size remains 1.

---

### Question 40
**What will happen?**
```java
class Test {
    private Test() {}
}
new Test();
```
- [ ] a. Warning only
- [ ] b. Object created
- [ ] c. Runtime error
- [x] **d. Compilation error**

**Explanation:** The constructor for `Test` is marked `private`. If the code `new Test()` is executed from outside the `Test` class (which is implied by the formatting of the question), it will cause a compilation error because the constructor is not visible.
```
