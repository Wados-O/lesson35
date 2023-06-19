package example03;

public class ErrorOutImpl implements Out {
  public void out(String message){
    System.err.println(message);
  }
}
