package org.example;


public class Hallway {
    public static int contact(String hallway) {
        char[] list = hallway.toCharArray();
        int count = 0;
        int result=10000;
        boolean start=false;
        for (char c : list) {
            if (start) count++;
            if (c == '>')
            {
                start = true;
                count=0;
            }
            if (c == '<' && start){
                start = false;
                result = Math.min(result, count);
        }



        }
        if (result%2==1) return (int) (Math.floor(result / 2)+1);

        return result!=10000 ? (int) Math.floor(result / 2) :-1;
        //Good luck :D
    }
//    public static int contact(String hallway) {
//        return Pattern.compile(">-*<").matcher(hallway).results().mapToInt(r -> r.group().length() / 2).min().orElse(-1);
//    }
}
