import java.util.Arrays;

public class Homework {
   public Room[] rooms = new Room[10];
  public  Event[] events = new Event[10];
    public int countEvents = 0;
    public int countRooms=0;
    public  int AddEvents(Event test) {
        int p = 0;
        p = CheckDuplicates(test);
        if (p != -1) countEvents = p;
        return countEvents;
    }

    public  int AddRooms( Room test) {
        int p = 0;
        p = CheckDuplicates(test);
        if (p != -1) countRooms = p;
        return countRooms;
    }

    public void ShowEvents() {
        for (int index= 0; index< countEvents; index++)
            System.out.println(events[index]);
    }

    public  void ShowRooms() {
        for (int index= 0; index< countRooms; index++)
            System.out.println(rooms[index]);
    }

    public  int CheckDuplicates(Event test) {
        int index;

        for (index= 0; index<= countEvents; index++) {
            if (test.equals(events[index]) == true) {

                return -1;
            }
        }
        if (test.equals(events[index]) == false) {
            events[countEvents] = test;
            countEvents++;
        }

        return countEvents;
    }

    public int CheckDuplicates(Room test) {
        int index;

        for (index= 0; index<= countRooms; index++) {
            if (test.equals(rooms[index]) == true) {
                return -1;
            }
        }
        if (test.equals(rooms[index]) == false) {
            rooms[countRooms] = test;
            countRooms++;
        }
        return countRooms;
    }

    @Override
    public String toString() {
        return "Homework{" +
                "\nrooms=" + Arrays.toString(rooms) +
                "\nevents=" + Arrays.toString(events) +
                "\ncountEvents=" + countEvents +
                "\ncountRooms=" + countRooms +
                '}';
    }

    public static void main(String[] args) {

        Homework app = new Homework();
        app.ShowEvents();

        Event c1=new Event("C1",100,8,10);
        Event c2=new Event("C2",100, 10, 12);
        Event l1=new Event("L1",30,8,10);
        Event l2=new Event("L2",30,8,10);
        Event l3=new Event("L3",30,10,12);
        app.AddEvents(c1);
        app.AddEvents(c2);
        app.AddEvents(l1);
        app.AddEvents(l2);
        app.AddEvents(l3);
        app.AddEvents(l3);


        Room r401=new Room("401",30,RoomType.COMPUTER_LAB);
        Room r403=new Room("403",30,RoomType.COMPUTER_LAB);
        Room r405=new Room("405",30,RoomType.COMPUTER_LAB);
        Room r309=new Room("309",30,RoomType.LECTURE_HALL);
        app.AddRooms(r401);
        app.AddRooms(r403);
        app.AddRooms(r405);
        app.AddRooms(r309);



       // System.out.println(app);


        app.ShowEvents();
        app.ShowRooms();

    }
}
