/**
 * CS2030S Lab 5
 * AY22/23 Semester 2
 *
 * @author Justin Cheah Yun Fei
 */

package cs2030s.fp;

public interface Transformer<T, U> {
  public abstract U transform(T content);
}

