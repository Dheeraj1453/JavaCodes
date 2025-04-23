package DIEx1;

public class UseProgrammer {
public static void main (String args[]) {
	LapTop obj= new LapTop("Asus");
	Programmer p= new Programmer(obj);
	p.writecode();
}
}
