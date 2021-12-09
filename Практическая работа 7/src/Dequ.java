import java.util.ArrayDeque;
import java.util.Deque;

class Dequ{
    Deque<Integer> first, second; //создание двух очередей

    public Dequ(String first, String second) {
        this.first = new ArrayDeque<>();
        this.second = new ArrayDeque<>();
        for(int i = 0; i < 5; i ++){
            this.first.add(Integer.parseInt(first.substring(i, i+1)));
            this.second.add(Integer.parseInt(second.substring(i, i+1)));
        }
    }

    public String play(){
        int count = 0;
        while(!first.isEmpty() && !second.isEmpty() && count < 106){
            if(first.peek() > second.peek() && second.peek() != 0){
                first.add(first.remove());
                first.add(second.remove());
            }
            else{
                second.add(first.remove());
                second.add(second.remove());
            }
            count++;
        }
        String res = "";
        if(first.isEmpty()) res += "second ";
        else if (second.isEmpty()) res += "first ";
        res += count;
        if(count >= 106) res += " botva";
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Dequ("13579", "24680").play());
    }

}