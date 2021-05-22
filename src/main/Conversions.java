package main;

public class Conversions {
	double Tea;
	double Table;
	double Cup;
	double Feet;
	double Meter;
	double Kilometer;
	double Mile;
	
	//Volume Conversions
	//teaspoons to tablespoons
	public void teatot(){
		double Table = Tea/3;
		System.out.println(Table + " Tablespoons in " + Tea + " teaspoons.");
    }
	//tablespoons to teaspoons
	public void tabletot(){
		double Tea = Table/3;
        System.out.println(Tea + " teaspoons in " + Table + " Tablespoons.");
    }
	//teaspoons to Cups
	public void teatoC(){
		double Cup = Tea/48;
		System.out.println(Cup + " Cups in " + Tea + " teaspoons.");
    }
	//Tablespoons to Cups
	public void tabletoC(){
		double Cup = Table/16;
		System.out.println(Cup + " Cups in " + Table + " Tablespoons.");
    }
	//Cups to teaspoons
		public void Cuptotea(){
			double Tea = Cup*48;
	        System.out.println(Tea + " teaspoons in " + Cup + " Cups.");
	}
	//Cups to tablespoons
		public void Cuptotable(){
			double Table = Cup*16;
			System.out.println(Table + " Tablespoons in " + Cup + " Cups.");
			}
		
		
		//Distance Conversions
	//Convert Feet to Meters
		public void FeettoM(){
			double Meter = Feet/3.281;
	        System.out.println(Meter + " meters in " + Feet + " feet.");
	}
	//Convert Meters to Feet
		public void MetertoF(){
			double Feet = Meter*3.281;
	        System.out.println(Feet + " feet in " + Meter + " meters.");
	}
	//Convert Miles to Kilometers
		public void Milestokilo(){
			double Kilometer = Mile/1.609;
	        System.out.println(Kilometer + " kilometers in " + Mile + " miles.");
	}
		//Convert Kilometers to Miles
		public void KilotoM(){
			double Mile = Kilometer*1.609;
	        System.out.println(Mile + " miles in " + Kilometer + " kilometers.");
	}
		// Convert Feet to Miles
		public void FeettoMile(){
			double Mile = Feet/5280;
	        System.out.println(Mile + " miles in " + Feet + " feet.");
	}
		//Miles to Feet
		public void MiletoFeet(){
			double Feet = Mile*5280;
	        System.out.println(Feet + " Feet in " + Mile + " miles.");
	}
}
