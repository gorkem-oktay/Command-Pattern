package observables

import observers.IObserver

abstract class IObservable {

    private var observers = ArrayList<IObserver>()

    fun addObserver(observer: IObserver) {
        observers.add(observer)
    }

    fun notifyAll(value: Any) {
        observers.forEach { observer: IObserver -> observer.updated(this, value) }
    }
}