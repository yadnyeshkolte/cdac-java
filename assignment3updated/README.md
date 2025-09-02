Assignmeny 3 - updated problem statements**: on inheritance- hierarchical. 

### 1. **Vehicle Rental System**

* **Superclass:** `Vehicle` with instance variables `vehicleId`, `brand`, and `rentPerDay`, initialized through a constructor.
* **Subclasses:**

  * `Car` with method `calculateRental(int days)` to compute total rent.
  * `Bike` with method `calculateRental(int days)` (separate method, not overriding).
* **Business Logic:** Compute rental cost for different vehicles.

---

### 2. **Educational Institute**

* **Superclass:** `Person` with instance variables `name`, `age`, and `id`, initialized through a constructor.
* **Subclasses:**

  * `Student` with method `calculateGrade(int marks)` that returns grade.
  * `Teacher` with method `calculateSalary(int hoursWorked, int ratePerHour)`.
* **Business Logic:** Manage details of students and teachers in the same hierarchy.

---

### 3. **Banking System**

* **Superclass:** `BankAccount` with instance variables `accountNumber`, `holderName`, and `balance`, initialized via constructor.
* **Subclasses:**

  * `SavingsAccount` with method `addInterest(double rate)` that updates balance.
  * `CurrentAccount` with method `applyServiceCharge(double charge)`.
* **Business Logic:** Handle account transactions without overriding deposit/withdraw methods.

---

### 4. **E-commerce Store**

* **Superclass:** `Product` with instance variables `productId`, `name`, `price`, initialized using a constructor.
* **Subclasses:**

  * `Electronics` with method `applyWarranty(int years)` that adds warranty info.
  * `Clothing` with method `applyDiscount(double percentage)` to compute discounted price.
* **Business Logic:** Manage different product categories with their unique operations.

---

### 5. **Hospital Management**

* **Superclass:** `HospitalMember` with instance variables `memberId`, `name`, `department`, initialized through constructor.
* **Subclasses:**

  * `Doctor` with method `calculateConsultationFee(int patients, double feePerPatient)`.
  * `Nurse` with method `calculateDutyHours(int shifts, int hoursPerShift)`.
* **Business Logic:** Maintain details of hospital staff with unique methods.
