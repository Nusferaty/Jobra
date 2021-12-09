package com.company;

import java.util.Stack;

class Game {
    Stack<Integer> first, second; // создаем два стека (по одному для каждого игрока)

    public Game(String first, String second) { //конструктор класса, в котором записывается строка в стек в обратном порядке, чтоб первый элемент был сверху
        this.first = new Stack<>();
        this.second = new Stack<>();
        for(int i = 4; i >= 0; i --){
            this.first.push(Integer.parseInt(first.substring(i, i+1)));
            this.second.push(Integer.parseInt(second.substring(i, i+1)));
        }
    }

    private void pushBack(Stack<Integer> s, Integer item){ //кладем в стек новый элемент
        Stack<Integer> ns = new Stack<>(); //создаем новый стек
        while (!s.isEmpty()) //пока не пустой стек
            ns.push(s.pop()); //помещение элемента на вершину стека
        s.push(item);
        while (!ns.isEmpty())
            s.push(ns.pop());
    }

    public String play(){
        int count = 0;
        while(!first.isEmpty() && !second.isEmpty() && count <= 106){ //проверка, есть ли в стеках элементы (!isEmpty) и не превышен ли лимит шагов
            if(first.peek() > second.peek() && second.peek() != 0){ //если побеждает первый (проверяем первый элемент не удаляя его)
                pushBack(first, first.pop());   //перекладываем первый элемент первого стека
                pushBack(first, second.pop()); //перекладываем первый элемент второго стека
            }else{ //иначе побеждает второй
                pushBack(second, first.pop());
                pushBack(second, second.pop());
            }
            count++; //увеличение количества ходов
        }
        String res = ""; //вывод результата
        if(first.isEmpty()) res += "second ";
        else res += "first ";
        res += count;
        if(count >= 106) res += " botva";
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Game("13579", "24680").play());
    }

}