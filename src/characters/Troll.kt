package characters

import observables.Health
import observables.Mana
import observers.HealthBar

class Troll : ICharacter() {

    init {
        type = "Troll"
        health = Health(140)
        health.addObserver(HealthBar(type))
    }
}