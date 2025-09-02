 

### **Problem 1 : Printing Utility**

**Problem Statement:**  
 Create a Printer class that demonstrates **method overloading** by printing different types of data.

**Class: Printer**

* **Methods (Overloaded):**  
  * print(String message) → Prints a message  
  * print(int number) → Prints an integer value  
  * print(double value) → Prints a decimal value  
  * print(String\[\] items) → Prints all elements of a string array  
  * print(Object obj) → Prints object information using toString()

Same method name `print`, but it works differently depending on the argument type and number of parameters.

 

 

### **Problem 2: Shape Area Calculator**

**Class: `ShapeCalculator`**

·        **Methods (Overloaded):**

o   `area(int side)` → Returns the area of a square.

o   `area(int length, int breadth)` → Returns the area of a rectangle.

o   `area(double radius)` → Returns the area of a circle.

o   `area(double base, double height, boolean isTriangle)` → Returns the area of a triangle (if `isTriangle` is true).

👉 **Logic:** Same method `area()` but different parameter lists depending on the shape.

 

### **Problem 3: Mobile Contact Manager**

 

### **Class: `Mobile`**

·        **Overloaded Methods:**

1\.     `addContact(String name, String phoneNumber)` → Adds a contact with name & phone.

2\.     `addContact(String name, String phoneNumber, String email)` → Adds a contact with name, phone & email.

3\.     `addContact(String name, String phoneNumber, String email, String address)` → Adds a contact with full details.

4\.     `addContact(String[] names, String[] numbers)` → Adds multiple contacts in bulk.

👉 **Logic:** Even without properties, each `addContact()` method can just print out the details passed to it (or simulate "saving").

 

