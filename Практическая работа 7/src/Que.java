import java.util.ArrayDeque;
import java.util.Queue;

class Que {
    Queue<Integer> first, second; //создаем две очереди

    public Que(String first, String second) { //конструктор класса, записываем данные в очереди
        this.first = new ArrayDeque<>();
        this.second = new ArrayDeque<>();
        for(int i = 0; i < 5; i ++){
            this.first.add(Integer.parseInt(first.substring(i, i+1)));
            this.second.add(Integer.parseInt(second.substring(i, i+1)));
        }
    }

    public String play(){
        int count = 0;
        while(!first.isEmpty() && !second.isEmpty() && count < 106){ //пока очереди не пустые и количество ходов не превышено
            if(first.peek() > second.peek() && second.peek() != 0){ //если побеждает первый
                first.add(first.remove()); //удаляем из одного и записываем в другой
                first.add(second.remove());

            }else{
                second.add(first.remove());
                second.add(second.remove());
            }
            count++;
        }
        String res = ""; //вывод результата
        if(first.isEmpty()) res += "second ";
        else if (second.isEmpty()) res += "first ";
        res += count;
        if(count >= 106) res += " botva";
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Que("13579", "24680").play());
    }

}