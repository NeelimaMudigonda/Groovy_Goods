/*
 Day 05 – Headers & Properties using CPI Message API (Simulation)
 Author: Neelima
 Purpose:
  - Understand Headers & Properties in SAP CPI
  - Learn how values control message flow
  - Prepare for real interview scenarios
*/

// -------------------------------------------------
// Simulating CPI Message Object
// -------------------------------------------------
class Message {
    Map headers = [:]
    Map properties = [:]
    Object body

    Object getBody(Class type) {
        return body
    }

    void setBody(Object body) {
        this.body = body
    }

    Map getHeaders() {
        return headers
    }

    Map getProperties() {
        return properties
    }

    void setHeader(String key, Object value) {
        headers[key] = value
    }

    void setProperty(String key, Object value) {
        properties[key] = value
    }
}

// -------------------------------------------------
// Main Logic (Simulating CPI Groovy Script)
// -------------------------------------------------
def message = new Message()

// Set Payload
message.setBody("Order processing started")

// --------------------
// Task 1: Set Headers
// --------------------
message.setHeader("InterfaceName", "Order_Create")
message.setHeader("Authorization", "Bearer token123")

// -----------------------
// Task 2: Set Properties
// -----------------------
message.setProperty("RetryCount", 2)
message.setProperty("Priority", "HIGH")

// -----------------------
// Task 3: Read Headers
// -----------------------
println "--- Headers ---"
message.getHeaders().each { k, v ->
    println "${k} : ${v}"
}

// --------------------------
// Task 4: Read Properties
// --------------------------
println "\n--- Properties ---"
message.getProperties().each { k, v ->
    println "${k} : ${v}"
}

// -------------------------------
// Task 5: Routing / Validation
// -------------------------------
println "\n--- Routing Decision ---"

if (message.getProperty("RetryCount") >= 3) {
    println "Retry limit exceeded – Trigger alert"
} else {
    println "Proceed with message processing"
}

// -------------------------------
// Task 6: Authorization Check
// -------------------------------
if (!message.getHeaders().containsKey("Authorization")) {
    println "Unauthorized Request"
} else {
    println "Authorization header present"
}

// -------------------------------------------------
// SAP CPI Usage Explanation
// -------------------------------------------------
/*
 SAP CPI Usage:
 - Headers are used for adapter-level and routing decisions
 - Properties persist across iFlow steps
 - RetryCount property helps in error handling scenarios
 - Authorization header validated before calling receiver
*/
