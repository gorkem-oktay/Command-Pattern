package commands

import characters.ICharacter
import spells.ISpell

class CastSpellCommand(var character: ICharacter, var spell: ISpell) : ICommand {

    override fun execute() {
        character.cast(spell)
    }
}