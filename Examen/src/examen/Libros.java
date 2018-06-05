/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author ESFOT
 */
public class Libros {

    private String Titulo;
    private Autor autor;
    private int anio;
    boolean Favorito;

    public Libros(String Titulo, Autor autor, int anio, boolean Favorito) {
        this.Titulo = Titulo;
        this.autor = autor;
        this.anio = anio;
        this.Favorito = Favorito;
    }

    public Libros(boolean Favorito) {
        this.Favorito = Favorito;
    }

    public boolean isFavorito() {
        return Favorito;
    }

    public void setFavorito(boolean Favorito) {
        this.Favorito = Favorito;
    }

    Libros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Libros(String Titulo, Autor autor, int anio) {
        this.Titulo = Titulo;
        this.autor = autor;
        this.anio = anio;
    }

    @Override
    public String toString() {
        String stringLibros = "Libros{" + "Titulo=" + Titulo + ", autor=" + autor + ", anio=" + anio + ", Favorito=" + Favorito + '}';
        return stringLibros;
    }

}
