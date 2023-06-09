package com.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="Order_Details")
@Data
@AllArgsConstructor
@NoArgsConstructor
/*
 * @AllArgsConstructor
 * 
 * @NoArgsConstructor
 * 
 * @EqualsAndHashCode
 * 
 * @ToString
 * 
 * @Setter
 * 
 * @Getter
 */
public class OrderDetailsEntity {
	@Id
	@GenericGenerator(name="order_id_gen",strategy="com.ashokit.generator.OrderIdGenerator")
	@GeneratedValue(generator="order_id_gen")
	@Column(name="order_id",length = 30)	
	private String OrderId;
	@Column(name="order_by",length = 30)
	private String OrderBy;
	@Column(name="order_place_dt")
	private LocalDate OrderPlaceDate;
	@Column(name="Help_Line_Number",precision = 30)
	private Long helplinenumber;
	/*
	 * public String getOrderId() { return OrderId; } public void setOrderId(String
	 * orderId) { OrderId = orderId; } public String getOrderBy() { return OrderBy;
	 * } public void setOrderBy(String orderBy) { OrderBy = orderBy; } public
	 * LocalDate getOrderPlaceDate() { return OrderPlaceDate; } public void
	 * setOrderPlaceDate(LocalDate orderPlaceDate) { OrderPlaceDate =
	 * orderPlaceDate; } public Long getHelplinenumber() { return helplinenumber; }
	 * public void setHelplinenumber(Long helplinenumber) { this.helplinenumber =
	 * helplinenumber; }
	 * 
	 * @Override public String toString() { return "OrderDetailsEntity [OrderId=" +
	 * OrderId + ", OrderBy=" + OrderBy + ", OrderPlaceDate=" + OrderPlaceDate +
	 * ", helplinenumber=" + helplinenumber + "]"; }
	 */

}
