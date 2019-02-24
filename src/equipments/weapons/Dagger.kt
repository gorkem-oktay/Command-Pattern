package equipments.weapons

import equipments.EquipmentSlot
import equipments.weapons.behaviours.DoubleStrikeBehaviour

class Dagger : IWeapon() {

    init {
        name = "Dagger"
        slot = EquipmentSlot.RIGHT_HAND
        damage = 4
        behaviour = DoubleStrikeBehaviour()
    }
}