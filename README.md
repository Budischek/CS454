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
javac Class0.java
javac Class1.java
javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar TestSuite.java
java  -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore TestSuite
```
