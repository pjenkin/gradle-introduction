package org.gradle.poetry

public class Poetry {

  public List caesar()
  {
    List<String> lines = new ArrayList<String>();
    lines.add("Infamy! They've all got it infamy!");
    lines.add("veni vidi vici");
    lines.add("blah blah blah");
    return lines;
  }

  public void emit(List<String> lines) {
    for (String line: lines) {
      System.out.println(codec.encode(line));
    }
  }

  public static void main(String[] args) {
    Poetry p = new Poetry();

    p.emit(p.caesar());
  }
}
