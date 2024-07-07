package org.example

fun main() {
    println("Hello World!")
    var testupdate = shippingUpdate("old", "new", 100)
    var updateHistory = mutableListOf<shippingUpdate>()
    updateHistory.add(testupdate)
    var testshipment = Shipment("firststatus","s10000", "firstnotes", updateHistory, 100,"location")
//    testshipment.shippingUpdates.add
}