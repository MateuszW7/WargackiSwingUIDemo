import javax.swing.*;

public class MainGUIWindow extends JFrame{
    private JPanel mainPanel;
    private JButton thisIsAButtonButton;
    private JFormattedTextField text;

    private int clicked;

    public MainGUIWindow(){
        clicked = 0;
        createUIComponents();
    }

    private void createUIComponents(){
        setContentPane(mainPanel);
        setSize(200,200);
        setLocation((int) (Math.random()*1690),(int) (Math.random() * 1050));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        thisIsAButtonButton.addActionListener(e ->{
            clicked++;
                    if(clicked==1){
                        text.setText("Dear God...");
                        thisIsAButtonButton.setText("There's more");
                    }
                    if(clicked==2){
                        text.setText("No...");
                    }
        });
    }
}
