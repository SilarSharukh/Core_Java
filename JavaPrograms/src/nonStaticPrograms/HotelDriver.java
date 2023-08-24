package nonStaticPrograms;

public class HotelDriver {
public static void main(String[] args) {
	Hotel h1= new Hotel();
	h1.setProperty("Taj Mahal Palace Hotel.","Tata Group.","Colaba, Mumbai.","07AAACT3957G3Z7.");
	h1.display();
	System.out.println("********************************************************************************");
	Hotel h2= new Hotel();
	h2.setProperty("The Oberoi.","Oberoi Group.","Bengaluru.","29AAACE6898B1ZE.");
	h2.display();
	System.out.println("********************************************************************************");
	Hotel h3= new Hotel();
	h3.setProperty("The Leela.","Brookfield Corporation.","Mumbai.","24AAOFT9472B1ZX.");
	h3.display();
	System.out.println("********************************************************************************");
	Hotel h4= new Hotel();
	h4.setProperty("Lemon Tree Hotel.","Patanjali Keswani.","HJyderabad.","36AACCK1698R3ZO.");
	h4.display();
	System.out.println("********************************************************************************");
	Hotel h5= new Hotel();
	h5.setProperty("Hyderabad Marriott Hotel & Convention Centre.","Marriott Group.","Hyderabad.","27AABCM0274G1ZP in.");
	h5.display();
	System.out.println("********************************************************************************");
	argument();
}
public static void argument()
{

	Hotel h1= new Hotel("Taj Mahal Palace Hotel.","Tata Group.","Colaba, Mumbai.","07AAACT3957G3Z7.");
	h1.display();
	System.out.println("********************************************************************************");

	Hotel h2= new Hotel("The Oberoi.","Oberoi Group.","Bengaluru.","29AAACE6898B1ZE.");
	h2.display();
	System.out.println("********************************************************************************");
	
	Hotel h3= new Hotel("The Leela.","Brookfield Corporation.","Mumbai.","24AAOFT9472B1ZX.");
	h3.display();
	System.out.println("********************************************************************************");
	
	Hotel h4= new Hotel("Lemon Tree Hotel.","Patanjali Keswani.","HJyderabad.","36AACCK1698R3ZO.");
	h4.display();
	System.out.println("********************************************************************************");
	
	Hotel h5= new Hotel("Hyderabad Marriott Hotel & Convention Centre.","Marriott Group.","Hyderabad.","27AABCM0274G1ZP in.");
	h5.display();
	
}
}
