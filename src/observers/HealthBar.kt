package observers

import observables.Health
import observables.IObservable

class HealthBar(private var name: String) : IObserver {

    override fun updated(observable: IObservable, value: Any) {
        if (observable is Health) {
            println("$name received $value damage and ${observable.getValue()} health left")
        }
    }
}