import characters.Dummy
import characters.Goblin
import characters.Knight
import equipments.EquipmentSlot
import equipments.runes.DamageRune
import observables.Health
import observers.HealthBar
import settings.Preferences

fun main(args : Array<String>) {

    print("Username: ")
    val name = readLine()!!

    Preferences.set("name", name)

    val ourKnight = Knight()
    ourKnight.name = Preferences.get("name") as String
    ourKnight.equip(EquipmentSlot.RIGHT_HAND, "Dagger")

    println("${Preferences.get("name")}, travels across countries to live an adventures life...")

    val evilGoblin = Goblin()
    evilGoblin.equip(EquipmentSlot.TWO_HAND, "Club")

    println("Then suddenly a ${evilGoblin.type} appears.")
    println("And attacks ${Preferences.get("name")}")

    evilGoblin.hit(ourKnight)

    println("${Preferences.get("name")} tries to fight back")

    ourKnight.hit(evilGoblin)

    println("But he couldn't inflict much damage")
    println("then he saw a sword on the ground and grabs it")

    ourKnight.unequip(EquipmentSlot.RIGHT_HAND)
    ourKnight.equip(EquipmentSlot.RIGHT_HAND, "Sword")

    println("And fearlessly attacks ${evilGoblin.type}")

    ourKnight.hit(evilGoblin)

    println("")
    println("After defeating ${evilGoblin.type}")
    println("${Preferences.get("name")} stops at the blacksmith to upgrade his sword")
    println("Then buys three damage rune and goes to training ground to test them")
    println("")

    val dummy = Dummy()
    // Decorator usage
    ourKnight.updateEquipment(DamageRune(ourKnight.getWeapon()!!))
    ourKnight.hit(dummy)
    ourKnight.updateEquipment(DamageRune(ourKnight.getWeapon()!!))
    ourKnight.hit(dummy)
    ourKnight.updateEquipment(DamageRune(ourKnight.getWeapon()!!))
    ourKnight.hit(dummy)

    println("")
    println("After testing his new sword returns to the blacksmith to get his helmet back from repair")
    println("It was finished and he immediately tries it to see how it was done")

    ourKnight.equip(EquipmentSlot.HEAD, "Helmet")
}