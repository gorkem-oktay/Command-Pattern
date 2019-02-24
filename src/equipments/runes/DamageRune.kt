package equipments.runes

import equipments.weapons.IWeapon

class DamageRune(weapon: IWeapon): WeaponRuneDecorator(weapon) {

    init {
        println("Added Damage Rune to $name")
    }

    override var damage: Int = 0
        get() = weapon.damage + 2
}