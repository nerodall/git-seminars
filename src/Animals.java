import java.util.ArrayList;
import java.util.Date;

abstract class Animals {
    private static int nextId = 1;
    public Integer id;
    public String name;
    public Date birthDate;
    public ArrayList<String> commands;

    public Animals(String name, Date birthDate) {
        this.id = nextId++;
        this.name = name;
        this.birthDate = birthDate;
        this.commands = new ArrayList<>();
    }

    @Override
    public String toString() {
        return
                "id - " + id + " \n" +
                "name - " + name + " \n" +
                "birthDate - " + birthDate + " \n" +
                "available commands:\n" + ReturnCommands(commands);
    }

    public void AddCommand(String command) {
        commands.add(command);
    }

    private StringBuilder ReturnCommands(ArrayList<String> list){
        StringBuilder result = new StringBuilder();
        for (String item: list
             ) {
            result.append(item).append(" \n");
        }

        return  result;
    }
}
