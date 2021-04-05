interface Area
{
	float pi=3.14f;
	float calArea(float a,float b);
}

class Rectangle implements Area
{
	public float calArea(float a,float b){
		return(a+b);
	}
}

class Circle implements Area
{
	public float calArea(float a,float b){
		return(pi*a*b);
	}
} 

class TestInterface
{
	public static void main(String args[])
	{
		Area obj=new Rectangle();
		System.out.println("Rectangle's Area= "+obj.calArea(2.0f,3.0f));
		obj=new Circle();
		System.out.println("Circle's Area= "+obj.calArea(2.2f,3.4f));
	}
}