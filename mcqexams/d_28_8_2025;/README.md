# Java Objective Questions (25)

## Data Types & Variables

**1.** Which of the following is the size of a char in Java?
- a) 8 bits
- b) 16 bits
- c) 32 bits
- d) Depends on system

**2.** What will be the output of the following?
```java
int a = 100000;
short b = (short) a;
System.out.println(b);
```
- a) 100000
- b) Compilation error
- c) A negative number
- d) Undefined

**3.** Which of the following are valid declarations in Java?
- a) `int _a = 10;`
- b) `int 1num = 5;`
- c) `double $value = 55.5;`
- d) `boolean flag = 1;`

**4.** What is the default value of a local variable in Java?
- a) 0
- b) null
- c) garbage value
- d) No default value

**5.** Which data type is best suited for storing a 10-digit mobile number?
- a) int
- b) long
- c) float
- d) double

## Operators

**6.** What is the result of:
```java
int x = 5;
int y = ++x * 2;
System.out.println(y);
```
- a) 10
- b) 12
- c) 14
- d) Compilation error

**7.** Which operator has the highest precedence in Java?
- a) `++`
- b) `*`
- c) `+`
- d) `&&`

**8.** What will be the output?
```java
int a = 10, b = 20, c = 30;
System.out.println(a < b && b < c && a < c);
```
- a) true
- b) false
- c) 1
- d) Compilation error

**9.** Which is not a valid assignment?
- a) `int a = 5 / 2;`
- b) `double d = 5 / 2;`
- c) `float f = 5.0 / 2;`
- d) `boolean b = 5 > 2;`

**10.** Output of the following:
```java
int a = 5;
System.out.println(a++ + ++a);
```
- a) 11
- b) 12
- c) 13
- d) 14

## Conditional Statements

**11.** Which keyword is used to exit from a loop prematurely?
- a) stop
- b) break
- c) exit
- d) continue

**12.** What will be output?
```java
int x = 10;
if(x = 20) {
    System.out.println("Hello");
}
```
- a) Hello
- b) No output
- c) Compilation error
- d) Runtime error

**13.** Which statement is true about the switch statement in Java?
- a) It works with int, char, byte, String, enum.
- b) It cannot work with String.
- c) default must be the last case.
- d) Fall-through is not allowed.

**14.** Which loop executes at least once even if the condition is false?
- a) for
- b) while
- c) do-while
- d) None

**15.** What is wrong with the following code?
```java
for(int i=0; i<5; i++); {
    System.out.println("Hello");
}
```
- a) Infinite loop
- b) Prints Hello 5 times
- c) Prints Hello once
- d) Compilation error

## Methods

**16.** Which is true about Java methods?
- a) A method must always return a value.
- b) A method may return at most one value.
- c) Methods can return multiple values.
- d) Methods cannot be overloaded.

**17.** What is the output?
```java
public class Test {
    static int square(int x) {
        return x * x;
    }
    public static void main(String[] args) {
        System.out.println(square(5));
    }
}
```
- a) 10
- b) 25
- c) 5
- d) Compilation error

**18.** In Java, method overloading is determined by:
- a) Return type only
- b) Number and type of parameters
- c) Method name only
- d) Both return type and name

**19.** Which modifier makes a variable class level instead of instance level?
- a) private
- b) final
- c) static
- d) abstract

**20.** Output of:
```java
class Demo {
    static int count = 0;
    Demo() { count++; }
}
public class Main {
    public static void main(String[] args) {
        new Demo();
        new Demo();
        System.out.println(Demo.count);
    }
}
```
- a) 0
- b) 1
- c) 2
- d) Compilation error

## Arrays

**21.** Which of the following is correct array declaration?
- a) `int arr[5];`
- b) `int[] arr = new int[5];`
- c) `arr = int[5];`
- d) `int arr = new int[5];`

**22.** What is the default value of elements in an int array?
- a) null
- b) 0
- c) garbage value
- d) depends on JVM

**23.** What will be output?
```java
int[] arr = {1,2,3,4,5};
System.out.println(arr[2]);
```
- a) 2
- b) 3
- c) 4
- d) Compilation error

**24.** What happens if we access arr[10] when array size is 5?
- a) Prints 0
- b) Prints null
- c) ArrayIndexOutOfBoundsException
- d) Compilation error

**25.** Output of the code:
```java
public class Test {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = a;
        b[1] = 10;
        System.out.println(a[1]);
    }
}
```
- a) 2
- b) 10
- c) 0
- d) Compilation error
