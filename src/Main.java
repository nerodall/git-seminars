import AnimalsPackage.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws ParseException {
        ViewProgrammInterface view = new ViewProgrammInterface();
        Scanner input = new Scanner(System.in);
        HashMap<Integer, Animals> animalsHashMap = new HashMap<>();
        Integer hmNumber = 0;

        //Тут тестовый элемет. Можно раскоментить, чтобы руками заполнять
        Animals cat1 = new Cat("Барсик", new SimpleDateFormat("yyyy-MM-dd").parse("2022-02-11"));
        animalsHashMap.put(999, cat1);


        while (true) {
            view.ViewInterface();
            int sw = input.nextInt();
            switch (sw) {
                case 0:
                    System.exit(0);

                case 1:
                    System.out.println("Введите имя");
                    String name = input.next();

                    System.out.println("Введите дату рождения в формате yyyy-MM-dd");
                    Date birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(input.next());

                    view.GetTypesAnimals();
                    int switchAnimal = input.nextInt();
                    switch (switchAnimal) {
                        case 1:
                            Animals cat = new Cat(name, birthDate);
                            animalsHashMap.put(hmNumber, cat);
                            hmNumber++;
                            break;

                        case 2:
                            Animals dog = new Dog(name, birthDate);
                            animalsHashMap.put(hmNumber, dog);
                            hmNumber++;
                            break;

                        case 3:
                            Animals hamster = new Hamster(name, birthDate);
                            animalsHashMap.put(hmNumber, hamster);
                            hmNumber++;
                            break;

                        case 4:
                            Animals horse = new Horse(name, birthDate);
                            animalsHashMap.put(hmNumber, horse);
                            hmNumber++;
                            break;

                        case 5:
                            Animals camel = new Camel(name, birthDate);
                            animalsHashMap.put(hmNumber, camel);
                            hmNumber++;
                            break;

                        case 6:
                            Animals cow = new Cow(name, birthDate);
                            animalsHashMap.put(hmNumber, cow);
                            hmNumber++;
                            break;

                    }
                    break;

                case 2:
                    System.out.println("Введите номер в списке");
                    int choose = input.nextInt();
                    if ( animalsHashMap.containsKey(choose)) {
                        System.out.println(animalsHashMap.get(choose));
                        System.out.println("Введите новую команду");
                        animalsHashMap.get(choose).AddCommand(input.next());
                    }
                    else {
                        System.out.println("Номер не найден");
                    }
                    break;

                case 3:
                    for (Map.Entry item : animalsHashMap.entrySet()) {
                        System.out.println("Номер в списке " + item.getKey());
                        System.out.println(item.getValue());
                    }
                    break;
                case 4:
                    System.out.println("Общее количество животных " + animalsHashMap.size() + "\n");


            }

        }
    }
}