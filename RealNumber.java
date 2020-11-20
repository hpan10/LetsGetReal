public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public RealNumber add(RealNumber other){
    return new RealNumber(getValue() + other.getValue());
  }

  public RealNumber subtract(RealNumber other){
    return new RealNumber(getValue() - other.getValue());
  }

  public RealNumber multiply(RealNumber other){
    return new RealNumber(getValue() * other.getValue());
  }

  public RealNumber divide(RealNumber other){
    return new RealNumber(getValue() / other.getValue());
  }

  public boolean equals(RealNumber other){
    if (getValue() == 0 || other.getValue() == 0){
      return (getValue() == other.getValue());
    }
    double difference = Math.abs(subtract(other).getValue());
    double average = add(other).getValue() / 2;
    double percentDifference = difference / average;
    return percentDifference <= .001;
  }

  public String toString(){
    return "" + value;
  }
}
