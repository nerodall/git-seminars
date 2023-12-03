import java.io.Console;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws ParseException {
        ViewProgrammInterface view = new ViewProgrammInterface();
        Scanner input = new Scanner(System.in);
        HashMap <Integer, Animals> animalsHashMap = new HashMap<>();
        Integer hmNumber=0;
        Animals cat1 = new Cat("кот",new SimpleDateFormat("yyyy-MM-dd").parse("2022-02-11"));
        animalsHashMap.put(999,cat1);


        while (true){
            view.ViewInterface();
            int sw = input.nextInt();
        switch (sw){
            case 0:
            System.exit(0);

            case 1:
                System.out.println("Введите имя");
                String name = input.next().toString();
                System.out.println("Введите дату рождения в формате yyyy-MM-dd");
                String birthDate = input.next().toString();
                view.GetTypesAnimals();
                int switchAnimal = input.nextInt();
                switch (switchAnimal){
                    case 1:
                        Animals cat = new Cat(name,new SimpleDateFormat("yyyy-MM-dd").parse(birthDate));
                        animalsHashMap.put(hmNumber,cat);
                        hmNumber++;
                        break;
                        /* for (Map.Entry item: animalsHashMap.entrySet()) {
                            System.out.println("Номер в списке " +item.getKey());
                            System.out.println(item.getValue());
                        }*/
                    case 2:
                        Animals dog = new Dog(name,new SimpleDateFormat("yyyy-MM-dd").parse(birthDate));
                        animalsHashMap.put(hmNumber,dog);
                        hmNumber++;
                        break;

                    case 3:
                        Animals hamster = new Hamster(name,new SimpleDateFormat("yyyy-MM-dd").parse(birthDate));
                        animalsHashMap.put(hmNumber,hamster);
                        hmNumber++;
                        break;

                    case 4:
                        Animals horse = new Horse(name,new SimpleDateFormat("yyyy-MM-dd").parse(birthDate));
                        animalsHashMap.put(hmNumber,horse);
                        hmNumber++;
                        break;

                    case 5:
                        Animals camel = new Camel(name,new SimpleDateFormat("yyyy-MM-dd").parse(birthDate));
                        animalsHashMap.put(hmNumber,camel);
                        hmNumber++;
                        break;

                    case 6:
                        Animals cow = new Cow(name,new SimpleDateFormat("yyyy-MM-dd").parse(birthDate));
                        animalsHashMap.put(hmNumber,cow);
                        hmNumber++;
                        break;

                }
                break;

            case 2:
                System.out.println("Введите номер в списке");
                int choise = input.nextInt();
                System.out.println(animalsHashMap.get(choise));
                System.out.println("Введите новую команду");
                animalsHashMap.get(choise).AddCommand(input.next().toString());
                break;

            case 3:
                for (Map.Entry item: animalsHashMap.entrySet()) {
                    System.out.println("Номер в списке " +item.getKey());
                    System.out.println(item.getValue());
                }
                break;
            case 4:
                System.out.println("Общее количество животных "+ animalsHashMap.size() + "\n");


        }

        }
    }
}