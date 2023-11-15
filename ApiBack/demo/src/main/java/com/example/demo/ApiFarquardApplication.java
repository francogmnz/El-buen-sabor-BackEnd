package com.example.demo;

import com.example.demo.entities.Factura;
import com.example.demo.entities.Producto;
import com.example.demo.entities.RubroProducto;
import com.example.demo.repository.FacturaRepository;
import com.example.demo.repository.ProductoRepository;
import com.example.demo.repository.RubroProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;

@SpringBootApplication
public class ApiFarquardApplication {
	@Autowired
	ProductoRepository productoRepository;
	@Autowired
	RubroProductoRepository rubroProductoRepository;
	public static void main(String[] args) {
		SpringApplication.run(ApiFarquardApplication.class, args);
		System.out.println("Corriendo mi proyecto Api");
	}

	@Bean
	CommandLineRunner init() {
		return args -> {
			System.out.println("Funciona!");

			Producto producto = Producto.builder()
					.costo(BigDecimal.valueOf(3000))
					.precioVenta(BigDecimal.valueOf(4500))
					.tiempoEstimadoCocina(45)
					.urlImagen("https://www.pequerecetas.com/wp-content/uploads/2013/07/hamburguesas-caseras-receta.jpg")
					.descripcion("Inigualable pan con semillas de sésamo, tres medallones de carne 100% vacuna, tres fetas de nuestro exclusivo Queso Cheddar, cebolla, lechuga y tomate frescos. Sumado a estos ingredientes la única e inigualable Salsa Tasty")
					.denominacion("Grand Tasty Turbo Bacon Triple").
					build();
			Producto producto1 = Producto.builder()
					.costo(BigDecimal.valueOf(2000))
					.precioVenta(BigDecimal.valueOf(3500))
					.tiempoEstimadoCocina(45)
					.urlImagen("https://img.freepik.com/fotos-premium/pizza-pepperoni-aislado-blanco_317111-22.jpg?size=626&ext=jpg")
					.descripcion("La Pizza House, realizada con masa madre supre crocante y esponjosa, doble queso Muzzarella y peperoni, un clasico que no te podes perder")
					.denominacion("Pizza House").
					build();
			Producto producto2 = Producto.builder()
					.costo(BigDecimal.valueOf(1800))
					.precioVenta(BigDecimal.valueOf(2500))
					.tiempoEstimadoCocina(20)
					.urlImagen("https://img.freepik.com/fotos-premium/plato-ensalada-ojos-rana_999671-1910.jpg?size=626&ext=jpg")
					.denominacion("Ensala Pantano")
					.descripcion("De lo mas profundo y oscuro del pantano viene los ingredientes de nuestra ensalada, super saludable pero..., Te atreves a probrarla")
					.build();
			Producto producto3 = Producto.builder()
					.costo(BigDecimal.valueOf(3000))
					.precioVenta(BigDecimal.valueOf(5000))
					.tiempoEstimadoCocina(50)
					.urlImagen("https://img.freepik.com/fotos-premium/rebanada-pastel-chocolate-hojas-menta-plato-negro_759095-6944.jpg?size=626&ext=jpg")
					.descripcion("Y para el postre pedi la porcion de torta mas chocolatosa del pantano, explosion de sabor")
					.denominacion("Explosion de chocolate")
					.build();

			RubroProducto rubroProducto = RubroProducto.builder()
					.nombreCategoriaProducto("Hamburguesas")
					.descripcionCategoriaProducto("Categoria de hamburguesa")
					.build();
			RubroProducto rubroProducto1 = RubroProducto.builder()
					.nombreCategoriaProducto("Pizzas")
					.descripcionCategoriaProducto("Categoria de pizza")
					.build();
			RubroProducto rubroProducto2 = RubroProducto.builder()
					.nombreCategoriaProducto("Ensaladas")
					.descripcionCategoriaProducto("Categoria de ensalada")
					.build();
			RubroProducto rubroProducto3 = RubroProducto.builder()
					.nombreCategoriaProducto("Postres")
					.descripcionCategoriaProducto("Categoria de postre")
					.build();

			producto.setRubroProducto(rubroProducto);
			producto1.setRubroProducto(rubroProducto1);
			producto2.setRubroProducto(rubroProducto2);
			producto3.setRubroProducto(rubroProducto3);

			rubroProductoRepository.save(rubroProducto);
			rubroProductoRepository.save(rubroProducto1);
			rubroProductoRepository.save(rubroProducto2);
			rubroProductoRepository.save(rubroProducto3);

			productoRepository.save(producto);
			productoRepository.save(producto1);
			productoRepository.save(producto2);
			productoRepository.save(producto3);



		};

	}
}
