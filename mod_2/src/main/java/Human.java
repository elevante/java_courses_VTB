public class Human implements ActionAll{
    String type;
    String name;
    int maxRunDistance;
    int maxJumpHeight;

    public Human(String type, String name, int maxRunDistance, int maxJumpHeight) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void run(Treadmill treadmill) {
        if (treadmill.distance <= maxRunDistance)
            System.out.println(this.type + " " + this.name + " успешно пробежал " +  maxRunDistance +  " м.");
        else
            System.out.println(this.type + " " + this.name + " не смог пробежать " + maxRunDistance + " м.");
    }

    @Override
    public void jump(Wall wall){
        if (wall.height <= maxJumpHeight)
            System.out.println(this.type + " " + this.name + " успешно перепрыгнул " + wall.height + " м.");
        else
            System.out.println(this.type + " " + this.name + " не смог перепрыгнуть " + wall.height + " м.");
    }
}
