package classifications;

public class encap {
	public static void main(String[] args) {
		book b=new book("Gamalesh","cg@gmail.com",'M',"comma",200.0,8);
		System.out.println("Author Name:"+b.getAname());
		System.out.println("Email:"+b.getEmail());
		System.out.println("Gender:"+b.getgender());
		System.out.println("Book Name:"+b.getBname());
		System.out.println("Price:"+b.getPrice());
		System.out.println("Quantity in Stock:"+b.getQtyInStock());
	}

}
