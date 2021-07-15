class Phone{
	int price = 5000;
	String name = "G21";
	static String company = "Samsung";

	public void ring(){
		System.out.println("벨이 울려요");
	}
	public static void main(String[] args){
		Phone p1 = new Phone();
		p1.company = "Lg";
		company = "Motor";

		Phone p2 = new Phone();
		p2.company = "Sambo";

		System.out.println(p1.company);
	}
}