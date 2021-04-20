package org.ghutchis.mod2;

import org.ghutchis.mod1.*;

public class module2
{
   public static void hello() {
     module1.hello();
     System.out.println("This is mod2");
   }
}
