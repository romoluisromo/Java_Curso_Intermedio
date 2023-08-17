package area;

public class Rectangulo {
    
    private int base, altura, area;
    
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    public void CalculoArea(){
        area = base * altura;
    }
    
    public void Imprimir(){
        CalculoArea();
        System.out.print("El área del rectangulo es: " + area);
    }

}
