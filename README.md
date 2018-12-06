# CS454
Mock repository to be tested

## Basic usage with JUnit
### Using script:
Execute the script to compile the files and to run the test suite:
```
./run_testSuite
```

### Manually:
Compile the classes to be tested and the test suite. Then run the test suite:
```
javac code/Class0.java
javac code/Class1.java
javac -cp code:libs/junit-4.8.2.jar:libs/hamcrest-core-1.3.jar code/TestSuite.java
javac -cp code:libs/junit-4.8.2.jar code/SingleJUnitTestRunner.java

java -cp code:libs/junit-4.8.2.jar SingleJUnitTestRunner org.junit.runner.JUnitCore TestSuite#testCase15
```
