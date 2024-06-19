import java.util.HashMap;
class Solution {
    public long[] solution(long k, long[] room_number) {
        HashMap<Long, Long> nextRooms = new HashMap<>();
        long[] answer = new long[room_number.length];
        
        for (int i = 0; i < room_number.length; i++) {
            answer[i] = nextRooms(room_number[i], nextRooms);
        }
        
        return answer;
    }
    
        private long nextRooms(long room, HashMap<Long, Long> nextRooms) {
        if (!nextRooms.containsKey(room)) {
            nextRooms.put(room, room + 1);
            return room;
        }
        
        long nextRoom = nextRooms(nextRooms.get(room), nextRooms);
        nextRooms.put(room, nextRoom + 1);
        return nextRoom;
    }
}