// access/cookie2/CookieMonster.java
// TIJ4 Chapter Access, Exercise 4, page 227
// Show that protected methods have package access but are not public.

/* In directory Cookie2:
* //access/cookie2/Cookie.java
* //Creates a library
* package access.cookie2;
*
* public class Cookie {
*	public Cookie() {
*		System.out.println("Cookie contstructor");
*	}
*	protected void bite() { System.out.println("bite"); }
* }
*/

package access.cookie2;

public class CookieMonster {
	public static void main(String[] args) {
		Cookie x = new Cookie();
		x.bite(); // package access to protected method
	}	
}