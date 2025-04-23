package AWT;
import java.awt.*;
public class frame {

	public static void main(String[] args) {
		Frame f = new Frame("Dheeraj");
        Button b = new Button("Click Here!");
        TextField t= new TextField("Hello");
        TextArea t1= new TextArea("My");
        List l = new List(5);
        l.add("Item 1");
        l.add("Item 2");
        l.add("Item 3");
        l.setBounds(50, 50, 80, 100);
        t.setBounds(150, 190, 100, 120);;
        t1.setBounds(100, 100, 100, 100);
        b.setBounds(200, 200, 80, 30);
        f.add(b);
        f.add(t);
        f.add(l);
        f.add(t1);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
	}

}
