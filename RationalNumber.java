public class RationalNumber extends Number{

  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    if (deno == 0){
      numerator = 0;
      denominator = 1;
    }
    else if (deno < 0){
      numerator = -nume;
      denominator = -deno;
      reduce();
    }
    else{
      numerator = nume;
      denominator = deno;
      reduce();
    }
  }

  public double getValue(){
    return (double) numerator / denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    return new RationalNumber(denominator, numerator);
  }

  public boolean equals(RationalNumber other){
    return (getNumerator() == other.getNumerator() || getDenominator() == other.getDenominator());
  }

  public String toString(){
    if (getDenominator() == 1) return "" + getNumerator();
    return numerator + "/" + denominator;
  }

  private static int gcd(int a, int b){
    if (a == 0 || b == 0) return 1;
    for (int gcd = Math.abs(Math.min(a,b)); gcd > 0; gcd--){
      if (a % gcd == 0 && b % gcd == 0){
        return gcd;
      }
    }
    return 1;
  }

  private void reduce(){
    int gcd = gcd(numerator, denominator);
    numerator /= gcd;
    denominator /= gcd;
  }

  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber(getNumerator() * other.getNumerator(), getDenominator() * other.getDenominator());
  }

  public RationalNumber divide(RationalNumber other){
    return new RationalNumber(getNumerator() * other.getDenominator(), getDenominator() * other.getNumerator());
  }

  public RationalNumber add(RationalNumber other){
    return new RationalNumber(getNumerator() * other.getDenominator() + other.getNumerator() * getDenominator(), getDenominator() * other.getDenominator());
  }

  public RationalNumber subtract(RationalNumber other){
    return new RationalNumber(getNumerator() * other.getDenominator() - other.getNumerator() * getDenominator(), getDenominator() * other.getDenominator());
  }

}
