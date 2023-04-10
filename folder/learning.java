import javax.swing.*;

public class learning
{
    JFrame frame;
    learning()
    {
        frame=new JFrame("My window");
        frame.setVisible(true);
        frame.setBounds(300,300,500,300);
    }
    public static void main(String[] args) {
        new learning();
    }
}
