# Java MySQL Connection - JDBC Setup

## Step 1: Download MySQL JDBC Driver (Connector/J)

1. Visit the official MySQL website: https://dev.mysql.com/downloads/connector/j/
2. Select "Platform Independent" from the dropdown
3. Download the ZIP or TAR archive
4. Extract the downloaded file
5. Locate the JAR file (e.g., `mysql-connector-j-8.x.x.jar`)

## Add JAR to Project (eclipse)

1. Right-click on your project in Project Explorer
2. Select **Build Path** → **Configure Build Path**
3. Click on the **Libraries** tab
4. Select **Module Path** (if needed select *classpath* and then add external jar)
5. Click **Add External JARs**
6. Navigate to and select the `mysql-connector-j-x.x.x.jar` file
7. Click **Apply and Close**


### For Command Line (without IDE): (**Optional Concept**)
Place the JAR file in your project directory and compile/run with:
```bash
# Compile
javac -cp .:mysql-connector-j-8.x.x.jar YourProgram.java

# Run
java -cp .:mysql-connector-j-8.x.x.jar YourProgram
```
*(On Windows, use `;` instead of `:` as separator)*

---

**Need Help?** Check the official documentation at https://dev.mysql.com/doc/connector-j/en/
