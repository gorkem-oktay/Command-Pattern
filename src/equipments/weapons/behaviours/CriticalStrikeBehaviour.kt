package equipments.weapons.behaviours

class CriticalStrikeBehaviour : IWeaponBehaviour {

    override fun calculateDamage(damage: Int): Int {

        val isCriticalStrike = (1..100).shuffled().first()

        if (isCriticalStrike > 70) {
            println("Critical Strike!!!")
            return damage * 3
        }

        return damage
    }
}