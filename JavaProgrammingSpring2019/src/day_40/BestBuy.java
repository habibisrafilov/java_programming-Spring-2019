package day_40;

public class BestBuy {
		
		public static void main(String[] args) {
			
			// System.out.println(brand);   this line will not work . we need to create object to use brand
			// create CellPhone object
			
			CellPhone cell1 = new CellPhone();
			
			System.out.println(cell1.brand);
			System.out.println(cell1.screenSize);
			System.out.println(cell1.color);
			System.out.println(cell1.price);
			
			cell1.brand = "Nokia 6300";
			cell1.screenSize = 2.0;
			cell1.color = "Silver";
			cell1.price = 76.20;
			
			System.out.println(cell1.brand);
			System.out.println(cell1.screenSize);
			System.out.println(cell1.color);
			System.out.println(cell1.price);
			
			
			CellPhone cell2 = new CellPhone();
			cell2.brand = "Siemens";
			cell2.screenSize = 1.5;
			cell2.color = "blue";
			cell2.price = 39.22;
			
			System.out.println("#######Cell 2 values#########");
			
			
			System.out.println(cell2.brand);
			System.out.println(cell2.screenSize);
			System.out.println(cell2.color);
			System.out.println(cell2.price);
			
			System.out.println("****  cell 3 values ******");
			CellPhone cell3 = new CellPhone();
			cell3.brand = "Iphone";
			cell3.screenSize = 6.2;
			cell3.color = "white";
			cell3.price = 800;
			
			System.out.println(cell3.brand);
			System.out.println(cell3.screenSize);
			System.out.println(cell3.color);
			System.out.println(cell3.price);
			
			
			System.out.println("##### Number 1 CALLING METHODS#####");
			cell1.call();
			cell1.message();
			cell1.takePhoto();
			System.out.println();
			System.out.println("##### Number 2 CALLING METHODS#####");
			cell2.call();
			cell2.message();
			cell2.takePhoto();
			System.out.println();
			System.out.println("##### Number 3 CALLING METHODS#####");
			cell3.call();
			cell3.message();
			cell3.takePhoto();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

}
