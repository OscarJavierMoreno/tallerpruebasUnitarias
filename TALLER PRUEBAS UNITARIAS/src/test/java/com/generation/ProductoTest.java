package com.generation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest
{
    @Test
    void precioDebeSerElMismoDelConstructor()
    {
        //El precio de un producto es el que se pasó al constructor
        Producto producto = new Producto("Empanada Infinita",
                5000, 10);

        double precio = producto.getPrecio();

        assertEquals(5000, precio);
    }

    @Test
    void stockMayorACeroEstaDisponible()
    {
        /* Un producto con stock mayor a cero está disponible
          (estaDisponible() devuelve true).*/
        Producto producto = new Producto("Empanada Feliz",
                5000, 5);

        boolean disponible = producto.estaDisponible();
        assertTrue(disponible);
    }

    @Test
    void stockIgualCeroNoDisponible()
    {
        //Un producto con stock igual a cero no está disponible.
        Producto producto = new Producto("Perro caliente", 7000, 0);

        boolean disponible = producto.estaDisponible();
        assertFalse(disponible);
    }

    @Test
    void reducirStockCantidadValida()
    {
        //Después de reducir el stock en una cantidad válida, el stock disminuye correctamente.
        Producto producto = new Producto("Bandeja paisa galactica", 10000, 5);

        producto.reducirStock(2);
        int stock = producto.getStock();

        assertEquals(2, stock);
    }
}
