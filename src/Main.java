import java.io.Console;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException {
        ViewProgrammInterface view = new ViewProgrammInterface();
        Scanner input = new Scanner(System.in);

      //   Cat cat = new Cat("кот",new SimpleDateFormat("yyyy-MM-dd").parse("2022-02-11"));
       //  cat.AddCommand("Лежать");
      //   cat.AddCommand("Сидеть");
      //  System.out.println(cat.toString());
        int sw;

        while (true){
            view.ViewInterface();
            sw = input.nextInt();
        switch (sw){
            case 0:
            System.exit(0);
            case 1:
                view.GetTypesAnimals();
        }
        }
    }
}