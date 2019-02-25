package commands

import characters.ICharacter

class MoveCommand(var character: ICharacter) : ICommand {

    override fun execute() {
        character.move()
    }
}