import java.util.Arrays;

public class HomeworkAbstract {
    public RoomAbstract[] rooms = new RoomAbstract[10];
    public  Event[] events = new Event[10];
    public int countEvents = 0;
    public int countRooms=0;
    public  int AddEvents(Event test) {
        int p = 0;
        p = CheckDuplicates(test);
        if (p != -1) countEvents = p;
        return countEvents;
    }

    public  int AddRooms( RoomAbstract test) {
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

    public int CheckDuplicates(RoomAbstract test) {
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

        HomeworkAbstract app = new HomeworkAbstract();
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




        ComputerLab c5 = new ComputerLab("Lab1",30,OSType.W10);
        // System.out.println(app);
        c5.setType(OSType.W8);
        LectureHall lecture1= new LectureHall("Lecture1",100,true);
        app.AddRooms(c5);
        app.AddRooms(c5);
        app.AddRooms(lecture1);
        app.ShowEvents();
        app.ShowRooms();
    }
}