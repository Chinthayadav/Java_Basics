package com.fresher_level.java_Access_Modifier_public;

/*Access the public methods and fields from any class in the same package or different 
package*/
import com.fresher_level.java_Access_Modifier.Publicclass_modifier;

public class Public_access {

	public static void main(String[] args) {

		Publicclass_modifier pd = new Publicclass_modifier();
		int result = pd.getSum(10, 20);
		System.out.println(result);

	}

}
