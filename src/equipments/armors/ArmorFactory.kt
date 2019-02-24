package equipments.armors

import equipments.IEquipment
import equipments.IEquipmentFactory

class ArmorFactory : IEquipmentFactory() {

    override fun getEquipment(name: String): IEquipment? {
        return when (name) {
            "Helmet" -> Helmet()
            "Cuirass" -> Cuirass()
            "Pauldron" -> Pauldron()
            "Gauntlet" -> Gauntlet()
            "Greave" -> Greave()
            else -> null
        }
    }
}