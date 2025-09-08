package assignment6.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

class LibraryBooks {
	static ArrayList<Book> initializeBooks() {
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book(101,"Linux Kernel","Linux",7000)); 
		books.add(new Book(102,"Clean Code: A Handbook of Agile Software Craftsmanship","Robert C. Martin",3500));
		books.add(new Book(103,"The Pragmatic Programmer: Your Journey to Mastery","David Thomas & Andrew Hunt",4200));
		books.add(new Book(104,"Introduction to Algorithms","Thomas H. Cormen",8500));
		books.add(new Book(105,"Design Patterns: Elements of Reusable Object-Oriented Software","Erich Gamma",5500));
		books.add(new Book(106,"Structure and Interpretation of Computer Programs (SICP)","Harold Abelson",6800));
		books.add(new Book(107,"Head First Java","Kathy Sierra & Bert Bates",3800));
		books.add(new Book(108,"Effective Java","Joshua Bloch",4500));
		books.add(new Book(109,"Python Crash Course","Eric Matthes",3200));
		books.add(new Book(110,"Fluent Python: Clear, Concise, and Effective Programming","Luciano Ramalho",5800));
		books.add(new Book(111,"The C++ Programming Language","Bjarne Stroustrup",7500));
		books.add(new Book(112,"JavaScript: The Good Parts","Douglas Crockford",2900));
		books.add(new Book(113,"Eloquent JavaScript","Marijn Haverbeke",3300));
		books.add(new Book(114,"Cracking the Coding Interview","Gayle Laakmann McDowell",4000));
		books.add(new Book(115,"Refactoring: Improving the Design of Existing Code","Martin Fowler",5200));
		books.add(new Book(116,"The Mythical Man-Month","Frederick P. Brooks Jr.",2500));
		books.add(new Book(117,"Code Complete: A Practical Handbook of Software Construction","Steve McConnell",6200));
		books.add(new Book(118,"The Phoenix Project: A Novel About IT, DevOps, and Helping Your Business Win","Gene Kim",2800));
		books.add(new Book(119,"Continuous Delivery: Reliable Software Releases through Build, Test, and Deployment Automation","Jez Humble",5300));
		books.add(new Book(120,"Designing Data-Intensive Applications","Martin Kleppmann",6500));
		books.add(new Book(121,"Site Reliability Engineering: How Google Runs Production Systems","Betsy Beyer",5900));
		books.add(new Book(122,"The DevOps Handbook","Gene Kim",4800));
		books.add(new Book(123,"Docker Deep Dive","Nigel Poulton",3700));
		books.add(new Book(124,"Kubernetes: Up and Running","Kelsey Hightower",4600));
		books.add(new Book(125,"Infrastructure as Code: Managing Servers in the Cloud","Kief Morris",5100));
		books.add(new Book(126,"Grokking Algorithms: An Illustrated Guide","Aditya Y. Bhargava",3900));
		books.add(new Book(127,"You Don't Know JS Yet: Get Started","Kyle Simpson",2600));
		books.add(new Book(128,"Learning Go: An Idiomatic Approach to Real-World Go Programming","Jon Bodner",4300));
		books.add(new Book(129,"Programming Rust","Jim Blandy",6100));
		books.add(new Book(130,"Head First Design Patterns","Eric Freeman",4100));
		books.add(new Book(131,"Domain-Driven Design: Tackling Complexity in the Heart of Software","Eric Evans",6900));
		books.add(new Book(132,"Spring in Action","Craig Walls",4900));
		books.add(new Book(133,"Node.js Design Patterns","Mario Casciaro",4400));
		books.add(new Book(134,"The Go Programming Language","Alan A. A. Donovan",5700));
		books.add(new Book(135,"Learning Python, 5th Edition","Mark Lutz",6300));
		books.add(new Book(136,"C# in Depth","Jon Skeet",5400));
		books.add(new Book(137,"The Art of Computer Programming, Volumes 1-4A","Donald E. Knuth",25000));
		books.add(new Book(138,"Working Effectively with Legacy Code","Michael Feathers",4700));
		books.add(new Book(139,"Peopleware: Productive Projects and Teams","Tom DeMarco",3100));
		books.add(new Book(140,"Accelerate: The Science of Lean Software and DevOps","Nicole Forsgren",3400));
		books.add(new Book(141,"Clean Architecture: A Craftsman's Guide to Software Structure and Design","Robert C. Martin",5000));
		books.add(new Book(142,"Terraform: Up & Running","Yevgeniy Brikman",4200));
		books.add(new Book(143,"Ansible: Up and Running","Lorin Hochstein",3900));
		books.add(new Book(144,"Building Microservices: Designing Fine-Grained Systems","Sam Newman",5600));
		books.add(new Book(145,"Monolith to Microservices","Sam Newman",5300));
		books.add(new Book(146,"The Principles of Object-Oriented JavaScript","Nicholas C. Zakas",3000));
		books.add(new Book(147,"Soft Skills: The Software Developer's Life Manual","John Sonmez",2800));
		books.add(new Book(148,"Database Internals: A Deep Dive into How Distributed Data Systems Work","Alex Petrov",7200));
		books.add(new Book(149,"System Design Interview – An Insider's Guide","Alex Xu",4500));
		books.add(new Book(150,"Fundamentals of Software Architecture","Mark Richards",6000));
		books.add(new Book(151,"A Philosophy of Software Design","John Ousterhout",3600));

		return books;
	}
	
	static HashMap<Integer, Book> getBooks(){
		ArrayList<Book> pickedBooks = initializeBooks();
		HashMap<Integer, Book> hash = new HashMap<>();
		for(int i=0;i<pickedBooks.size();i++) {
			hash.put(pickedBooks.get(i).bookId, pickedBooks.get(i));
		}
		return hash;
	}
}
