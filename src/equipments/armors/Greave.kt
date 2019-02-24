package equipments.armors

import equipments.EquipmentSlot

class Greave : IArmor() {

    init {
        name = "Greave"
        slot = EquipmentSlot.FOOT
        protection = 1
    }
}