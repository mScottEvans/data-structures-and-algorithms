package animal.shelter;

public class Queue {
  protected Animal front;
  protected Animal rear;
  private boolean isEmpty;

  int count = 0;

  public Queue() {
    this.front = null;
    this.rear = null;
    isEmpty = true;

  }

  public boolean enqueue(Animal animal) {


    try {
      if (this.rear == null) {
        this.rear = animal;
        this.front = this.rear;
      } else {
        rear.next = animal;
        rear = animal;
      }
      this.isEmpty();
      count++;
      return true;

    } catch (Exception ex) {
      System.out.println("Something went wrong: " + ex.getMessage());
    }

    return false;
  }

  public Animal dequeue() {
    if (front != null) {
      Animal temp = front;
      front = front.next;
      temp.next = null;
      this.isEmpty();
      count--;
      return temp;
    }

    return null;
  }

  public String peek() throws NullPointerException {
    return front.name;
  }

  public boolean isEmpty() {
    // getter-setter method for this.isEmpty property
    this.isEmpty = this.front == null;
    return this.isEmpty;
  }

  @Override
  public String toString() {
    // must iterate through existing Animals and display their values as a single string

    Animal animal = front;
    StringBuilder stringBuilder = new StringBuilder();

    while (animal != null) {
      stringBuilder.append("[").append(animal.name).append("]");
      animal = animal.next;
      if (animal != null) {
        stringBuilder.append("->");
      }
    }

    stringBuilder.append("->NULL");
    return stringBuilder.toString();
  }

}
