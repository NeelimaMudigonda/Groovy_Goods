/**
 * Groovy Basics Reference
 *
 * This file contains all fundamental Groovy programming concepts, explained with examples.
 * Perfect for beginners or as a GitHub 100-days challenge reference.
 *
 * Topics Covered:
 * 1. Variables & Data Types
 * 2. Print Statements
 * 3. Operators
 * 4. if-else Conditions
 * 5. Loops (for, while, each)
 * 6. Lists & Maps
 * 7. Ranges
 * 8. Methods & Functions
 * 9. Closures
 * 10. Classes & Objects
 * 11. GroovyDoc
 * 12. File Handling
 * 13. Exception Handling
 */
class GroovyBasics {

    /** 
     * 1. VARIABLES & DATA TYPES
     * Dynamic typing with 'def' or explicit typing
     */
    def name = "Alex"
    def age = 18
    String city = "Delhi"
    int year = 2026
    boolean isActive = true
    double salary = 50000.50

    /**
     * 2. PRINT STATEMENTS
     * println prints with newline, print prints inline
     */
    def printExamples() {
        println "Hello Groovy"              // prints with newline
        print "Hello "                      // prints inline
        print "World"
        println "Name is $name"             // string interpolation
        println "Next year: ${age + 1}"
    }

    /**
     * 3. OPERATORS
     * Arithmetic: +, -, *, /, %, **
     * Comparison: ==, !=, >, <, >=, <=
     * Logical: &&, ||, !
     */
    def operatorExamples() {
        def a = 10
        def b = 3
        println a + b
        println a ** b
        println a > b && b > 0
    }

    /**
     * 4. IF-ELSE CONDITIONS
     */
    def ifElseExamples(int score) {
        if (score >= 90) {
            println "Grade A"
        } else if (score >= 75) {
            println "Grade B"
        } else {
            println "Grade C"
        }

        // ternary operator
        def result = (score >= 50) ? "Pass" : "Fail"
        println result
    }

    /**
     * 5. LOOPS
     */
    def loopsExamples() {
        // for loop
        for (i in 1..5) {
            println i
        }

        // while loop
        def j = 1
        while (j <= 3) {
            println j
            j++
        }

        // each loop
        [10, 20, 30].each { println it }
    }

    /**
     * 6. LISTS
     */
    def listExamples() {
        def nums = [1, 2, 3, 4]
        nums << 5                  // add element
        println nums[0]            // access element
        println nums.size()
        println nums.sum()
    }

    /**
     * 7. MAPS
     */
    def mapExamples() {
        def user = [name: "Sam", age: 25]
        println user.name
        println user['age']

        user.each { k, v -> println "$k : $v" }
    }

    /**
     * 8. RANGES
     */
    def rangeExamples() {
        def r = 1..5
        println r.contains(3)

        5.downto(1) { println it }
    }

    /**
     * 9. METHODS & FUNCTIONS
     */
    /**
     * Adds two numbers
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    def add(int a, int b) {
        return a + b
    }

    /**
     * 10. CLOSURES
     */
    def closureExamples() {
        def add = { a, b -> a + b }
        println add(3, 4)

        [1, 2, 3].each { println it }   // it is default parameter
    }

    /**
     * 11. CLASSES & OBJECTS
     */
    /**
     * Student class example
     */
    class Student {
        String name
        int marks

        /**
         * Checks if student passed
         * @return true if marks >= 40
         */
        boolean isPassed() {
            return marks >= 40
        }
    }
    /**
     * 12. FILE HANDLING
     */
    def fileExample() {
        def file = new File("test.txt")
        file.text = "Hello File"
        println file.text
    }

    /**
     * 13. EXCEPTION HANDLING
     */
    def exceptionExample() {
        try {
            def x = 10 / 0
        } catch (Exception e) {
            println "Error occurred: ${e.message}"
        } finally {
            println "This always executes"
        }
    }
}
