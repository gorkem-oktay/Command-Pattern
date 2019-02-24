package characters

import observables.Health
import observers.HealthBar

class Knight : ICharacter() {

    init {
        type = "Knight"
        health = Health(100)
        health.addObserver(HealthBar(type))
    }
}