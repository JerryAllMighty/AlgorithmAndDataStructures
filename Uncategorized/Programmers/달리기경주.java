package Uncategorized.Programmers;

import java.util.Arrays;
import java.util.HashMap;

public class 달리기경주 {
    //2024.05.02
//    //try 1
//    class Solution {
//        public String[] solution(String[] players, String[] callings) {
//            String[] answer = {};
//            //find the idx of the player just get passed
//            for(String c : callings){
//                for(int i =0; i < players.length; i++){
//                    String player = players[i];
//                    int idx = 0;
//                    if(player.equals(c)){
//                        idx = i;
//                        //change those two
//                        players[idx] = players[idx-1];
//                        players[idx-1] = player;
//                        break;
//                    }
//
//
//                }
//            }
//            return players;
//        }
//    }
    //try 2
    class Solution {
        public String[] solution(String[] players, String[] callings) {
            HashMap<String, Integer> playersMap = new HashMap<>();
            for(int i =0; i < players.length; i++){
                playersMap.put(players[i],i);
            }
            //find the idx of the player just get passed
            for(String c : callings){
                int idx = playersMap.get(c);
                //change the two
                //first the given array
                String temp = players[idx-1];
                players[idx-1] = c;
                players[idx] = temp;

                //second the hashMap
                playersMap.replace(c, idx-1);
                playersMap.replace(temp, idx);
            }
            return players;
        }
    }
}
