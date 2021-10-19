import javax.swing.*;
/**
 * От JFrame наследуется каждый класс, который хочет быть окном
 */
public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //закрытие окна на Х
        setSize(320,345);//размер игрового окна
        setLocation(400,400);//место, где окно появится
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args){
        MainWindow mainWindow = new MainWindow();
    }
}
