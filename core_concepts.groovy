/**
 * ============================================================
 * Day 02 – Groovy Core Concepts (GroovyDoc)
 * ============================================================
 *
 * Topics Covered:
 * 1. Data Types & Type Inference
 * 2. Operators
 * 3. Strings & GString
 * 4. Conditional Statements
 * 5. Loops
 * 6. Collections (List, Set, Map)
 * 7. Methods
 * 8. Closures (Introduction)
 * ============================================================
 */

/**
 * ------------------------------------------------------------
 * 1. DATA TYPES & TYPE INFERENCE
 * ------------------------------------------------------------
 *
 * Groovy supports both static and dynamic typing.
 * The 'def' keyword is used for type inference.
 */

def number = 10              // Integer
def decimal = 10.5           // BigDecimal
def isActive = true          // Boolean
def letter = 'A'             // Character
def message = "Groovy"       // String

println number
println decimal
println isActive
println letter
println message

/**
 * ------------------------------------------------------------
 * 2. OPERATORS
 * ------------------------------------------------------------
 *
 * Arithmetic, Relational, Logical, and Elvis operators
 */

def a = 10
def b = 3

println a + b        // Addition
println a - b        // Subtraction
println a * b        // Multiplication
println a / b        // Division
println a % b        // Modulus

println a > b        // Greater than
println a == b       // Equality
println a != b       // Not equal

println (a > 5 && b < 5)   // Logical AND
println (a < 5 || b < 5)   // Logical OR

def name = null
def result = name ?: "Default Name"
println result

/**
 * ------------------------------------------------------------
 * 3. STRINGS & GSTRING
 * ------------------------------------------------------------
 *
 * Groovy supports single quotes, double quotes,
 * and multi-line strings.
 */

def singleQuote = 'Hello Groovy'
def doubleQuote = "Hello ${message}"
def multiLine = """
This is
a multi-line
Groovy string
"""

println singleQuote
println doubleQuote
println multiLine

/**
 * ------------------------------------------------------------
 * 4. CONDITIONAL STATEMENTS
 * ------------------------------------------------------------
 *
 * if-else and switch statements
 */

def age = 18

if (age >= 18) {
    println "Eligible to vote"
} else {
    println "Not eligible to vote"
}

def day = "MONDAY"

switch (day) {
    case "MONDAY":
        println "Start of the week"
        break
    case "FRIDAY":
        println "End of the week"
        break
    default:
        println "Midweek"
}

/**
 * ------------------------------------------------------------
 * 5. LOOPS
 * ------------------------------------------------------------
 *
 * for, while, and each loop
 */

for (int i = 1; i <= 5; i++) {
    println "For loop: $i"
}

def count = 1
while (count <= 3) {
    println "While loop: $count"
    count++
}

(1..3).each { println "Each loop: $it" }

/**
 * ------------------------------------------------------------
 * 6. COLLECTIONS
 * ------------------------------------------------------------
 *
 * List, Set, and Map
 */

def list = [1, 2, 3, 4]
def set = [1, 2, 2, 3] as Set
def map = [id: 101, name: "Groovy"]

println list
println set
println map
println map.name

/**
 * ------------------------------------------------------------
 * 7. METHODS
 * ------------------------------------------------------------
 *
 * Method definition and calling
 */

def greet(String userName) {
    return "Hello, $userName"
}

println greet("Developer")

/**
 * ------------------------------------------------------------
 * 8. CLOSURES (INTRODUCTION)
 * ------------------------------------------------------------
 *
 * Closures are blocks of code that can be assigned
 * to variables and passed around.
 */

def closureExample = { int x, int y ->
    x + y
}

println closureExample(5, 7)

/**
 * ============================================================
 * End of Day 02 – Groovy Concepts
 * ============================================================
 */
