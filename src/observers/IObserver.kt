package observers

import observables.IObservable

interface IObserver {

    fun updated(observable: IObservable, value: Any)
}