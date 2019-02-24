package observables

class Health(private var value: Int) : IObservable() {

    fun decrease(value: Int) {
        this.value -= value
        notifyAll(value)
    }

    fun getValue(): Int {
        return value
    }
}