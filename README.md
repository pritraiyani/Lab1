# Binary Calculator

## Overview
The Binary Calculator project is a Java-based application designed to perform fundamental operations on binary numbers, including:
- **Addition**
- **Bitwise AND**
- **Bitwise OR**
- **Multiplication**

The project is structured to provide an interactive and user-friendly experience, allowing users to input binary numbers and choose operations to perform. The core logic is implemented in the `Binary` class, while the main entry point is in `App.java`.

## Features
- **Interactive User Interface**: Input binary numbers and select operations from a menu.
- **Dynamic Operation Support**: Supports addition, bitwise AND, OR, and multiplication of binary numbers.
- **Robust Input Handling**: Validates binary inputs and handles edge cases like invalid numbers or zeros.
- **Extensive Testing**: Includes unit tests for all binary operations to ensure correctness and reliability.

## File Structure
```
BinaryCalculator/
├── src/main/java/com/ontariotechu/sofe3980U/
│   ├── App.java          # Main entry point of the application
│   ├── Binary.java       # Core logic for binary operations
├── src/test/java/com/ontariotechu/sofe3980U/
│   ├── AppTest.java      # Unit tests for App class
│   ├── BinaryTest.java   # Unit tests for Binary class
├── pom.xml               # Maven project configuration
```

## Requirements
- **Java Version**: 8 or higher
- **Maven**: For dependency management and running the project

## How to Run the Project
1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd BinaryCalculator
   ```

2. **Compile the Project**:
   ```bash
   mvn clean compile
   ```

3. **Run the Application**:
   ```bash
   mvn exec:java -Dexec.mainClass="com.ontariotechu.sofe3980U.App"
   ```

4. **Run Tests**:
   ```bash
   mvn test
   ```

## Usage
1. The program will prompt you to input two binary numbers.
2. After input, a menu will be displayed with options to:
   - Perform addition
   - Perform bitwise AND
   - Perform bitwise OR
   - Perform multiplication
   - Exit the program
3. Select the operation by entering the corresponding number (1-5).
4. The result will be displayed, and the menu will reappear until you choose to exit.

### Example Interaction
```
Welcome to the Binary Calculator!
Enter the first binary number: 1010
Enter the second binary number: 1101

Choose an operation to perform:
1. ADD
2. AND
3. OR
4. MULTIPLY
5. EXIT
Enter your choice (1-5): 1
Result of ADD: 10111

Choose an operation to perform:
1. ADD
2. AND
3. OR
4. MULTIPLY
5. EXIT
Enter your choice (1-5): 5
Exiting the Binary Calculator. Goodbye!
```

## Testing
The project includes a comprehensive suite of tests in `BinaryTest.java` to validate all binary operations:
- **add() Method**: Tests addition for binary numbers of same or different lengths and with zeros.
- **or() Method**: Tests bitwise OR for same-length, different-length, and zero-involved cases.
- **and() Method**: Tests bitwise AND for similar scenarios.
- **multiply() Method**: Tests multiplication of binary numbers, including edge cases with zero.

To run the tests, use:
```bash
mvn test
```

## License
This project is licensed under the MIT License. See the LICENSE file for details.

## Author
This project was developed as part of a software engineering course by [Pritkumar Vasudevbhai Raiyani].

