/**
 * GroovyDoc: Map Utilities and Header-Based Routing
 *
 * This class demonstrates:
 *  1. Map creation techniques
 *  2. Iterating over maps
 *  3. Header-based routing logic
 *
 * Author: Supraja
 * Date: 2026-01-04
 */
class MapUtils {

    /**
     * Demonstrates different ways to create maps in Groovy.
     */
    static void mapCreation() {
        // Literal syntax
        def map1 = [name: "Supraja", exam: "SSC", score: 95]

        // Constructor
        def map2 = new HashMap()
        map2.put("subject", "Maths")
        map2.put("marks", 88)

        // Shorthand empty map
        def map3 = [:]
        map3["topic"] = "Static GK"
        map3["level"] = "Advanced"

        println "Map1: $map1"
        println "Map2: $map2"
        println "Map3: $map3"
    }

    /**
     * Iterates over a map using different approaches.
     */
    static void mapIteration() {
        def student = [name: "Neelima", subject: "Averages", score: 92]

        println "Iterating with each:"
        student.each { key, value ->
            println "$key -> $value"
        }

        println "Keys only:"
        student.keySet().each { key ->
            println "Key: $key"
        }

        println "Values only:"
        student.values().each { value ->
            println "Value: $value"
        }

        println "Transform keys with collect:"
        def upperKeys = student.collect { key, value -> key.toUpperCase() }
        println "Uppercase Keys: $upperKeys"
    }

    /**
     * Routes a message based on header values.
     *
     * @param message A map containing headers and body
     */
    static void headerRouting(def message) {
        switch (message.headers.route) {
            case "math":
                println "Routing to Math Processor: ${message.body}"
                break
            case "gk":
                println "Routing to GK Processor: ${message.body}"
                break
            default:
                println "Routing to Default Processor: ${message.body}"
        }
    }

    /**
     * Entry point to demonstrate all features.
     */
    static void main(String[] args) {
        println "=== Map Creation ==="
        mapCreation()

        println "\n=== Map Iteration ==="
        mapIteration()

        println "\n=== Header-Based Routing ==="
        def message1 = [headers: [route: "math"], body: "Solve average problems"]
        def message2 = [headers: [route: "gk"], body: "Answer GK questions"]
        def message3 = [headers: [route: "other"], body: "Fallback logic"]

        headerRouting(message1)
        headerRouting(message2)
        headerRouting(message3)
    }
}
