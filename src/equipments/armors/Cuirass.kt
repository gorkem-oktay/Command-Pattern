package equipments.armors

import equipments.EquipmentSlot

class Cuirass : IArmor() {

    init {
        name = "Cuirass"
        slot = EquipmentSlot.CHEST
        protection = 1
    }
}