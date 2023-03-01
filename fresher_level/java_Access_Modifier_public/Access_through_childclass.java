package com.fresher_level.java_Access_Modifier_public;

/*Also, Access the PROTECTED fields and methods from child class located in a different 
package*/
/*Access the PROTECTED fields and methods from any class in different package*/
import com.fresher_level.java_Access_Modifier.Protected_modifier;

public class Access_through_childclass extends Protected_modifier {

	public static void main(String[] args) {
		Protected_modifier pm = new Protected_modifier();

		// pm.methodOne; it gives compile errors methodOne has protected
		// pm.number;

	}

}
