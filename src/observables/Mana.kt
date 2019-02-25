package observables

class Mana(private var value: Int): IObservable() {

    fun decrease(value: Int) {
        this.value -= value
        notifyAll(value)
    }

    fun getValue(): Int {
        return value
    }
}