import characters.Dummy
import characters.Goblin
import characters.Knight
import commands.AttackCommand
import commands.CastSpellCommand
import commands.MoveCommand
import equipments.EquipmentSlot
import equipments.runes.DamageRune
import settings.Preferences
import spells.Fireball
import spells.Frostbolt
import ui.AbilityPanel

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

    evilGoblin.target = ourKnight
    evilGoblin.hit()

    println("${Preferences.get("name")} tries to fight back")

    ourKnight.target = evilGoblin
    ourKnight.hit()

    println("But he couldn't inflict much damage")
    println("then he saw a sword on the ground and grabs it")

    ourKnight.unequip(EquipmentSlot.RIGHT_HAND)
    ourKnight.equip(EquipmentSlot.RIGHT_HAND, "Sword")

    println("And fearlessly attacks ${evilGoblin.type}")

    ourKnight.hit()

    println()
    println("After defeating ${evilGoblin.type}")
    println("${Preferences.get("name")} stops at the blacksmith to upgrade his sword")
    println("Then buys three damage rune and goes to training ground to test them")
    println()

    val dummy = Dummy()
    // Decorator usage
    with(ourKnight){
        target = dummy
        updateEquipment(DamageRune(ourKnight.getWeapon()!!))
        hit()
        updateEquipment(DamageRune(ourKnight.getWeapon()!!))
        hit()
        updateEquipment(DamageRune(ourKnight.getWeapon()!!))
        hit()
    }

    println()
    println("After testing his new sword returns to the blacksmith to get his helmet back from repair")
    println("It was finished and he immediately tries it to see how it was done")
    println()

    ourKnight.equip(EquipmentSlot.HEAD, "Helmet")
    ourKnight.equip(EquipmentSlot.CHEST, "Cuirass")

    println()

    val abilityPanel = AbilityPanel()
    with(abilityPanel){
        setCommand(0, MoveCommand(ourKnight))
        setCommand(1, AttackCommand(ourKnight))
        setCommand(2, CastSpellCommand(ourKnight, Fireball()))

        onButtonClicked(0)
        onButtonClicked(1)
        onButtonClicked(2)

        setCommand(0, AttackCommand(ourKnight))
        setCommand(1, MoveCommand(ourKnight))
        setCommand(2, CastSpellCommand(ourKnight, Frostbolt()))

        println()
        onButtonClicked(0)
        onButtonClicked(1)
        onButtonClicked(2)
    }
}