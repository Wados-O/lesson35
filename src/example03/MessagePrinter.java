package example03;

import java.time.LocalDate;

public class MessagePrinter {
  private Out out;

  public MessagePrinter(Out out) {
    this.out = out;
  }

  public void print(String message) {
    out.out(LocalDate.now() + " " + message);
  }
}
