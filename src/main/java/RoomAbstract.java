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
class LectureHall extends RoomAbstract{
    private boolean hasProjector=true;

    public LectureHall(String name,int cap, boolean hasProjector) {
        this.setName(name);
        this.setCap(cap);
        this.hasProjector = hasProjector;
    }

    public boolean getHasProjector() {
        return hasProjector;
    }

    public void setHasProjector(boolean hasProjector) {
        this.hasProjector = hasProjector;
    }
    @Override
    public boolean equals(Object obj)
    {   //daca obiectul nu exista sau daca nu e de tip camera, returnam fals
        if (obj == null || !(obj instanceof LectureHall)) {
            return false;
        }
        //creem o camera care sa primeasca numele camerei obj
        RoomAbstract other = (LectureHall) obj;
        return getName().equals(other.getName());
    }
    @Override
    public String toString() {
        return "LectureHall{" +
                "name='"+this.getName()+
                "', cap="+this.getCap()+
                ", hasProjector=" + hasProjector +
                '}';
    }
}
class ComputerLab extends RoomAbstract {
    private OSType type=OSType.W10;

    public ComputerLab(String name,int cap,OSType type) {
        this.setName(name);
        this.setCap(cap);
        this.type = type;
    }

    public OSType getType() {
        return type;
    }

    public void setType(OSType type) {
        this.type = type;
    }
    @Override
    public boolean equals(Object obj)
    {   //daca obiectul nu exista sau daca nu e de tip camera, returnam fals
        if (obj == null || !(obj instanceof ComputerLab)) {
            return false;
        }
        //creem o camera care sa primeasca numele camerei obj
        RoomAbstract other = (ComputerLab) obj;
        return getName().equals(other.getName());
    }

    @Override
    public String toString() {
        return "ComputerLab{" +
                "name='"+this.getName()+
                "', cap="+this.getCap()+
                ", OSType=" + this.getType() +
                '}';
    }
}