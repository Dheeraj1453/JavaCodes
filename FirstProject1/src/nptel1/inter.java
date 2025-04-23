package nptel1;
interface calculate
{
void cal (int items);
}
class inter implements calculate
{
	int x;
	public void cal(int item)
	{
		x=item*item;
	}
}

