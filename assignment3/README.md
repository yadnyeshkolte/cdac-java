# Assignment 3- Simple Inheritance Problem Statements

## 1. Bank Account System
Create a superclass **BankAccount** with attributes accountNumber and balance, and a method deposit(double amount) to add money. Derive a subclass **SavingsAccount** with an exclusive attribute interestRate and an exclusive method calculateInterest() to compute interest. Write a program to create an object of SavingsAccount, use deposit() from the superclass, and calculateInterest() from the subclass.

## 2. Vehicle System
Create a superclass **Vehicle** with attributes brand and fuel, and a method refuel(int liters) that adds fuel to the vehicle. Derive a subclass **Car** with an exclusive attribute mileage (km per liter) and an exclusive method calculateTravelDistance() that calculates how far the car can travel based on available fuel (fuel × mileage). Write a program to create a Car object, call refuel() from the superclass, and calculateTravelDistance() from the subclass.

## 3. Employee Management
Create a superclass **Employee** with attributes name and salary, and a method displayDetails(). Derive a subclass **Manager** with an exclusive attribute teamSize and an exclusive method calculateBonus() that gives a bonus based on team size. Write a program to create a Manager object, call displayDetails() from the superclass, and calculateBonus() from the subclass.

## 4. Student Grading System
Create a superclass **Student** with attributes name and marks, and a method showDetails(). Derive a subclass **GraduateStudent** with an exclusive attribute specialization and an exclusive method checkPass() that checks if marks ≥ 50. Write a program to create a GraduateStudent object, call showDetails() from the superclass, and checkPass() from the subclass.

## 5. Product Billing System
Create a superclass **Product** with attributes productName and price, and a method showProduct(). Derive a subclass **DiscountedProduct** with an exclusive attribute discountRate and an exclusive method calculateFinalPrice() that reduces the price by discount percentage. Write a program to create a DiscountedProduct object, call showProduct() from the superclass, and calculateFinalPrice() from the subclass.
