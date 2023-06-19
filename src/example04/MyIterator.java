package example04;

public interface MyIterator {
  /**
   * Возвращает следующий элемент массива
   * @return элемент, который стоит после итератора
   */
  int next();

  /**
   * Проверяет, есть ли следующий элемент
   * @return <code>true</code>, если следующий элемент есть, <code>false</code> - в противном случае
   */
  boolean hasNext();
}