
public class Class1 {
  public boolean method0(String s) {
    boolean bug = false;

    if(String.valueOf(s.charAt(0)).equals("x")) {
      if(String.valueOf(s.charAt(1)).equals("y")) {
        if(String.valueOf(s.charAt(0)).equals("x")) ;
        else bug = true;
      }
    }
    if(String.valueOf(s.charAt(9)).equals("m")) {
      if(String.valueOf(s.charAt(3)).equals("p")) {
        if(String.valueOf(s.charAt(9)).equals("m")) ;
        else bug = true;
      }
    }
    if(String.valueOf(s.charAt(8)).equals("b")) {
      if(String.valueOf(s.charAt(5)).equals("e")) {
        if(String.valueOf(s.charAt(8)).equals("b")) ;
        else bug = true;
      }
    }
    if(String.valueOf(s.charAt(2)).equals("t")) {
      if(String.valueOf(s.charAt(5)).equals("u")) {
        if(String.valueOf(s.charAt(2)).equals("t")) ;
        else bug = true;
      }
    }

    if(s.contains("pp")) {
      if(s.contains("xd")) {
        if(s.contains("pp")) ;
        else bug = true;
      }
    }
    if(s.contains("fr")) {
        if(s.contains("nn")) {
          if(s.contains("fr")) ;
          else bug = true;
        }
    }
    if(s.contains("zz")) {
      if(s.contains("rr")) {
        if(s.contains("zz")) ;
        else bug = true;
      }
    }
    if(s.contains("ik")) {
      if(s.contains("ke")) {
        if(s.contains("ik")) ;
        else bug = true;
      }
    }

    return bug;
  }

  public boolean method1(String s) {
    boolean bug = false;

    if(String.valueOf(s.charAt(0)).equals("w")) {
      if(String.valueOf(s.charAt(1)).equals("o")) {
        if(String.valueOf(s.charAt(0)).equals("w")) ;
        else bug = true;
      }
    }
    if(String.valueOf(s.charAt(9)).equals("v")) {
      if(String.valueOf(s.charAt(3)).equals("s")) {
        if(String.valueOf(s.charAt(9)).equals("v")) ;
        else bug = true;
      }
    }
    if(String.valueOf(s.charAt(8)).equals("d")) {
      if(String.valueOf(s.charAt(5)).equals("g")) {
        if(String.valueOf(s.charAt(8)).equals("d")) ;
        else bug = true;
      }
    }
    if(String.valueOf(s.charAt(2)).equals("j")) {
      if(String.valueOf(s.charAt(5)).equals("h")) {
        if(String.valueOf(s.charAt(2)).equals("j")) ;
        else bug = true;
      }
    }

    if(s.contains("pl")) {
      if(s.contains("oi")) {
        if(s.contains("pl")) ;
        else bug = true;
      }
    }
    if(s.contains("tr")) {
      if(s.contains("ee")) {
        if(s.contains("tr")) ;
        else bug = true;
      }
    }
    if(s.contains("fy")) {
      if(s.contains("wa")) {
        if(s.contains("fy")) ;
        else bug = true;
      }
    }

    if(s.contains("gg")) {
      if(s.contains("ju")) {
        if(s.contains("gg")) ;
        else bug = true;
      }
    }

    return bug;
  }
}
