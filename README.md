# Command Pattern

### About
In these repositories, some design patterns are implemented to a mini game system for self education. They may not be suited to use in an actual game (directly anyway). However, it is good to have some examples underhand to take reference. And even if anyone wants to use them, you are welcome.

### Definition
Command pattern, encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.

### Description
It is time to give orders our character to take some actions like move, attack, cast a spell, etc...(Sorry, he won't actually do it). I am thinking to implement it like World of Warcraft's ability panel. There will be ten slot and our user may place abilites wherever he/she wishes. So hardcoding like "Press W to move forward", is out of options. And it is even a bad idea from the beginning to do that. Because our user can't change key binding as it suits himself/herself. Then we need a pattern with some flexibility to achieve this functionality. And here comes to Command Pattern to save the day.

Even though its usefulness, it is a little bit hard to understand and implement. Because it composed of a few components;
  - Firstly, **_Client_**, it creates the commands and make requests, equivalent to our main.
  - Secondly, **_Invoker_**, it holds a command and starts to execution, equivalent to our ability panel.
  - Thirdly, **_Receiver_**, it knows what to do with commands and requests, equivalent to our character.
  - Fourthly, **_Command_**, it is an interface for all the commands.
  - And lastly, **_Concrete Commands_**, it binds actions and receivers, then carries out requests by calling actions on the receiver.

I know, it is a little bit complicated, but don't worry with a few example you can overcome it. So for the first time, I will get my hand dirty and write the actual codes in here to explain it better. Okey, lets get to work.

Firstly, we will create our *Command* interface. It is easy, it will have just one method;

```kotlin
interface ICommand {

    fun execute()
}
```

Now, we can make a *Concrete Command* class that implements our interface;

```kotlin
class AttackCommand(var character: ICharacter) : ICommand {

    override fun execute() {
        character.hit()
    }
}
```

Here, we gave constructor to our character(*Receiver*) as a parameter to make our character(*Receiver*) to hit when command is executed. Then we will prepare ability panel(*Invoker*);

```kotlin
class AbilityPanel {

    var buttons: Array<ICommand> = Array(10) { NoCommand() }

    fun setCommand(slot: Int, command: ICommand){
        buttons[slot] = command
    }

    fun onButtonClicked(slot: Int){
        buttons[slot].execute()
    }
}
```

We created ten buttons to hold our commands. NoCommand is an empty command that does nothing. It is just not to bother with null or empty indexes. setCommand() will be used to place commands. And in main(*Client*), we will make requests via onButtonClicked() method. Now, we can set our commands to panel and execute them from there.

```kotlin
with(abilityPanel){
  setCommand(0, MoveCommand(ourKnight))
  setCommand(1, AttackCommand(ourKnight))

  onButtonClicked(0)
  onButtonClicked(1)
}
```

That's all. They can be changed event at runtime, and also we are not restricted to just our own character. We can pass any object to command's constructor and it will do the commands. It just needs to be subclass of ICharacter. With this, we achieved our functionality splendidly and ready to use.
