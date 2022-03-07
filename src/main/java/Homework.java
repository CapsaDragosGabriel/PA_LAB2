import java.util.Arrays;

public class Homework {
   public Room[] rooms = new Room[10];
  public  Event[] events = new Event[10];
    public int countEvents = 0;
    public int countRooms=0;
    public  int addEvents(Event test) {
        int iterator = 0;
        iterator = checkDuplicates(test);
        if (iterator != -1) countEvents = iterator;
        return countEvents;
    }

    public  int addRooms( Room test) {
        int iterator = 0;
        iterator = checkDuplicates(test);
        if (iterator != -1) countRooms = iterator;
        return countRooms;
    }

    public void showEvents() {
        for (int index= 0; index< countEvents; index++)
            System.out.println(events[index]);
    }

    public  void showRooms() {
        for (int index= 0; index< countRooms; index++)
            System.out.println(rooms[index]);
    }

    public  int checkDuplicates(Event test) {
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

    public int checkDuplicates(Room test) {
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
        app.showEvents();

        Event c1=new Event("C1",100,8,10);
        Event c2=new Event("C2",100, 10, 12);
        Event l1=new Event("L1",30,8,10);
        Event l2=new Event("L2",30,8,10);
        Event l3=new Event("L3",30,10,12);
        app.addEvents(c1);
        app.addEvents(c2);
        app.addEvents(l1);
        app.addEvents(l2);
        app.addEvents(l3);
        app.addEvents(l3);


        Room r401=new Room("401",30,RoomType.COMPUTER_LAB);
        Room r403=new Room("403",30,RoomType.COMPUTER_LAB);
        Room r405=new Room("405",30,RoomType.COMPUTER_LAB);
        Room r309=new Room("309",30,RoomType.LECTURE_HALL);
        app.addRooms(r401);
        app.addRooms(r403);
        app.addRooms(r405);
        app.addRooms(r309);



       // System.out.println(app);


        app.showEvents();
        app.showRooms();

    }
}
