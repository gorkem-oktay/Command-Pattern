package spells

abstract class ISpell(var name: String, var mana: Int, var level:Int, var castTime: Double) {

    fun cast() {
        println("Casted $name!!!")
    }
}