public class File extends Entity {
    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void display() {
        System.out.println(getName() + " " + getSize() + " bytes");
    }
}
