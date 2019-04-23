package org.gradle.poetry;

import java.util.*;

public class Poetry {

  public List<String> caesar()
  {
    List<String> lines = new ArrayList<String>();
    lines.add("Infamy! They've all got it infamy!");
    lines.add("veni vidi vici");
    lines.add("blah blah blah");
    return lines;
  }

// iterate through all lines
  public void emit(List<String> lines) {
    for (String line: lines) {
      //System.out.println(Codec.encode(line));
      System.out.println(line);
    }
  }

  public static void main(String[] args) {
    Poetry p = new Poetry();

    p.emit(p.caesar());
  }
}
