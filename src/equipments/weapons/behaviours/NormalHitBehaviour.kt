package equipments.weapons.behaviours

class NormalHitBehaviour : IWeaponBehaviour {

    override fun calculateDamage(damage: Int): Int {
        return damage
    }
}