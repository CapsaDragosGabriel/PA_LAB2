public class Homework {
   public Room[] rooms = new Room[5];
  public  Event[] events = new Event[7];
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
        for (int i = 0; i < countEvents; i++)
            System.out.println(events[i]);
    }

    public  void ShowRooms() {
        for (int i = 0; i < countRooms; i++)
            System.out.println(rooms[i]);
    }

    public  int CheckDuplicates(Event test) {
        int i;

        for (i = 0; i <= countEvents; i++) {
            if (test.equals(events[i]) == true) {//aici se poate adauga un mesaj pe care-l afisam cand nu se poate adauga evenimentul
                return -1;
            }
        }
        if (test.equals(events[i]) == false) {
            events[countEvents] = test;
            countEvents++;
        }

        return countEvents;
    }

    public int CheckDuplicates(Room test) {
        int i;

        for (i = 0; i <= countRooms; i++) {
            if (test.equals(rooms[i]) == true) {
                //aici se poate adauga un mesaj pe care-l afisam cand nu se poate adauga camera
                return -1;
            }
        }
        if (test.equals(rooms[i]) == false) {
            rooms[countRooms] = test;
            countRooms++;
        }
        return countRooms;
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
        app.ShowEvents();

        Room r401=new Room("401",30,RoomType.COMPUTER_LAB);
        Room r403=new Room("403",30,RoomType.COMPUTER_LAB);
        Room r405=new Room("405",30,RoomType.COMPUTER_LAB);
        Room r309=new Room("309",30,RoomType.LECTURE_HALL);
        app.AddRooms(r401);
        app.AddRooms(r403);
        app.AddRooms(r405);
        app.AddRooms(r309);
        app.ShowRooms();


    }
}
 /*Problem p1 = new Problem();
        Event c1 = new Event("C1", 100, 8, 10);
        Event c2 = new Event("C2", 100, 10, 12);
        Event l1 = new Event("L1", 30, 8, 10);
        Event l2 = new Event("L2", 30, 8, 10);
        Event l3 = new Event("L3", 30, 10, 12);
        p1.AddEvents(c1);
        p1.ShowEvents();
*/