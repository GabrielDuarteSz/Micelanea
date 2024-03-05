package co.edu.sena.oop;

public class Data {
    // metodos generales

    public double areaTriangulo(double num1, double num2){
        return (num1 * num2) / 2;

    }
    public double sumarDosnumeros(double num1, double num2){
        return (num1 + num2);
    }

    public double elevadoCuadrado( double num1){
        return Math.pow(num1,2);
    }

    public double eurosADolares(double num1){
        return num1 * 1.09;
    }

    public double areaCuadrado(double num1){
        return Math.pow(num1,2);
    }
    public double perimetroCuadrado(double num1){
        return num1 * 4;
    }
    public double areaCilindro(double num1, double num2){
        return ((2*3.1415)*num1)*(num1+num2);
    }
    public double volumenCilindro(double num1, double num2){
        return 3.1415*Math.pow(num1,2)*num2;
    }
    public double areaCirculo(double num1){
        return 3.1415*(Math.pow((num1/2),2));
    }
    public double radioCirculo(double num1){
        return num1 ;
    }
    public double promedio(double num1, double num2, double num3){
        return (num1+num2+num3)/3;
    }
}
