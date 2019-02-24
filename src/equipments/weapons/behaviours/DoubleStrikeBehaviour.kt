package equipments.weapons.behaviours

class DoubleStrikeBehaviour : IWeaponBehaviour {

    override fun calculateDamage(damage: Int): Int {

        val isDoubleStrike = (1..100).shuffled().first()

        if (isDoubleStrike > 30) {
            println("Double Strike!!!")
            return damage * 2
        }

        return damage
    }
}