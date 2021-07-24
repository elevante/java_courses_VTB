public class MainApp {
    public static void main(String[] args) {

        ActionAll[] allParticipants = {
                new Robot("Робот", "Марс", 100,3),
                new Robot("Робот", "Дик", 150,4),
                new Cat("Кошка", "Мика", 60,2),
                new Cat("Кошка", "Тед", 50,1),
                new Human("Человек", "Адель", 100,2),
                new Human("Человек", "Марк", 90,2),
        };

        for (ActionAll member: allParticipants){
            member.jump(new Wall(4));
            member.run(new Treadmill(100));
            System.out.println();
        }

    }
}
