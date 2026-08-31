public class deportista{
    private String nombre;
    private int edad;
    private String categoria;
    private int resultado;

    public deportista(String nombre, int edad, String categoria, int resultado) {
        this.nombre = nombre;
        this.edad = edad;
        this.categoria = categoria;
        this.resultado = resultado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getResultado() {
        return resultado;
    }
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}