package com.sena.parqueadero.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "terifas")
public class Tarifa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idvehiculo;
	private Long idTarifa;
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TipoVehiculo tipoVehiculo;
	@Column(nullable =  false)
	private Double TarifaPorHora;
	@Column(nullable =  false)
	private Double TarifaPorDia;

}
