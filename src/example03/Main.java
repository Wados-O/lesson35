package example03;

public class Main {
  public static void main(String[] args) {
    ErrorOutImpl errorOut = new ErrorOutImpl();
    StandardOutImpl standardOut = new StandardOutImpl();

    MessagePrinter printer = new MessagePrinter(errorOut);
    printer.print("Marsel");
  }
}
