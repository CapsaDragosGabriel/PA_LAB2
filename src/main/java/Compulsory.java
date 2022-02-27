
public class Compulsory {
    public void CompulsoryTest(){
        Event c1=new Event("C1",100,8,10);
        Event c2=new Event("C2",100, 10, 12);
        Event l1=new Event("L1",30,8,10);
        Event l2=new Event("L2",30,8,10);
        Event l3=new Event("L3",30,10,12);
        Room r401=new Room("401",30,RoomType.COMPUTER_LAB);
        Room r403=new Room("403",30,RoomType.COMPUTER_LAB);
        Room r405=new Room("405",30,RoomType.COMPUTER_LAB);
        Room r309=new Room("309",30,RoomType.LECTURE_HALL);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println();
        System.out.println(r401);
        System.out.println(r403);
        System.out.println(r405);
        System.out.println(r309);
        System.out.println();


       // System.out.println(l1);
    }

    public static void main(String[] args) {
        Compulsory app= new Compulsory();
        app.CompulsoryTest();


    }
}
