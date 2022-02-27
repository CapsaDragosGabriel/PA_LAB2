public class Homework {
    public static int AddEvents(int n,Event[] events,Event test)
    {int p=0;
        p=CheckDuplicates(n,events,test);
        if (p!=-1) n=p;
      return n;
    }
    public static int AddRooms(int n,Room[] rooms,Room test)
    {int p=0;
        p=CheckDuplicates(n,rooms,test);
        if (p!=-1) n=p;
        return n;
    }
    public static void ShowEvents(int n,Event[] events)
    {
        for (int i=0;i<n;i++)
            System.out.println(events[i]);
    }
    public static void ShowRooms(int n,Room[] rooms)
    {
        for (int i=0;i<n;i++)
            System.out.println(rooms[i]);
    }
    public static int CheckDuplicates(int n,Event[] list,Event test)
    {
        int i;

        for ( i=0;i<=n;i++) {
            if (test.equals(list[i]) == true)
            {//aici se poate adauga un mesaj pe care-l afisam cand nu se poate adauga evenimentul
                return -1;
            }
        }
        if(test.equals(list[i]) == false) {
            list[n]=test;
            n++;}

    return n;
    }
    public static int CheckDuplicates(int n,Room[] list,Room test)
    {
        int i;

        for ( i=0;i<=n;i++) {
            if (test.equals(list[i]) == true)
            {
                //aici se poate adauga un mesaj pe care-l afisam cand nu se poate adauga camera
                return -1;
            }
        }
        if(test.equals(list[i]) == false) {
            list[n] = test;
            n++;
        }
        return n;
    }
    public static void main(String[] args) {
        Homework app = new Homework();
        int countEvents = 0;
        int countRooms=0;
        Room[] rooms = new Room[5];
        Event[] events = new Event[7];

        Homework.ShowEvents(countEvents,events);

        Event c1=new Event("C1",100,8,10);
        Event c2=new Event("C2",100, 10, 12);
        Event l1=new Event("L1",30,8,10);
        Event l2=new Event("L2",30,8,10);
        Event l3=new Event("L3",30,10,12);
        countEvents=AddEvents(countEvents,events,c1);
        countEvents=AddEvents(countEvents,events,c2);
        countEvents=AddEvents(countEvents,events,l1);
        countEvents=AddEvents(countEvents,events,l2);
        countEvents=AddEvents(countEvents,events,l3);
        countEvents=AddEvents(countEvents,events,l3);
        Homework.ShowEvents(countEvents,events);

        Room r401=new Room("401",30,RoomType.COMPUTER_LAB);
        Room r403=new Room("403",30,RoomType.COMPUTER_LAB);
        Room r405=new Room("405",30,RoomType.COMPUTER_LAB);
        Room r309=new Room("309",30,RoomType.LECTURE_HALL);
        countRooms=AddRooms(countRooms,rooms,r401);
        countRooms=AddRooms(countRooms,rooms,r403);
        countRooms=AddRooms(countRooms,rooms,r405);
        countRooms=AddRooms(countRooms,rooms,r309);
        Homework.ShowRooms(countRooms,rooms);
    }
}
