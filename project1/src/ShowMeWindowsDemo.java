import javax.swing.JOptionPane;
public class ShowMeWindowsDemo {
    public static void main(String[] args){
        // Название диалогового окна:
        String title;
        // Текст сообщения:
        String text;
        // Отображение первого окна с полем ввода:
        title = JOptionPane.showInputDialog(null,"Имя для окна:","Название",
                JOptionPane.WARNING_MESSAGE);
        // Отображение второго окна с полем ввода:
        text = JOptionPane.showInputDialog(null,"Текст сообщения:","Содержание",
                JOptionPane.PLAIN_MESSAGE);
        // Отображение окна с сообщением:
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
