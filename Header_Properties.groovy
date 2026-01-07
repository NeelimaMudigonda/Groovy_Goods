/*
 Day 05 – Headers & Properties using SAP CPI Message API
 Author: Neelima
 Purpose:
  - Work with Headers and Properties in SAP CPI
  - Control routing, validation, and error handling
  - Interview-ready CPI Groovy script
*/

import com.sap.gateway.ip.core.customdev.util.Message

Message processData(Message message) {
    // Task 1: Read Message Body
    def body = message.getBody(String)
    println "Incoming Payload: ${body}"
    // Task 2: Set Headers
    message.setHeader("InterfaceName", "Order_Create")
    message.setHeader("ProcessStatus", "SUCCESS")
    // Task 3: Set Properties
    message.setProperty("RetryCount", 2)
    message.setProperty("Priority", "HIGH")
    // Task 4: Read Headers
    def headers = message.getHeaders()
    println "Interface Name : ${headers.InterfaceName}"
    println "Process Status : ${headers.ProcessStatus}"
    // Task 5: Read Properties
    def properties = message.getProperties()
    def retryCount = properties.RetryCount as Integer
    def priority   = properties.Priority
    println "Retry Count : ${retryCount}"
    println "Priority    : ${priority}"
    // Task 6: Routing / Validation Logic
    if (retryCount >= 3) {
        throw new Exception("Retry limit exceeded – Stop message processing")
    }

    if (headers.ProcessStatus == "FAILED") {
        throw new Exception("Process failed – Trigger exception subprocess")
    }
    // Task 7: Modify Payload
    def modifiedBody = body + " | Processed with Priority: ${priority}"
    message.setBody(modifiedBody)
    // SAP CPI Usage Notes
    /*
     - Headers are used for routing and adapter-level decisions
     - Properties are used to control flow across the iFlow
     - RetryCount is commonly used in error handling scenarios
     - Exceptions trigger Exception Subprocess in CPI
    */

    return message
}
