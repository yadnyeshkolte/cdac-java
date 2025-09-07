# Java Objective Questions - Answer Key

## Data Types & Variables

**1. Answer: b) 16 bits**
- **Explanation:** In Java, `char` is always 16 bits (2 bytes) regardless of the platform. It uses Unicode encoding.

**2. Answer: c) A negative number**
- **Explanation:** When casting a large `int` (100000) to `short`, overflow occurs. Since `short` can hold values from -32,768 to 32,767, the value wraps around resulting in a negative number (-31072).

**3. Answer: a) int _a = 10;**
- **Explanation:** 
  - a) Valid - identifiers can start with underscore
  - b) Invalid - identifiers cannot start with numbers
  - c) Valid - identifiers can start with $ (though not recommended)
  - d) Invalid - boolean can only be true/false, not numeric values

**4. Answer: d) No default value**
- **Explanation:** Local variables in Java must be explicitly initialized before use. They don't have default values like instance variables.

**5. Answer: b) long**
- **Explanation:** A 10-digit mobile number exceeds the range of `int` (max ~2.1 billion). `long` can handle larger numbers. `String` would also work but wasn't an option.

## Operators

**6. Answer: b) 12**
- **Explanation:** `++x` increments x to 6 first, then multiplies by 2: 6 * 2 = 12.

**7. Answer: a) ++**
- **Explanation:** Unary operators like `++` have higher precedence than arithmetic operators like `*`, `+`, and logical operators like `&&`.

**8. Answer: a) true**
- **Explanation:** All conditions are true: 10 < 20 && 20 < 30 && 10 < 30 evaluates to true.

**9. Answer: c) float f = 5.0 / 2;**
- **Explanation:** 5.0 is a double literal. Assignment to float requires explicit casting: `float f = (float)(5.0 / 2);` or use `5.0f`.

**10. Answer: c) 13**
- **Explanation:** 
  - `a++` uses current value (5), then increments a to 6
  - `++a` increments a to 7, then uses that value
  - Result: 5 + 7 = 12. Wait, let me recalculate:
  - `a++` = 5 (post-increment), a becomes 6
  - `++a` = 7 (pre-increment), a becomes 7
  - Total: 5 + 7 = 12
  - **Correction: Answer should be b) 12**

## Conditional Statements

**11. Answer: b) break**
- **Explanation:** `break` statement is used to exit loops prematurely. `continue` skips current iteration but doesn't exit the loop.

**12. Answer: c) Compilation error**
- **Explanation:** Assignment operator `=` is used instead of equality operator `==`. This causes a compilation error because assignment returns int, not boolean.

**13. Answer: a) It works with int, char, byte, String, enum**
- **Explanation:** Switch statements support these types. `default` doesn't have to be last, and fall-through is allowed (though not recommended without break statements).

**14. Answer: c) do-while**
- **Explanation:** `do-while` loop executes the body first, then checks the condition, guaranteeing at least one execution.

**15. Answer: c) Prints Hello once**
- **Explanation:** There's a semicolon after the for loop, making it an empty loop. The block with println executes only once after the loop completes.

## Methods

**16. Answer: b) A method may return at most one value**
- **Explanation:** Java methods can return zero (void) or one value. To return multiple values, you need objects, arrays, or collections.

**17. Answer: b) 25**
- **Explanation:** `square(5)` returns 5 * 5 = 25.

**18. Answer: b) Number and type of parameters**
- **Explanation:** Method overloading in Java is determined by the method signature: number, type, and order of parameters. Return type is not considered.

**19. Answer: c) static**
- **Explanation:** `static` modifier makes variables belong to the class rather than instances, making them class-level variables.

**20. Answer: c) 2**
- **Explanation:** Two `Demo` objects are created, each calling the constructor that increments the static `count` variable. Final value: 2.

## Arrays

**21. Answer: b) int[] arr = new int[5];**
- **Explanation:** This is the correct Java syntax for array declaration and initialization. Option a) is C/C++ style.

**22. Answer: b) 0**
- **Explanation:** Java automatically initializes array elements to default values. For `int` arrays, the default value is 0.

**23. Answer: b) 3**
- **Explanation:** Array indexing starts from 0. `arr[2]` accesses the third element, which is 3.

**24. Answer: c) ArrayIndexOutOfBoundsException**
- **Explanation:** Accessing an index beyond array bounds throws `ArrayIndexOutOfBoundsException` at runtime.

**25. Answer: b) 10**
- **Explanation:** Arrays are reference types. Both `a` and `b` point to the same array object. Modifying through `b[1] = 10` affects the original array, so `a[1]` returns 10.
