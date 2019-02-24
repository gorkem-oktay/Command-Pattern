package equipments.runes

import equipments.EquipmentSlot
import equipments.weapons.IWeapon
import equipments.weapons.behaviours.IWeaponBehaviour
import equipments.weapons.behaviours.NormalHitBehaviour

abstract class WeaponRuneDecorator(var weapon: IWeapon) : IWeapon() {

    override var name: String = "Unknown Weapon"
        get() = weapon.name

    override var slot: EquipmentSlot = EquipmentSlot.UNKNOWN
        get() = weapon.slot

    override var behaviour: IWeaponBehaviour = NormalHitBehaviour()
        get() = weapon.behaviour
}