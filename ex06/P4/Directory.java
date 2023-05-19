import java.util.ArrayList;

public class Directory extends Entity {
    private ArrayList<Entity> contents;

    public Directory(String name) {
        super(name);
        contents = new ArrayList<Entity>();
    }

    public int getSize() {
        int totalSize = 0;
        for (Entity e : contents) {
            totalSize += e.getSize();
        }
        return totalSize;
    }

    public void add(Entity entity) {
        contents.add(entity);
    }

    public void display() {
        System.out.print(getName() + " ");
        for (Entity e : contents) {
            System.out.print(e.getName() + " ");
        }
        System.out.println();
        System.out.println(getSize() + " bytes");
    }
}
