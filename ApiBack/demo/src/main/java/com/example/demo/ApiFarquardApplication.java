package com.example.demo;

import com.example.demo.entities.Cliente;
import com.example.demo.entities.DetallePedido;
import com.example.demo.entities.Factura;
import com.example.demo.entities.Pedido;
import com.example.demo.enums.EstadoPedido;
import com.example.demo.enums.FormaPago;
import com.example.demo.enums.TipoEnvio;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.DetallePedidoRepository;
import com.example.demo.repository.FacturaRepository;
import com.example.demo.repository.PedidoRepository;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class ApiFarquardApplication {
	@Autowired
	PedidoRepository pedidoRepository;
	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	DetallePedidoRepository detallePedidoRepository;
	public static void main(String[] args) {
		SpringApplication.run(ApiFarquardApplication.class, args);
		System.out.println("Corriendo mi proyecto Api");
	}
	//Pedidos
	Pedido pedido1 = Pedido.builder()
			.total(BigDecimal.valueOf(4000))
			.totalCosto(BigDecimal.valueOf(5000))
			.estado(EstadoPedido.EN_CAMINO)
			.tipoEnvio(TipoEnvio.DELIVERY)
			.formaPago(FormaPago.MERCADO_PAGO)
			.build();
	Pedido pedido2 = Pedido.builder()
			.total(BigDecimal.valueOf(3000))
			.totalCosto(BigDecimal.valueOf(4000))
			.estado(EstadoPedido.EN_CAMINO)
			.tipoEnvio(TipoEnvio.DELIVERY)
			.formaPago(FormaPago.MERCADO_PAGO)
			.build();
	Pedido pedido3 = Pedido.builder()
			.total(BigDecimal.valueOf(6000))
			.totalCosto(BigDecimal.valueOf(7000))
			.estado(EstadoPedido.CANCELADO)
			.tipoEnvio(TipoEnvio.DELIVERY)
			.formaPago(FormaPago.MERCADO_PAGO)
			.build();

	//Clientes
	Cliente cliente1 = Cliente.builder()
			.nombre("Martin")
			.apellido("Melonari")
			.email("mamelonari@gmail.com")
			.telefono("123456")
			.build();

	//DetallePedido
	DetallePedido dpedido1 = DetallePedido.builder()
			.cantidad(5)
			.subtotal(BigDecimal.valueOf(3000))
			.subtotalCosto(BigDecimal.valueOf(4000))
			.build();
	DetallePedido dpedido2 = DetallePedido.builder()
			.cantidad(7)
			.subtotal(BigDecimal.valueOf(4000))
			.subtotalCosto(BigDecimal.valueOf(5000))
			.build();
	DetallePedido dpedido3 = DetallePedido.builder()
			.cantidad(2)
			.subtotal(BigDecimal.valueOf(6000))
			.subtotalCosto(BigDecimal.valueOf(7000))
			.build();

			cliente1.setPedidos(List.of(pedido1,pedido2,pedido3));
			pedido1.setDetallePedido(List.of(dpedido1));
			pedido2.setDetallePedido(List.of(dpedido2));
			pedido3.setDetallePedido(List.of(dpedido3));

			clienteRepository.save(cliente1);
			pedidoRepository.save(pedido1);
			detallePedidoRepository.save(dpedido1);

	}
