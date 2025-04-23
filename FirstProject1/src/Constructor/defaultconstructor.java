package Constructor;
class defaultconstructor
{
	int Eid;
	String name;
	float salary;
	public void setdata(int Eid,String name,float salary)
	 {
		   this.Eid=Eid;
		   this.name=name;
		   this.salary=salary;
		}
	public void getdata()
	 {
		 System.out.printf("Employee ID:%d Name of Employee:%s Salary:%.2f\n",Eid,name,salary);
	 }
	
		}

