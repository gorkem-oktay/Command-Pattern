package equipments

import equipments.armors.ArmorFactory
import equipments.weapons.WeaponFactory

abstract class IEquipmentFactory {

    abstract fun getEquipment(name: String): IEquipment?

    companion object {

        fun getFactory(slot: EquipmentSlot): IEquipmentFactory {
            return if (slot == EquipmentSlot.RIGHT_HAND || slot == EquipmentSlot.LEFT_HAND || slot == EquipmentSlot.TWO_HAND) {
                WeaponFactory()
            } else {
                ArmorFactory()
            }
        }
    }
}