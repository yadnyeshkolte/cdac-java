# Core Java Lab Exam - Question Paper B2

## Overview
This question paper contains 4 questions covering fundamental Java concepts including OOP, Collections, File Handling, and Database Operations.

---

## Q1 – Object-Oriented Programming (OOPs)
**CODE: CDACB**

### Objective
Design a Java program to manage hospital patients using OOP concepts.

### Requirements

#### Base Class
- **Patient** with attributes:
  - `patientId`
  - `name`
  - `age`
  - `disease`

#### Derived Classes
1. **InPatient** (extends Patient)
   - Additional attributes:
     - `roomNumber`
     - `admissionDate`
     - `dischargeDate`

2. **OutPatient** (extends Patient)
   - Additional attributes:
     - `appointmentDate`
     - `doctorName`

#### Implementation Requirements
- Constructors, getters/setters
- **Static counter** → track total number of patients
- **Overridden `display()` method** in subclasses
- **Interface `Billable`** with method `calculateBill()`
- **Business Logic**: `getSeverityLevel()` → return "Low", "Medium", or "High" depending on the disease type

---

## Q2 – ArrayList Operations
**CODE: CDACH**

### Objective
Write a program to manage patients using `ArrayList<Patient>`.

### Base Class
- **Patient** with attributes:
  - `patientId`
  - `name`
  - `age`
  - `disease`

### Menu-Driven Operations
1. Add Patient (insert Patient object into ArrayList)
2. Search Patient by ID
3. Update Patient details (e.g., disease, doctorName)
4. Delete Patient
5. Display All Patients
6. **Business Logic**: `getCriticalPatients()` → Display patients whose severity level is "High"

---

## Q3 – File Handling
**CODE: CDACD**

### Objective
Write a program to manage patient details stored in a file (`patients.txt`).

### Base Class
- **Patient** with attributes:
  - `patientId`
  - `name`
  - `age`
  - `disease`

### File Format
Each record contains: `patientId, name, age, disease`

### Menu-Driven Operations
1. Add Patient → Append new patient record to file
2. Search Patient by ID → Retrieve patient info from file
3. Update Patient → Modify patient details in the file
4. Delete Patient → Remove record from file
5. Display All Patients
6. **Business Logic**: `calculateAverageAge()` → compute and display average age of all patients in the file

---

## Q4 – Database Operations (JDBC CRUD)
**CODE: CDACP**

### Objective
Write a JDBC program to perform CRUD operations on the Patient table.

### Database Schema
```sql
CREATE TABLE Patient (
    patientId INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    disease VARCHAR(50)
);
```

### Menu Options
1. Add Patient
2. Search Patient by ID
3. Update Patient (age/disease)
4. Delete Patient
5. Display All Patients
6. **Business Logic**: Count the number of patients suffering from a specific disease (SELECT COUNT(*))

---

## Q4 (Alternative) – HashMap with CRUD Operations

### Objective
Write a program to manage patients using `HashMap<Integer, Patient>` (key = patientId).

### Base Class
- **Patient** with attributes:
  - `patientId`
  - `name`
  - `age`
  - `disease`

### Menu Options
1. Add Patient
2. Search Patient by ID
3. Update Patient details (e.g., age, disease)
4. Delete Patient
5. Display All Patients
6. **Business Logic**: `getPatientsByDisease(String disease)` → Display all patients with a given disease

---
