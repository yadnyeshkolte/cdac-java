# Abstract Class & Interface Problem Statements

## Problem 1: Vehicle Rental System

- Create an abstract class `Vehicle` with instance variables `vehicleNumber` and `rentalPrice`.
- Add an abstract method `calculateRent(int days)`.
- Subclasses `Car` and `Bike` should have constructors to initialize instance variables.
- Implement `calculateRent()` differently for `Car` and `Bike` (e.g., Car has higher per-day rent, Bike has lower).
- Write a test class to create objects of `Car` and `Bike` and calculate total rent.

## Problem 2: E-Commerce Order

- Create an abstract class `Order` with instance variables `orderId`, `customerName`, and `amount`.
- Add an abstract method `generateInvoice()`.
- Subclasses `OnlineOrder` and `StoreOrder` should have constructors to initialize order details.
- Implement `generateInvoice()` differently:
  - `OnlineOrder` adds delivery charges.
  - `StoreOrder` adds discount for in-store pickup.
- Write a test class to create different orders and display invoices.

## Problem 3: Online Payment System

- Create an interface `Payment` with methods `processPayment(double amount)` and `refund(double amount)`.
- Implement it in classes `CreditCardPayment` and `UPIPayment`, each with instance variables like `transactionId`, `accountNumber`.
- Provide constructors in each class to initialize these variables.
- Demonstrate making a payment and refund using both payment methods.

## Problem 4: Smart Home Devices

- Create an interface `SmartDevice` with methods `turnOn()`, `turnOff()`, and `getStatus()`.
- Implement this in `Light` and `Fan` classes, each having instance variables like `deviceId` and `status`.
- Add constructors in subclasses to initialize device details.
- Write a test class to create objects of `Light` and `Fan`, then simulate switching them on and off.

## Problem 5: Online Food Delivery System

- Create an interface `FoodDelivery` with methods `placeOrder(String item, int qty)`, `cancelOrder(int orderId)`, and `trackOrder(int orderId)`.
- Implement the interface in `ZomatoDelivery` and `SwiggyDelivery` classes.
- Each class should have instance variables `orderId`, `restaurantName`, and `status`, initialized through constructors.
- Implement methods differently:
  - `ZomatoDelivery` adds packaging charges.
  - `SwiggyDelivery` provides cashback offers.
- Write a test class to simulate placing, canceling, and tracking orders.

## Key Concepts Covered

- **Abstract Classes**: Classes that cannot be instantiated and may contain abstract methods
- **Interfaces**: Contracts that define method signatures to be implemented by classes
- **Inheritance**: Subclasses extending abstract classes or implementing interfaces
- **Polymorphism**: Different implementations of the same method in different classes
- **Constructors**: Initialization of instance variables in subclasses
