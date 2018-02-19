import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AgruparBotones extends JFrame
        implements ActionListener {

    public AgruparBotones(String titulo) {
        //Creación de los RadioButtons
        JRadioButton birdButton = new JRadioButton("Pajarito");
        birdButton.setMnemonic(KeyEvent.VK_B);
        birdButton.setActionCommand("bird");
        birdButton.setSelected(true);

        JRadioButton catButton = new JRadioButton("Gatito");
        catButton.setMnemonic(KeyEvent.VK_C);
        catButton.setActionCommand("cat");

        JRadioButton dogButton = new JRadioButton("Perrito");
        dogButton.setMnemonic(KeyEvent.VK_D);
        dogButton.setActionCommand("dog");

        JRadioButton rabbitButton = new JRadioButton("Conejito");
        rabbitButton.setMnemonic(KeyEvent.VK_R);
        rabbitButton.setActionCommand("rabbit");

        JRadioButton pigButton = new JRadioButton("Cerdito");
        pigButton.setMnemonic(KeyEvent.VK_P);
        pigButton.setActionCommand("pig");

        ButtonGroup btgAnimalitos = new ButtonGroup();

        btgAnimalitos.add(birdButton);
        btgAnimalitos.add(catButton);
        btgAnimalitos.add(dogButton);
        btgAnimalitos.add(rabbitButton);
        btgAnimalitos.add(pigButton);

        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(0,1));
        //radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.Y_AXIS));
        radioPanel.add(birdButton);
        radioPanel.add(catButton);
        radioPanel.add(dogButton);
        radioPanel.add(rabbitButton);
        radioPanel.add(pigButton);
        radioPanel.setBackground(Color.GREEN);

        JLabel picture = new JLabel(new ImageIcon("src/loro.png"));

        /*BoxLayout distBoxLayout = new BoxLayout(this.getContentPane(),
                                                BoxLayout.X_AXIS);
        getContentPane().setLayout(distBoxLayout);
        */

        GridLayout distGrid = new GridLayout(1,2);
        getContentPane().setLayout(distGrid);
        getContentPane().add(radioPanel);
        getContentPane().add(picture);

        /*
        getContentPane().add(radioPanel, BorderLayout.WEST);
        getContentPane().add(picture,BorderLayout.CENTER);
        */

        getContentPane().setBackground(Color.BLUE);

        pack();

        setTitle(titulo);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Evento producido por " + e.getActionCommand());
    }

    public static void main (String[] args) {
        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };

        JFrame frame = new AgruparBotones("Curso de Java: Agrupar Botones");
        frame.addWindowListener(l);

        frame.pack();
        frame.setVisible(true);
    }
}