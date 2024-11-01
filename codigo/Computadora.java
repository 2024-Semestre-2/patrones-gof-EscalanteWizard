package codigo;

// Producto final: Computadora
public class Computadora {
    private String CPU;
    private String RAM;
    private String almacenamiento;
    private String tarjetaGrafica;

    // Constructor privado para usar el builder
    Computadora(ComputadoraBuilder builder) {
        this.CPU = builder.getCPU();
        this.RAM = builder.getRAM();
        this.almacenamiento = builder.getAlmacenamiento();
        this.tarjetaGrafica = builder.getTarjetaGrafica();
    }

    @Override
    public String toString() {
        return "Computadora [CPU=" + CPU + ", RAM=" + RAM + ", Almacenamiento=" 
               + almacenamiento + ", Tarjeta Grafica=" + tarjetaGrafica + "]";
    }

    // Interfaz Builder
    public interface ComputadoraBuilder {
        void buildCPU();
        void buildRAM();
        void buildAlmacenamiento();
        void buildTarjetaGrafica();
        String getCPU();
        String getRAM();
        String getAlmacenamiento();
        String getTarjetaGrafica();
        Computadora build(); // Metodo para crear la computadora
    }
}

// Builder concreto para Computadora de Oficina
class ComputadoraOficinaBuilder implements Computadora.ComputadoraBuilder {
    private String CPU;
    private String RAM;
    private String almacenamiento;
    private String tarjetaGrafica;

    public void buildCPU() {
        CPU = "Intel i5";
    }

    public void buildRAM() {
        RAM = "8GB";
    }

    public void buildAlmacenamiento() {
        almacenamiento = "256GB SSD";
    }

    public void buildTarjetaGrafica() {
        tarjetaGrafica = "Integrada";
    }

    public String getCPU() { return CPU; }
    public String getRAM() { return RAM; }
    public String getAlmacenamiento() { return almacenamiento; }
    public String getTarjetaGrafica() { return tarjetaGrafica; }

    public Computadora build() {
        return new Computadora(this);
    }
}

// Builder concreto para Computadora Gamer
class ComputadoraGamerBuilder implements Computadora.ComputadoraBuilder {
    private String CPU;
    private String RAM;
    private String almacenamiento;
    private String tarjetaGrafica;

    public void buildCPU() {
        CPU = "AMD Ryzen 9";
    }

    public void buildRAM() {
        RAM = "32GB";
    }

    public void buildAlmacenamiento() {
        almacenamiento = "1TB SSD";
    }

    public void buildTarjetaGrafica() {
        tarjetaGrafica = "NVIDIA RTX 3080";
    }

    public String getCPU() { return CPU; }
    public String getRAM() { return RAM; }
    public String getAlmacenamiento() { return almacenamiento; }
    public String getTarjetaGrafica() { return tarjetaGrafica; }

    public Computadora build() {
        return new Computadora(this);
    }
}

// Clase Director que guia la construccion paso a paso
class Director {
    private Computadora.ComputadoraBuilder builder;

    public Director(Computadora.ComputadoraBuilder builder) {
        this.builder = builder;
    }

    public Computadora construirComputadora() {
        builder.buildCPU();
        builder.buildRAM();
        builder.buildAlmacenamiento();
        builder.buildTarjetaGrafica();
        return builder.build();
    }
}
