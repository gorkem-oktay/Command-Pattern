package equipments.armors

import equipments.EquipmentSlot

class Helmet : IArmor() {

    init {
        name = "Helmet"
        slot = EquipmentSlot.HEAD
        protection = 1
    }
}