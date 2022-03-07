import java.util.HashMap;
import java.util.Map;

public class Solution {
    public Map<RoomAbstract,Event> schedule= new HashMap<>();

    public Map<RoomAbstract, Event> getSchedule() {
        return schedule;
    }

    public void setSchedule(RoomAbstract r1,Event e1) {
        this.schedule.put(r1,e1);
    }

    @Override
    public String toString() {
        return "Solution{" +
                "schedule=" + schedule +
                '}';
    }
}
