// Импорт класса JOptionPane:
import javax.swing.JOptionPane;
// Описание класса
public class InputDialogDemo {
    // Главый метод:
    public static void main(String[] args){
        // Переменная для записи текста:
        String text;
        // Отображение диалогового окна с полем ввода:
        text = JOptionPane.showInputDialog("Введите текст");
        // Отображение диалогового окна с сообщением:
        JOptionPane.showMessageDialog(null,"Вы ввели такой текст:\n" + text);
    }
}
