package hometasks.calculator;

public class Scalar extends Var {
    private Double result;

    public Double getResult() {
        return result;
    }

    public Scalar(Double value) {
        this.result = value;
    }

    public Scalar(Scalar scalar) {
        this.result = scalar.result;
    }

    public Scalar(String strScalar) {
        this.result = Double.parseDouble(strScalar);
    }

    @Override
    public String toString() {
        return "Scalar{" +
                "result=" + result +
                '}';
    }


    public Var addition(Var double1) {
        if (double1 instanceof Scalar) {
            System.out.println(result + ((Scalar) double1).getResult());
        }
        return null;
    }


    public Var subtraction(Var double1) {
        if (double1 instanceof Scalar) {
            System.out.println(result - ((Scalar) double1).getResult());
        }
        return null;
    }


    public Var multiplication(Var double1) {
        if (double1 instanceof Scalar) {
            System.out.println(result * ((Scalar) double1).getResult());
        }
        return null;
    }


    public Var division(Var double1) {
        if (double1 instanceof Scalar) {
            System.out.println(result / ((Scalar) double1).getResult());
        }
        return null;
    }
}