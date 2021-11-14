import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {

    JButton milan = new JButton("AC Milan"); // создаю кнопку
    JButton madrid = new JButton("Real Madrid"); // создаю кнопку
    JLabel result = new JLabel("Result: 0 x 0"); // создаю надпись
    JLabel lastScorer = new JLabel("Last Scorer: N/A"); // создаю надпись
    Label winner = new Label("Winner: DRAW"); // создаю надпись

    private int milanScore = 0; //счетсчик голов Милана
    private int madridScore = 0; //счетсчик голов Мадрида

    GUI() {
        super("Football"); //наименование
        setLayout(new GridLayout(3, 2)); // задание табличного расположения полей
        setSize(400, 400); // размер окна
        add(milan); //это и пункты ниже - добавление кнопок и надписей в окно
        add(madrid);
        add(result);
        add(lastScorer);
        add(winner);

        //задание функционала кнопки Милан
        milan.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                milanScore++;
                String txt = "Result: " + milanScore + " x " + madridScore;
                result.setText(txt);
                lastScorer.setText("Last Scorer: Milan");
                if(milanScore > madridScore) {
                    winner.setText("Winner: Milan");
                }
                else if (milanScore < madridScore) {
                    winner.setText("Winner: Madrid");
                }
                else {
                    winner.setText("Winner: EQUAL SCORE");
                }
            }
        });

        //задание функционала кнопки Мадрид
        madrid.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                madridScore++;
                String txt = "Result: " + milanScore + " x " + madridScore;
                result.setText(txt);
                lastScorer.setText("Last Scorer: Madrid");
                if(milanScore > madridScore) {
                    winner.setText("Winner: Milan");
                }
                else if (milanScore < madridScore) {
                    winner.setText("Winner: Madrid");
                }
                else {
                    winner.setText("Winner: EQUAL SCORE");
                }

            }
        });
        setVisible(true);
    }

    // вывод окна на экран
    public static void main(String[] args) {
        new GUI();
    }

}