package Datahiding;
class product {
private int pid;   //private is a specifier which doesn't allow pid to show in main class 
 String name;
private float price;
public void setProduct(int pi,String n,float p)
{
	if(p>=1000)               //we can give condition in our method so that
		this.price=p;        // user can't input other values  
		else
			this.price=1000;
      this.name=n;
      this.pid=pi;
}
public void getProduct()
{
	System.out.printf("PID of Product:%d\nName of Product:%s\nPrice of Product:%.2f\n\n",pid,name,price);
}
}
