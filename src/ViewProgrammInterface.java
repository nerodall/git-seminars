public class ViewProgrammInterface {
    public ViewProgrammInterface() {
    }
    public void GetTypesAnimals(){
        System.out.println("Сделайте выбор животного для создания:\n" +
                "1. Кот\n" +
                "2. Собака\n" +
                "3. Хомяк\n" +
                "4. Лошадь\n" +
                "5. Верблюд\n" +
                "6. Корова\n"
        );
    }
    public void ViewInterface(){
        System.out.println(
                     "0. Завершить программу\n" +
                        "1. Добавить животное\n" +
                             "2. Обучить новой команде\n" +
                                "3. Показать всех животных\n" +
                                "4. Показать общее количество животных\n" +

                        "Введите номер команды"
        );

    }
}
