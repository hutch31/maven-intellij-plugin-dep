package org.ghutchis.mod3;

import org.ghutchis.mod1.*;
import org.ghutchis.mod2.*;

/**
 * Hello world!
 *
 */
public class module3
{
  public static void hello() {
    module1.hello();
    module2.hello();
    System.out.println("This is mod3");
  }

  public static void main( String[] args )
  {
      hello();
  }
}
