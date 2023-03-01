package com.fresher_level.java_this_super;

/*Call constructor of the current class using this()
4. Call argument constructor of current class using this() */
class Book {
	float cost;
	int pages;

	Book(float cost, int pages) {
		// cost=cost; result 0
		// pages=pages; result 0
		this.cost = cost;
		this.pages = pages;
	}

	/* Use this() and super() in methods not in constructor */
	void display() {
		System.out.println(this.cost);
		System.out.println(this.pages);

	}
}

public class Java_This {

	public static void main(String[] args) {
		Book b = new Book(12.344f, 100);
		b.display();
	}

}
