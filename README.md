# Candidate-recruitment

### Overview

This program simulates contact tracing by initiating contacts with people based on predefined relationships. It tracks whether each person has been contacted and ensures that certain contacts are checked only once.

### Files

* `Main.java`: Contains the main code for contact tracing.
* `MainTest.java`: Contains JUnit test cases to test the functionality of the contact tracing program.

### Running the Program

To run the contact tracing program:

* Compile `Main.java`.
* Run the compiled program and provide input as instructed (for example 'A').

### Running the Test Cases

To run the test cases:

* Compile `Main.java` and `MainTest.java`.
* Ensure that JUnit library isin your classpath.
* Run `MainTest.java` as a JUnit test.
* View the test results to ensure that the program functions correctly.

### Approach

The program uses a combination of methods to initiate contacts and track whether each person has been contacted. Here's an overview of the approach:

- The `contact` method initiates contact with a person by marking them as contacted and initiating contacts with predefined friends based on the person's relationships.
- The `contactedFriends` method initiates contacts with predefined friends based on the contacted person.
- The program utilizes boolean arrays to track whether each person has been contacted.
- Test cases are provided using JUnit to ensure the correctness of the contact tracing logic.

### Example

Suppose the starting candidate is'A':

- The program will initiate contact with'A'.
- 'A' will then initiate contacts with 'B', 'C', and 'J' (predefined friends).
- The program will continue initiating contacts based on the predefined relationships until all possible contacts have been made.
