package equipments.weapons

import equipments.EquipmentSlot
import equipments.weapons.behaviours.CriticalStrikeBehaviour

class Sword : IWeapon() {

    init {
        name = "Sword"
        slot = EquipmentSlot.RIGHT_HAND
        damage = 10
        behaviour = CriticalStrikeBehaviour()
    }
}