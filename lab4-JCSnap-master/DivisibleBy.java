/**
 * A boolean condition with an integer parameter y that can be 
 * apply to another integer x.  Returns true if x is divisible 
 * by y, false otherwise.
 * CS2030S Lab 4
 * AY22/23 Semester 2
 *
 * @author Put Your Name (Lab Group)
 */

public class DivisibleBy implements BooleanCondition<Integer> {
  private int i;

  public DivisibleBy(Integer i) {
    this.i = i;
  }
  
  @Override
  public boolean test(Integer content) {
    return content % this.i == 0;
  }
}


