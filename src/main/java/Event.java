public class Event{
    private String name;
    private int size;
    private int start;
    private int end;

    public Event(){}
    public Event(String name,int size, int start,int end)
    {
        this.name=name;
        this.size=size;
        this.start=start;
        this.end=end;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
    @Override
    public boolean equals(Object obj)
    {
//daca obiectul nu exista sau daca nu e de tip event, returnam fals
        if (obj == null || !(obj instanceof Event)) {
            return false;
        }
        //creem o camera care sa primeasca numele event-ului obj
        Event other = (Event) obj;
        return name.equals(other.name);
    }
}
