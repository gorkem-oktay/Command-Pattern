package equipments.armors

import equipments.EquipmentSlot

class Gauntlet : IArmor() {

    init {
        name = "Gauntlet"
        slot = EquipmentSlot.HAND
        protection = 1
    }
}