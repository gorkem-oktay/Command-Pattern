package characters

import observables.Health
import observables.Mana
import observers.HealthBar
import observers.ManaBar

class Knight : ICharacter() {

    init {
        type = "Knight"
        health = Health(100)
        health.addObserver(HealthBar(type))
        mana = Mana(100)
        mana!!.addObserver(ManaBar())
    }
}