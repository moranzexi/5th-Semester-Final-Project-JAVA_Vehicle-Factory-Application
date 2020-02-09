package bus;

import java.util.Random;
import java.util.Scanner;

public class ElectricVehicle extends Vehicle {
	private float kilowatts;
	public float calculateKilowatt(float price,long seconds)
	{
		
		Random read=new Random();
		if(price>=200000)
		{
			
			float number=(float) (read.nextFloat()*1.79+0.2);	//0.20-1.99	
			System.out.println("the kilowatt per second for your car of this run is "+number+" kilowatts");	
			 return number*seconds;
		}
		if(price>=100000&&price<200000)
		{
			float number=(float) (read.nextFloat()*1.99+2);		//2.00-3.99	
			System.out.println("the kilowatt per second for your car of this run is "+number+" kilowatts");	
			 return number*seconds;
		}
		else
		{
			float number=(float) (read.nextFloat()*2.99+4);		//4.00-6.99			
			System.out.println("the kilowatt per second for your car of this run is "+number+" kilowatts");	
			 return number*seconds;
		}
	}
	public void setKilowatts(float value)
	{
		this.kilowatts=value;
	}
	public float getKilowatts()
	{
		return this.kilowatts;
	}
	
	public ElectricVehicle()
	{
		this.kilowatts=0.00f;
	}
	public ElectricVehicle(String id,String make,String model,long count,Date date,EnumCarType type,float p,long time,float kilowatt)
	{
		super(id,make,model,count,date,type,p,time);
		this.kilowatts=kilowatt;
	}
	public void makeTrip()
	{
		this.counter=100;
		this.kilowatts=4.44f;//f means float, limit to 6 digits
		long time = System.currentTimeMillis();
		Scanner scan = new Scanner(System.in);
		//Random read=new Random();
		System.out.println("press enter to start to run the car");		
		scan.nextLine();
		 long nowMillis = System.currentTimeMillis();
		 long seconds=(nowMillis - time) / 1000;
		 setSecond(seconds);
		
	}
	public float getMilesPerGallon()
	{
		return this.counter/this.kilowatts;
	}
	public String toString()
	{
		return super.toString()+"you have consumed "+this.kilowatts+" kilowatts, "+"miles per kilowatt is: "+getMilesPerGallon();//+date.getMonth()+"/"+date.getDay()+"/"+date.getYear();
	}

}