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
     return true;
   }

  public String toString(){
    return ""+value;
  }
}