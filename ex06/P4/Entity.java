public abstract class Entity {
    private String name;

    public Entity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void rename(String name) {
        this.name = name;
    }

    public abstract int getSize();

    public abstract void display();
}
