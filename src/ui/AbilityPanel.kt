package ui

import commands.ICommand
import commands.NoCommand

// Invoker for command pattern
class AbilityPanel {

    var buttons: Array<ICommand> = Array(10) { NoCommand() }

    fun setCommand(slot: Int, command: ICommand){
        buttons[slot] = command
    }

    fun onButtonClicked(slot: Int){
        buttons[slot].execute()
    }
}