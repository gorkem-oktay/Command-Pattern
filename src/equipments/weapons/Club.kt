package equipments.weapons

import equipments.EquipmentSlot
import equipments.weapons.behaviours.NormalHitBehaviour

class Club : IWeapon() {

    init {
        name = "Club"
        slot = EquipmentSlot.TWO_HAND
        damage = 8
        behaviour = NormalHitBehaviour()
    }
}