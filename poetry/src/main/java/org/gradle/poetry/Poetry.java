
package org.gradle.poetry;
// must mirror path below default Maven structure src/main/java
// so that org.gradle.xyzapp is the usual directory structure for Gradle
// NB the build.gradle, up the tree will refer to this package in classPath e.g. 'org.gradle.poetry.Poetry


import java.util.ArrayList;
import java.util.List;
import org.apache.commons.codec.binary.Base64;

public class Poetry {

  public List<String> caesar()
  {
    List<String> lines = new ArrayList<String>();
    lines.add("Infamy! Infamy! They've all got it infamy!");
    lines.add("veni vidi vici");
    lines.add("blah blah blah");
    return lines;
  }

public String encode(String text)
{
  Base64 codec = new Base64();
  return new String(codec.encode(text.getBytes()));
}

// iterate through all lines
  public void emit(List<String> lines) {
    for (String line: lines) {
      //System.out.println(codec.encode(line));
      System.out.println(line);
    }
  }

  public static void main(String[] args) {
    Poetry p = new Poetry();

    System.out.println("Start");
    p.emit(p.caesar());
    System.out.println("Finish");
  }
}
