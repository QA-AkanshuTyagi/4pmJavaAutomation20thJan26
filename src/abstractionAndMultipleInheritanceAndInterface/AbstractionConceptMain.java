package abstractionAndMultipleInheritanceAndInterface;

public class AbstractionConceptMain implements MultipleInheritance4 {

	public static void main(String[] args) {

		MultipleInheritance4 vvv= new AbstractionConceptMain();
		vvv.fb();
		vvv.twitter();
		vvv.instagram();
	}

	@Override
	public void fb() {
		System.out.println("hello I am fb");

	}

	@Override
	public void twitter() {
		System.out.println("hello I am twitter");

	}

	@Override
	public void instagram() {
		System.out.println("hello I am instagram");

	}

}
