
public class Room {
    private String name;
    private RoomType type;
    private int cap;
    public Room(String name,int cap, RoomType type)
    {
        this.cap=cap;
        this.name=name;
        this.type=type;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", cap=" + cap +
                '}';
    }

    @Override
    public boolean equals(Object obj)
    {   //daca obiectul nu exista sau daca nu e de tip camera, returnam fals
        if (obj == null || !(obj instanceof Room)) {
            return false;
        }
        //creem o camera care sa primeasca numele camerei obj
        Room other = (Room) obj;
        return name.equals(other.name);
    }

}
