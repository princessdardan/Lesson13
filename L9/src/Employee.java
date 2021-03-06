   
    public abstract class Employee {
	protected String name;
	protected double rate;
	protected int hours;	
        public static double LOW_RATE = 6.75;
        public static double HIGH_RATE = 30.50;
        public static double LOW_HOURS = 1;
        public static double HIGH_HOURS = 60;
        protected static double totalPay = 0;
        
	public Employee() {
	 name = "";
	 rate = 0;
	 hours = 0;	
	}

	public static String getNameRules() {
	 	return "Must be nonblank";
	}	

	public static String getRateRules() {
		return "Must be between 6.75 and 30.50, Inclusive";
	}

	
	public static String getHoursRules() {
		return "Must be between 1 and 60, Inclusive";
	}

        public static double getTotalPay(){
            return totalPay;
        }
        
	public boolean setName(String nm) {
		if (nm.equals(""))
			return false;
		else{
			name=nm;
			return true;
                }
        }
	public boolean setRate(double rt) {
		if (rt < 6.75 || rt > 30.50)
			return false;
		else{
			rate=rt;
			return true;
		}
	}
	public boolean setHours(int hrs) {
		if (hrs < 1 || hrs > 60)
			return false;
		else{
			hours=hrs;
			return true;
		}
	}
	public String getName() {
		return name;
	}
        public abstract double getPay();
}
