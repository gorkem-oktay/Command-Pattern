package commands

import characters.ICharacter

class AttackCommand(var character: ICharacter) : ICommand {

    override fun execute() {
        character.hit()
    }
}