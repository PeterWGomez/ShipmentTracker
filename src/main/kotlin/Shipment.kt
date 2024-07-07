package org.example

data class Shipment(
    var status: String,
    var id: String,
    var notes: String,
    var updateHistory: MutableList<shippingUpdate> = mutableListOf<shippingUpdate>(),
    var expectedDeliveryDateTimestamp: Long,
    var currentLocation: String
) {
    private var _shippingUpdates = mutableListOf<shippingUpdate>()

    val shippingUpdates: List<shippingUpdate>
        get() {
            return _shippingUpdates.toList()
        }
}