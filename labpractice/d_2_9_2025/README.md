### Assignment 1: Library and Book Management

Class Book

Properties: bookId, title, author, price

Methods: displayBookDetails()

Class Library (HAS-A Book)

Properties: libraryName, address, List<Book> books

Methods:

addBook(Book b) → Adds a new book to the library

removeBook(int bookId) → Removes book by ID

showAllBooks() → Displays all book details using Book.displayBookDetails()


### Assignment 2: Car and Engine System

Class Engine

Properties: engineNumber, horsePower, fuelType

Methods: startEngine(), stopEngine()

Class Car (HAS-A Engine)

Properties: carModel, brand, price, Engine engine

Methods:

startCar() → Calls engine.startEngine() and prints "Car started"

stopCar() → Calls engine.stopEngine() and prints "Car stopped"

displayCarDetails() → Shows car details along with engine details



