<<<<<<< HEAD
=======

>>>>>>> 15ca8eff81c22c6f2c6018e1386188fe3bf32220
import javax.swing.*;

public class Main extends JFrame {



    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {


                Kanvas canvas = new Kanvas();
                Main main = new Main();
                main.add(canvas);



            }
        });
    }

    public Main(){

        setVisible(true);
        setSize(800,600);
        setTitle("Flappy Mexican");
        setLocationRelativeTo(null);

    }

}
<<<<<<< HEAD
=======

>>>>>>> 15ca8eff81c22c6f2c6018e1386188fe3bf32220
