package observers

import observables.IObservable

abstract class IObserver {

    abstract fun updated(observable: IObservable, value: Any)
}