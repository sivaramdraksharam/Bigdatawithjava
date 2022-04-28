
public class Birddemo {

	public Birddemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird p=new Bird();
		p.birdName="Parrot";
		p.sing();
		Bird k=new Bird();
		k.birdName="Cokoo";
		k.setSingStatus(true);
		k.sing();
	}

}
