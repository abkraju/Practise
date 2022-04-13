
class Personal {
	private String Name;
	private int DoorNum;
	private String StreetName;
	private String Area;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getDoorNum() {
		return DoorNum;
	}

	public void setDoorNum(int doorNum) {
		DoorNum = doorNum;
	}

	public String getStreetName() {
		return StreetName;
	}

	public void setStreetName(String streetName) {
		StreetName = streetName;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}
}
	public class EncapsulationPersonal {
		public static void main(String[] args) {
			Personal p = new Personal();
			p.setName("Raj");
			p.setDoorNum(11);
			p.setStreetName("CAK Road");
			p.setArea("Karur");
			System.out.println(p.getName());
			System.out.println(p.getDoorNum());
			System.out.println(p.getStreetName());
			System.out.println(p.getArea());
		}
	}
