package animal.shelter;

public class AnimalShelter {
  String shelterName;
  Queue dogQueue;
  Queue catQueue;

  public AnimalShelter(String shelterName){
    this.shelterName = shelterName;
    this.dogQueue = new Queue();
    this.catQueue = new Queue();
  }
  public boolean acceptAnimal(Animal animal){
    if(animal.getClass().getSimpleName() == "Dog") {
      if(dogQueue.enqueue(animal)){
        return true;
      };
    }
    if(animal.getClass().getSimpleName() == "Cat"){
      if(catQueue.enqueue(animal)){
        return true;
      }
    }
    return false;
  }

  public Animal adoptDog(){
    Animal dog = dogQueue.dequeue();
      return dog;
  }

  public Animal adoptCat(){
    Animal cat = catQueue.dequeue();
    return cat;
  }
  public Animal adoptAny(){
    if (dogQueue.count >= catQueue.count){
      return dogQueue.dequeue();
    } else {
      return catQueue.dequeue();
    }
  }
}
