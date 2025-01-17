package org.example

data class Shipment(
    var status: String,
    var id: String,
    var notes: String,
    var updateHistory: MutableList<shippingUpdate> = mutableListOf<shippingUpdate>(),
    var expectedDeliveryDateTimestamp: Long,
    var currentLocation: String
) {
    private var _updateHistory = mutableListOf<shippingUpdate>()

    val shippingUpdates: List<shippingUpdate>
        get() {
            return _updateHistory.toList()
        }
    fun addNote(note: String) {
        notes = notes + "\n\n" + note
    }
    fun addUpdate(update: String) {
        // How does long work here, update
        var newUpdate = shippingUpdate("reference for last update", update, 100)
        updateHistory.add(newUpdate)
    }

}