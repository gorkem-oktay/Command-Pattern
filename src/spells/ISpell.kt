package spells

abstract class ISpell {

    var name: String = "Unknown Spell"
    var mana: Int = 0
    var level: Int = 0
    var castTime: Double = 0.0

    fun cast() {
        println("Casted $name!!!")
    }
}