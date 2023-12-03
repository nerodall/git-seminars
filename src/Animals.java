import java.util.ArrayList;
import java.util.Date;

/**
 * Класс для описани класса Animals. Содержит основные поля
 * id
 * Имя
 * Дата рожедния
 */
abstract class Animals {
    private static int nextId = 1;
    public Integer id;
    public String name;
    public Date birthDate;



    public ArrayList<String> commands;

    /**
     * Контсруктор для класса Animals
     * @param name имя животного
     * @param birthDate дата рождения в формате yyyy-MM-dd
     */
    public Animals(String name, Date birthDate) {
        this.id = nextId++;
        this.name = name;
        this.birthDate = birthDate;
        this.commands = new ArrayList<>();
    }


    /**
     * Метода для вывода id, имени, даты рождения и доступных команд для животного
     * @return
     */
    @Override
    public String toString() {
        return
                "id - " + id + " \n" +
                "name - " + name + " \n" +
                "birthDate - " + birthDate + " \n" +
                "available commands:\n" + ReturnCommands(commands);
    }

    /**
     * Метод для добавления новой команды для животного
     * @param command новая команда
     */
    public void AddCommand(String command) {
        commands.add(command);
    }

    /**
     * Метод для вывода всех доступных команд
     * @param list список команд
     * @return
     */
    private StringBuilder ReturnCommands(ArrayList<String> list){
        StringBuilder result = new StringBuilder();
        for (String item: list
             ) {
            result.append(item).append(" \n");
        }

        return  result;
    }
}
