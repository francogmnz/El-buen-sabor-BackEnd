package com.example.demo;

import com.example.demo.entities.*;
import com.example.demo.enums.*;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
public class ApiFarquardApplication {
	@Autowired
	ProductoRepository productoRepository;
	@Autowired
	RubroProductoRepository rubroProductoRepository;
	@Autowired
	UsuarioRepository usuarioRepository;
	@Autowired
	PedidoRepository pedidoRepository;
	@Autowired
	DetallePedidoRepository detallePedidoRepository;
	@Autowired
	DomicilioRepository	domicilioRepository;
	@Autowired
	ClienteRepository clienteRepository;

	public ApiFarquardApplication(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiFarquardApplication.class, args);
		System.out.println("Corriendo mi proyecto Api");
	}
	@Autowired
	private final PasswordEncoder passwordEncoder;
	@Bean
	CommandLineRunner init() {
		return args -> {
			System.out.println("Funciona!");

			Usuario admin = Usuario.builder()
					.username("admin")
					.password(passwordEncoder.encode("admin"))
					.firstname("admin")
					.lastname("admin")
					.rol(Rol.ADMINISTRADOR)
					.email("admin@admin")
					.build();

			usuarioRepository.save(admin);

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
			//Pedidos
			Pedido pedidoM1 = Pedido.builder()
					.total(BigDecimal.valueOf(4000))
					.totalCosto(BigDecimal.valueOf(5000))
					.estado(EstadoPedido.EN_CAMINO)
					.tipoEnvio(TipoEnvio.TAKE_AWAY)
					.formaPago(FormaPago.MERCADO_PAGO)
					.estadoPago(EstadoPagoPedido.PENDIENTE_PAGO)
					.build();
			Pedido pedidoM2 = Pedido.builder()
					.total(BigDecimal.valueOf(3000))
					.totalCosto(BigDecimal.valueOf(4000))
					.estado(EstadoPedido.CANCELADO)
					.tipoEnvio(TipoEnvio.DELIVERY)
					.estadoPago(EstadoPagoPedido.CANCELADO)
					.formaPago(FormaPago.MERCADO_PAGO)
					.build();
			Pedido pedidoM3 = Pedido.builder()
					.total(BigDecimal.valueOf(6000))
					.totalCosto(BigDecimal.valueOf(7000))
					.estado(EstadoPedido.COMPLETADO)
					.estadoPago(EstadoPagoPedido.PENDIENTE_PAGO)
					.tipoEnvio(TipoEnvio.DELIVERY)
					.formaPago(FormaPago.EFECTIVO)
					.build();
			Pedido pedidoM4 = Pedido.builder()
					.total(BigDecimal.valueOf(2300))
					.totalCosto(BigDecimal.valueOf(3700))
					.estado(EstadoPedido.PREPARACION)
					.tipoEnvio(TipoEnvio.DELIVERY)
					.estadoPago(EstadoPagoPedido.PENDIENTE_PAGO)
					.formaPago(FormaPago.MERCADO_PAGO)
					.build();

			Pedido pedidoM5 = Pedido.builder()
					.total(BigDecimal.valueOf(6300))
					.totalCosto(BigDecimal.valueOf(7200))
					.estado(EstadoPedido.LISTO)
					.tipoEnvio(TipoEnvio.TAKE_AWAY)
					.estadoPago(EstadoPagoPedido.PAGADO)
					.formaPago(FormaPago.MERCADO_PAGO)
					.build();

			Pedido pedidoM6 = Pedido.builder()
					.total(BigDecimal.valueOf(1100))
					.totalCosto(BigDecimal.valueOf(1400))
					.estado(EstadoPedido.A_CONFIRMAR)
					.estadoPago(EstadoPagoPedido.PENDIENTE_PAGO)
					.tipoEnvio(TipoEnvio.DELIVERY)
					.formaPago(FormaPago.MERCADO_PAGO)
					.build();

			//cliente
			Cliente clienteM1 = Cliente.builder()
					.nombre("Martin")
					.apellido("Melonari")
					.email("mamelonari@gmail.com")
					.telefono("123456")
					.build();
			Cliente clienteM2 = Cliente.builder()
					.nombre("Mateo")
					.apellido("Sol")
					.email("matisol@gmail.com")
					.telefono("654321")
					.build();
			Cliente clienteM3 = Cliente.builder()
					.nombre("Juan Roman")
					.apellido("Riquelme")
					.email("jjr10@gmail.com")
					.telefono("12235")
					.build();
			Cliente clienteM4 = Cliente.builder()
					.nombre("Elon")
					.apellido("Musk")
					.email("elon@gmail.com")
					.telefono("123456")
					.build();
			//Usuarios
			Usuario user1 = Usuario.builder()
					.username("Melonari")
					.password(passwordEncoder.encode("admin"))
					.firstname("Martin")
					.lastname("Melonari")
					.rol(Rol.CLIENTE)
					.email("mamelonari@gmail.com")
					.build();

			Usuario user2 = Usuario.builder()
					.username("MateoSol")
					.password(passwordEncoder.encode("admin"))
					.firstname("Mateo")
					.lastname("Sol")
					.rol(Rol.CLIENTE)
					.email("matisol@gmail.com")
					.build();

			Usuario user3 = Usuario.builder()
					.username("JuanRoman")
					.password(passwordEncoder.encode("admin"))
					.firstname("Juan Roman")
					.lastname("Riquelme")
					.rol(Rol.CLIENTE)
					.email("JuanRoman@Boquita")
					.build();

			Usuario user4 = Usuario.builder()
					.username("ElonMusk")
					.password(passwordEncoder.encode("admin"))
					.firstname("Elon")
					.lastname("Musk")
					.rol(Rol.ADMINISTRADOR)
					.email("Elon@gmail.com")
					.build();

			usuarioRepository.save(user1);
			usuarioRepository.save(user2);
			usuarioRepository.save(user3);
			usuarioRepository.save(user4);
			clienteM1.setUsuario(user1);
			clienteM2.setUsuario(user2);
			clienteM3.setUsuario(user3);
			clienteM4.setUsuario(user4);

			clienteRepository.save(clienteM1);
			clienteRepository.save(clienteM2);
			clienteRepository.save(clienteM3);
			clienteRepository.save(clienteM4);
			//DetallePedido
			DetallePedido dpedidoM1 = DetallePedido.builder()
					.cantidad(5)
					.subtotal(BigDecimal.valueOf(3000))
					.subtotalCosto(BigDecimal.valueOf(4000))
					.build();
			DetallePedido dpedidoM2 = DetallePedido.builder()
					.cantidad(7)
					.subtotal(BigDecimal.valueOf(4000))
					.subtotalCosto(BigDecimal.valueOf(5000))
					.build();
			DetallePedido dpedidoM3 = DetallePedido.builder()
					.cantidad(2)
					.subtotal(BigDecimal.valueOf(6000))
					.subtotalCosto(BigDecimal.valueOf(7000))
					.build();
			DetallePedido dpedidoM4 = DetallePedido.builder()
					.cantidad(7)
					.subtotal(BigDecimal.valueOf(2200))
					.subtotalCosto(BigDecimal.valueOf(3600))
					.build();

			DetallePedido dpedidoM5 = DetallePedido.builder()
					.cantidad(1)
					.subtotal(BigDecimal.valueOf(6300))
					.subtotalCosto(BigDecimal.valueOf(7200))
					.build();
			DetallePedido dpedidoM6 = DetallePedido.builder()
					.cantidad(2)
					.subtotal(BigDecimal.valueOf(550))
					.subtotalCosto(BigDecimal.valueOf(700))
					.build();

			//Domicilio
			Domicilio domicilioM1 = Domicilio.builder()
					.calle("Yapeyu")
					.numero(681)
					.numeroDpto(531)
					.pisoDpto(3)
					.build();
			Domicilio domicilioM2 = Domicilio.builder()
					.calle("Bufano")
					.numero(543)
					.numeroDpto(679)
					.pisoDpto(2)
					.build();
			Domicilio domicilioM3 = Domicilio.builder()
					.calle("Av Flores")
					.numero(22)
					.numeroDpto(1)
					.pisoDpto(1)
					.build();

			Domicilio domicilioM4 = Domicilio.builder()
					.calle("Brandsen")
					.numero(805)
					.numeroDpto(1)
					.pisoDpto(1)
					.build();
			//Sets

			dpedidoM1.setProducto(producto1);
			dpedidoM2.setProducto(producto1);
			dpedidoM3.setProducto(producto2);
			dpedidoM4.setProducto(producto3);
			dpedidoM5.setProducto(producto3);
			dpedidoM6.setProducto(producto2);

			detallePedidoRepository.save(dpedidoM1);
			detallePedidoRepository.save(dpedidoM2);
			detallePedidoRepository.save(dpedidoM3);
			detallePedidoRepository.save(dpedidoM4);
			detallePedidoRepository.save(dpedidoM5);
			detallePedidoRepository.save(dpedidoM6);


			pedidoM1.setDetallePedido(List.of(dpedidoM1));
			pedidoM2.setDetallePedido(List.of(dpedidoM2));
			pedidoM3.setDetallePedido(List.of(dpedidoM3));
			pedidoM4.setDetallePedido(List.of(dpedidoM4));
			pedidoM5.setDetallePedido(List.of(dpedidoM5));
			pedidoM6.setDetallePedido(List.of(dpedidoM6));



			domicilioRepository.save(domicilioM1);
			domicilioRepository.save(domicilioM2);
			domicilioRepository.save(domicilioM3);
			domicilioRepository.save(domicilioM4);





			pedidoM1.setDomicilio(domicilioM1);
			pedidoM2.setDomicilio(domicilioM1);
			pedidoM3.setDomicilio(domicilioM2);
			pedidoM4.setDomicilio(domicilioM3);
			pedidoM5.setDomicilio(domicilioM3);
			pedidoM6.setDomicilio(domicilioM4);

			pedidoRepository.save(pedidoM1);
			pedidoRepository.save(pedidoM2);
			pedidoRepository.save(pedidoM3);
			pedidoRepository.save(pedidoM4);
			pedidoRepository.save(pedidoM5);
			pedidoRepository.save(pedidoM6);

			clienteM1.setPedidos(List.of(pedidoM1,pedidoM2));
			clienteM3.setPedidos(List.of(pedidoM4,pedidoM5));
			clienteM2.setPedidos(List.of(pedidoM6, pedidoM3));

			clienteRepository.save(clienteM1);
			clienteRepository.save(clienteM2);
			clienteRepository.save(clienteM3);
			clienteRepository.save(clienteM4);


		};

	}
}
