package src.hotel;

public class TrippleRoom extends Room {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// private boolean reerved;
	// public String type;
	public void setReserved(boolean reerved) {
		this.reserved = reerved;
	}

	public boolean isReserved() {
		return reserved;
	}

	public void setGest(int gest) {
		if (gest > 3)
			System.out.println("The numer of people is more than the capasity");
	}

	public String toString() {

		String s = ("the rom number is:" + roomnumber + "\n"
				+ "the floor number is:" + floor + "\n"
				+ "the price of single room is:" + price);
		return s;
	}
	
	public TrippleRoom(int r_no,int floor,boolean reserved,String type, double price2)
	{
		roomnumber = r_no;
		this.floor = floor;
        this.reserved=reserved;
        this.type=type;
        id = Room.k;
        Room.k++;
	}

	@Override
	public double calculateprice() {
		return (price * roomnumber);
	}

}
