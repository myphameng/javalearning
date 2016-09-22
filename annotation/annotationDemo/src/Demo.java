@Author(lastChanged="21-Sep-2016, 10:53 PM")
public class Demo {
	
	public static void main(String...args) {
		Demo m = new Demo();
		Author author = m.getClass().getAnnotation(Author.class);
		if (author != null) {
			System.out.println("This demo is written by " + Author.fullName + ".");
			System.out.println("The last change he made to this demo is on " + author.lastChanged() + ".");
		}
	}
}
