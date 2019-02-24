package equipments.weapons

import equipments.IEquipment
import equipments.IEquipmentFactory

class WeaponFactory : IEquipmentFactory() {

    override fun getEquipment(name: String): IEquipment? {
        return when (name) {
            "Sword" -> Sword()
            "Dagger" -> Dagger()
            "Club" -> Club()
            else -> null
        }
    }
}