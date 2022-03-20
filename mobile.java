package week1.day1;

public class mobile {
	
	String MobileModel="OPPO";
	float MobileWeight=100.5f;
	boolean IsFullyCharged=true;
	int MobileCost= 50000;
	
	public void makeCall()
	{
		System.out.println("Make Call");
	}
	public void sendMsg()
	{
		System.out.println("Send Message");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		
		mobile obj=new mobile();
		obj.makeCall();
		obj.sendMsg();
		System.out.println(obj.MobileModel);
		System.out.println(obj.MobileWeight);
		System.out.println(obj.IsFullyCharged);
		System.out.println(obj.MobileCost);

	}

}
