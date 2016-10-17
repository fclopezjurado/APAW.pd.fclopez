package es.upm.miw.pd.command.memento.calculator;

import es.upm.miw.pd.command.calculator.CommandManager;
import es.upm.miw.pd.command.calculator.solution.AddCommand;
import es.upm.miw.pd.command.calculator.solution.PrintCommand;
import es.upm.miw.pd.command.calculator.solution.ResetCommand;
import es.upm.miw.pd.command.calculator.solution.SubtractCommand;
import upm.jbb.IO;

public class MainCalculator {
	private CommandManager commandManager;

    public MainCalculator() {
        MementoCalculator mementoCalculator = new MementoCalculator();
        this.commandManager = new CommandManager();
        this.commandManager.add(new AddCommand(mementoCalculator));
        this.commandManager.add(new SubtractCommand(mementoCalculator));
        this.commandManager.add(new ResetCommand(mementoCalculator));
        this.commandManager.add(new PrintCommand(mementoCalculator));
        this.commandManager.add(new StoreCommand(mementoCalculator));
        this.commandManager.add(new RestoreCommand(mementoCalculator));
    }

    public void execute() {
        String key = (String) IO.getIO().select(this.commandManager.keys());
        this.commandManager.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainCalculator());
    }

}
