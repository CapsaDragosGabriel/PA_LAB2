import java.util.Arrays;

public class HomeworkAbstract {
    public RoomAbstract[] rooms = new RoomAbstract[10];
    public  Event[] events = new Event[10];
    public int countEvents = 0;
    public int countRooms=0;
    public  int addEvents(Event test) {
        int p = 0;
        p = checkDuplicates(test);
        if (p != -1) countEvents = p;
        return countEvents;
    }

    public  int addRooms( RoomAbstract test) {
        int p = 0;
        p = checkDuplicates(test);
        if (p != -1) countRooms = p;
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
    public void sortEvents()
    {
        int iterator1=0;
        int iterator2=0;
        for (iterator1=0;iterator1<countEvents;iterator1++)
        {
            for (iterator2=iterator1+1;iterator2<countEvents;iterator2++) {
            if (events[iterator1].getSize()<events[iterator2].getSize())
            {
                Event swap= new Event();
                swap=events[iterator1];
                events[iterator1]=events[iterator2];
                events[iterator2]=swap;
            }

            }
        }
    }
    /*
    public void SortRooms()
    {
        int iterator1=0;
        int iterator2=0;
        for (iterator1=0;iterator1<countRooms;iterator1++)
        {
            for (iterator2=iterator1+1;iterator2<countRooms;iterator2++) {
                if (rooms[iterator1].getCap()<rooms[iterator2].getCap())
                {
                     RoomAbstract swap= new RoomAbstract();
                    swap=events[iterator1];
                    events[iterator1]=events[iterator2];
                    events[iterator2]=swap;
                }

            }
        }
    }*/
    public int checkDuplicates(RoomAbstract test) {
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
        app.showEvents();

        Event c1=new Event("C1",100,8,10);
        Event c2=new Event("C2",100, 10, 12);
        Event l1=new Event("L1",30,8,10);
        Event l2=new Event("L2",30,8,10);
        Event l3=new Event("L3",30,10,12);
        Event l4=new Event("L4",70,10,12);
        app.addEvents(c1);
        app.addEvents(c2);
        app.addEvents(l1);
        app.addEvents(l2);
        app.addEvents(l3);
        app.addEvents(l3);
        app.addEvents(l4);
        ComputerLab c5 = new ComputerLab("Lab1",30,OSType.W10);
        // System.out.println(app);
        c5.setType(OSType.W8);
        LectureHall lecture1= new LectureHall("Lecture1",100,true);
        app.addRooms(c5);
        app.addRooms(c5);
        app.addRooms(lecture1);
        app.showEvents();
        app.showRooms();
        app.sortEvents();
        app.showEvents();
/*
        Solution sol=new Solution();
        sol.setSchedule(c5,c1);
        System.out.println(sol);*/
    }
}
