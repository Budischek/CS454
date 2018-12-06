#! /bin/bash

rm *.class

javac code/Class0.java
javac code/Class1.java
javac -cp code:libs/junit-4.12.jar:libs/hamcrest-core-1.3.jar code/TestSuite.java
java  -cp code:libs/junit-4.12.jar:libs/hamcrest-core-1.3.jar org.junit.runner.JUnitCore TestSuite
