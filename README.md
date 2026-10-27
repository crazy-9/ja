# Java Web Technology Lab — Experiments 5–9

This repository contains the source code for Experiments 5 to 9 from the Java Web Technology lab journal.

## Experiments

| Experiment | Topic | Main file |
|---|---|---|
| 5 | Display `AllTheBest` in five colors using Java AWT | `AllTheBest.java` |
| 6 | Display previous and next number using Java Swing | `NumberFrame.java` |
| 7 | Connect Java to MySQL using JDBC | `DBConnect.java` |
| 8 | Count website visits using JSP application scope | `visitcount.jsp` |
| 9 | Display current date and time using JSP | `datetime.jsp` |

## Requirements

- Java JDK for Experiments 5–7
- MySQL Server and MySQL Connector/J for Experiment 7
- Apache Tomcat with JSP support for Experiments 8–9

## Run Experiment 5 — AWT

```bash
cd Experiment-5-AWT
javac AllTheBest.java
java AllTheBest
```

A graphical desktop environment is required.

## Run Experiment 6 — Swing

```bash
cd Experiment-6-Swing
javac NumberFrame.java
java NumberFrame
```

## Run Experiment 7 — JDBC and MySQL

1. Start MySQL.
2. Run the SQL statements in `Experiment-7-JDBC/setup.sql`.
3. Edit the database username and password in `DBConnect.java` to match your local MySQL account.
4. Put the MySQL Connector/J JAR in the same folder, or update the classpath command below.

Windows:

```bash
cd Experiment-7-JDBC
javac -cp ".;mysql-connector-j.jar" DBConnect.java
java -cp ".;mysql-connector-j.jar" DBConnect
```

Linux/macOS:

```bash
cd Experiment-7-JDBC
javac -cp ".:mysql-connector-j.jar" DBConnect.java
java -cp ".:mysql-connector-j.jar" DBConnect
```

Replace `mysql-connector-j.jar` with the actual JAR filename if it differs. Do not commit database passwords or other secrets to a public repository.

## Run Experiments 8 and 9 — JSP

1. Start Apache Tomcat.
2. Copy `visitcount.jsp` and `datetime.jsp` into Tomcat's `webapps/ROOT/` directory.
3. Open these URLs in a browser:

- `http://localhost:8080/visitcount.jsp`
- `http://localhost:8080/datetime.jsp`

Refreshing the visit-counter page increments the in-memory application counter. The counter may reset when the application restarts.

## Notes

- The JSP examples use scriptlets for simplicity because they are intended for a basic lab exercise.
- Database credentials and server configuration may need to be changed for your environment.
