package characters

import observables.Health
import observers.HealthBar

class Goblin : ICharacter() {

    init {
        type = "Goblin"
        health = Health(60)
        health.addObserver(HealthBar(type))
    }
}