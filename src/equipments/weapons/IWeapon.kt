package equipments.weapons

import equipments.IEquipment
import equipments.weapons.behaviours.IWeaponBehaviour
import equipments.weapons.behaviours.NormalHitBehaviour

abstract class IWeapon : IEquipment() {

    open var damage: Int = 0
    open var behaviour: IWeaponBehaviour = NormalHitBehaviour()

    fun calculateDamage() : Int {
        return behaviour.calculateDamage(damage)
    }
}