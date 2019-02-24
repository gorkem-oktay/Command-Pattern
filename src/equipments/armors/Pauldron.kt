package equipments.armors

import equipments.EquipmentSlot

class Pauldron : IArmor() {

    init {
        name = "Pauldron"
        slot = EquipmentSlot.LEGS
        protection = 1
    }
}