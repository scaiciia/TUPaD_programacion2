/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej1;

/**
 *
 * @author Santiago Caiciia Massello
 */
public class MainStock {
    public static void main(String[] args) {
        // Crear inventario
        Inventario inventario = new Inventario();
        
        // 1. Crear al menos cinco productos con diferentes categorías
        Producto p1 = new Producto("P001", "Arroz", 800, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Smartphone", 2500, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Camiseta", 1200, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Sartén", 1800, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Leche", 500, 40, CategoriaProducto.ALIMENTOS);
        
        // Agregar productos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        System.out.println("\n" + "=".repeat(50));
        
        // 2. Listar todos los productos
        inventario.listarProductos();
        
        // 3. Buscar un producto por ID
        System.out.println("BUSCAR PRODUCTO POR ID:");
        Producto productoEncontrado = inventario.buscarProductoPorId("P002");
        if (productoEncontrado != null) {
            productoEncontrado.mostrarInfo();
        }
        
        // 4. Filtrar por categoría específica
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        
        // 5. Eliminar un producto por ID
        inventario.eliminarProducto("P001");
        inventario.listarProductos();
        
        // 6. Actualizar stock
        inventario.actualizarStock("P003", 25);
        
        // 7. Mostrar total de stock
        System.out.println("Total de stock disponible: " + inventario.obtenerTotalStock());
        
        // 8. Obtener producto con mayor stock
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("Producto con mayor stock:");
            mayorStock.mostrarInfo();
        }
        
        // 9. Filtrar productos por precio
        inventario.filtrarProductosPorPrecio(1000, 3000);
        
        // 10. Mostrar categorías disponibles
        inventario.mostrarCategoriasDisponibles();
    }
}
