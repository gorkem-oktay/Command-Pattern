package equipments

enum class EquipmentSlot {
    RIGHT_HAND,
    LEFT_HAND,
    TWO_HAND,
    HEAD,
    CHEST,
    LEGS,
    HAND,
    FOOT,
    UNKNOWN
}

abstract class IEquipment {

    open var name: String = "Unknown Item"
    open var slot: EquipmentSlot = EquipmentSlot.UNKNOWN
}