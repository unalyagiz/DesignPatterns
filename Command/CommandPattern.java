package Command;

import java.util.ArrayList;
import java.util.List;


interface Command {
    void execute();

    void display();
}

class ClearCommand implements Command {
    public static final String name = "Clear";
    private final Manipulator manipulator;

    public ClearCommand(Manipulator manipulator) {
        this.manipulator = manipulator;
    }

    public void display() {
        System.out.println(name);
    }

    @Override
    public void execute() {
        manipulator.manipulate(name);
    }
}

class ReverseCommand implements Command {
    public static final String name = "Reverse";
    private final Manipulator manipulator;

    public ReverseCommand(Manipulator manipulator) {
        this.manipulator = manipulator;
    }

    public void display() {
        System.out.println(name);
    }


    @Override
    public void execute() {
        manipulator.manipulate(name);
    }
}

class UpperCommand implements Command {
    public static final String name = "Upper";
    private final Manipulator manipulator;

    public UpperCommand(Manipulator manipulator) {
        this.manipulator = manipulator;
    }

    public void display() {
        System.out.println(name);
    }

    @Override
    public void execute() {
        manipulator.manipulate(name);
    }

}


class Manipulator {
    private String text;

    public Manipulator(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    void manipulate(String action) {
        switch (action) {
            case UpperCommand.name:
                text = text.toUpperCase();
                System.out.println(text);
                setText(text);
                break;
            case ReverseCommand.name:
                StringBuilder builder = new StringBuilder(text);
                text = builder.reverse().toString();
                System.out.println(text);
                break;
            case ClearCommand.name:
                text = text.replace(" ", "");
                System.out.println(text);
                break;
        }
    }

}

class User {
    private List<Command> commandList = new ArrayList<>();

    void Compute(Command command) {
        command.execute();
        commandList.add(command);
    }

    void getHistory() {
        commandList.forEach(Command::display);
    }
}

class MacroCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    public MacroCommand(Manipulator manipulator) {
        commands.add(new ClearCommand(manipulator));
        commands.add(new ReverseCommand(manipulator));
        commands.add(new UpperCommand(manipulator));
    }

    public void Add(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }

    @Override
    public void display() {
        commands.forEach(Command::display);
    }
}

public class CommandPattern {
    public static void main(String[] args) {
        final String SEPERATOR = "********";
        String text = "I love Coding with Notepad";
        User user = new User();
        Manipulator manipulator = new Manipulator(text);
        Command command = null;

        command = new UpperCommand(manipulator);
        user.Compute(command);

        command = new ReverseCommand(manipulator);
        user.Compute(command);

        command = new ClearCommand(manipulator);
        user.Compute(command);

        System.out.println("Display Executed Commands->");
        user.getHistory();
        System.out.println(SEPERATOR);
        System.out.println("Macro Command->");
        MacroCommand macroCommand = new MacroCommand(manipulator);
        macroCommand.execute();
        macroCommand.Add(new ReverseCommand(manipulator));
        manipulator.setText(text);
        System.out.println("\n<--Add one more command and execute commands one more time with the same string->>");
        macroCommand.execute();
        System.out.println("<-Display Executed Commands->");
        macroCommand.display();

    }
}
