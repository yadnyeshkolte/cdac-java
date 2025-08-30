# Shopping Cart Management System in Java

## Overview
This project implements a comprehensive Shopping Cart Management System using Java's object-oriented programming concepts including classes, objects, constructors, arrays of objects, and static variables.

## System Architecture

### Product Class
The `Product` class represents individual products with the following features:
- **Attributes**: `productId`, `productName`, `price`, and `quantity`
- **Constructor**: Initializes product details
- **Static Variable**: `productCount` to track total number of products added

### CartManager Class
The `CartManager` class manages the shopping cart with:
- **Array of Product Objects**: Maximum capacity of 10 products
- **Core Methods**: Add, view, update, delete products and calculate total bill


Design and implement a Shopping Cart Management System in Java using classes and objects, constructors, array of objects, and static variables.

Create a class Product with attributes: productId, productName, price, and quantity.

Use a constructor to initialize product details.

Maintain a static variable productCount in the Product class to keep track of the total number of products added.

Create a class CartManager that maintains an array of Product objects (maximum 10 products).

Implement the following methods in CartManager:

addProduct() → to add a new product to the cart.

viewCart() → to display all products in the cart.

updateProduct() → to modify the quantity or price of a product using productId.

deleteProduct() → to remove a product from the cart.

getTotalBill() → to calculate the total bill for all products.

In the main method, provide a menu-driven program that allows the user to perform the above operations until they choose to exit.
