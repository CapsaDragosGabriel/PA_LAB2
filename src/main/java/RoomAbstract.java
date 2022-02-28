public abstract  class RoomAbstract {
    private String name;
    private int cap;

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

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
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
        return name.equals(other.getName());
    }
}
