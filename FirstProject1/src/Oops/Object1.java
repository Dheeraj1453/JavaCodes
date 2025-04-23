package Oops;
class car
{
	int chasisno,build,Engineno,maxspeed;
	String brand,model,color;
	}

//Main class
public class Object1 {
	public static void main(String args[])
	{
		car ob1=new car();  //Object1 of class car 
	    car ob2=new car();   //Object2 of class car 
	    
	    //values for Object1
	ob1.brand="Mahendra";ob1.brand="Scorpio";ob1.color="White";
	ob1.chasisno=782145; ob1.build=2018; ob1.Engineno=324445; 
	ob1.maxspeed=180;
	
	//Values for Object2
	ob2.brand="Mahendra";ob2.model="Thar";ob2.color="Black";
	ob2.chasisno=98145; ob2.build=2020; ob2.Engineno=123445; 
	ob2.maxspeed=150;
	
	//print using printf
	System.out.printf("Chasis No:%d\nBrand:%s\nModel:%s\nEngine No:%d\nColour:%s\nBuild In:%d\nMax Speed:%d\n",ob1.chasisno,ob1.brand,ob1.model,ob1.Engineno,ob1.color,ob1.build,ob1.maxspeed);
	System.out.printf("Chasis No:%d\nBrand:%s\nModel:%s\nEngine No:%d\nColour:%s\nBuild In:%d\nMax Speed:%d\n",ob2.chasisno,ob2.brand,ob2.model,ob2.Engineno,ob2.color,ob2.build,ob2.maxspeed);
	}

}
