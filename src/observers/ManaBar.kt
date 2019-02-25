package observers

import observables.IObservable
import observables.Mana

class ManaBar : IObserver() {

    override fun updated(observable: IObservable, value: Any) {
        if (observable is Mana) {
            println("${observable.getValue()} mana left")
        }
    }
}