### *Problem 1: Bank Account System*

* Create a superclass *BankAccount* with instance variables accountNumber and balance.
* Provide a constructor to initialize these values.
* Define a method calculateInterest() that gives a default 2% interest.
* Create two subclasses:

  1. *SavingsAccount* → override calculateInterest() to apply 4% interest.
  2. *FixedDepositAccount* → override calculateInterest() to apply 7% interest.
* Create objects of both subclasses and display interest calculations.

---

### *Problem 2: Employee Salary System*

* Create a superclass *Employee* with instance variables name and basicSalary.
* Provide a constructor to initialize employee details.
* Define a method calculateSalary() to display the basic salary.
* Create two subclasses:

  1. *Manager* → override calculateSalary() to include allowance (20% of basic).
  2. *SoftwareEngineer* → override calculateSalary() to include bonus (15% of basic).
* Create objects of both subclasses and calculate salary using overridden methods.

---

### *Problem 3: Vehicle Speed Calculation*

* Create a superclass *Vehicle* with instance variables brand and maxSpeed.
* Provide a constructor to initialize these values.
* Define a method showTopSpeed() that displays a generic message.
* Create three subclasses:

  1. *Car* → override showTopSpeed() to display car’s max speed.
  2. *Bike* → override showTopSpeed() to display bike’s max speed.
  3. *Truck* → override showTopSpeed() to display truck’s max speed.
* Create objects of all three subclasses and display their speeds.

---

### *Problem 4: Appliance Power Consumption*

* Create a superclass *Appliance* with instance variables name and power (in watts).
* Provide a constructor to initialize these values.
* Define a method showConsumption(int hours) that displays a generic message.
* Create three subclasses:

  1. *Fan* → override showConsumption() to calculate total watt-hours used.
  2. *AirConditioner* → override showConsumption() to calculate watt-hours used.
  3. *Refrigerator* → override showConsumption() to calculate watt-hours used.
* Create objects of each subclass and display consumption for given hours.
