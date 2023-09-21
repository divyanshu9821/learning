package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

@Table(name="prod_details")
@Entity
public class Product {
	
	@Id
	private int prodId;
	
	@Column(name="name", length=20, nullable = false, unique = true)
	private String prodName;
	
	@Column(name="price",precision=2,nullable=false)
	private double prodPrice;
	
	@Column
	private int stock;
	
	@ManyToOne
	private Brand brand;
}
