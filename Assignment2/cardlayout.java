import java.awt.*;  
  
class DemoCardLayout
{  

    DemoCardLayout()
    {  
           
        Frame f = new Frame("My Card layout");

        f.setVisible(true);
        f.setSize(700, 700);

        Button b1 = new Button("Hi");  
        Button b2 = new Button("Welcome");  
        Button b3 = new Button("Thankyou");    
              
        f.add(b1);f.add(b2);f.add(b3);  
              
            f.setLayout(new CardLayout(10, 40)); // hspace 10 and vspace 40
    }  
  
    public static void main(String[] args) 
    {  
        new DemoCardLayout();  
    }  
} 