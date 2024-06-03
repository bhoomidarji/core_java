package come.p1;

public class NonDerived {
public NonDerived()
{
	Protection p=new Protection();
	System.out.println("NonDerived's default constructor");
	System.out.println("n : "+p.n);
	System.out.println("n_pub : "+p.n_pub);
	System.out.println("n_pro : "+p.n_pro);
	//System.out.println("n_pri : "p.n_pri);
}
}
