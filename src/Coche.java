public class Coche {

    private String modelo;
    private String marca;
    private String matricula;
    private int potencia;

    //Constructor por defecto.
    public Coche(){
        this.modelo = "Focus";
        this.marca = "Ford";
        this.matricula = "3664HJW";
        this.potencia = 150;
    }

    //Constructor personalizable.
    public Coche(String modelo, String marca, String matricula, int potencia){
        this.modelo = modelo;
        this.marca = marca;
        this.matricula = matricula;
        this.potencia = potencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    //Para poder comprobar los datos devueltos.
    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", matricula='" + matricula + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
