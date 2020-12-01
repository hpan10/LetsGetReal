public abstract class Number{

  public abstract double getValue();

  public boolean equals(Number other){
    if (getValue() == 0 || other.getValue() == 0){
      return (getValue() == other.getValue());
    }
    double difference = Math.abs(getValue() - other.getValue());
    double average = (getValue() + other.getValue()) / 2;
    double percentDifference = difference / average;
    return percentDifference <= .00001;
  }

  public int compareTo(Number other){
    if (equals(other)) return 0;
    if (getValue() > other.getValue()) return 1;
    return -1;
  }

}
