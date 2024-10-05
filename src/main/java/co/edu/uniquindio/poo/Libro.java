package co.edu.uniquindio.poo;

import java.time.LocalDate; 

public class Libro {
    private String codigo;
    private String isbn;      
    private String autor;
    private String titulo;
    private String editorial;
    private LocalDate fecha;  
    private int stock;

    public Libro(String codigo, String isbn, String autor, String titulo, String editorial, LocalDate fecha, int stock) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
        this.fecha = fecha;
        this.stock = stock;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public LocalDate getFecha() {  
        return fecha;
    }
    public void setFecha(LocalDate fecha) {  
        this.fecha = fecha;
    }
    public int getstock() {
        return stock;
    }
    public void setstock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Codigo : " + codigo + ", isbn : " + isbn + ", autor : " + autor + ", titulo : " + titulo + ", editorial : "
                + editorial + ", fecha : " + fecha + ", stock : " + stock+"\n";
    }
    
}

