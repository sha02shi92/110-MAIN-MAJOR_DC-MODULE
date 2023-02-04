package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "INCOME_DETAILS")
@Data
public class IncomeDetailsEntity {
	
	@Id
	@GeneratedValue
	private Integer appId;
	private Integer monthlyIncome;
	private Integer rentIncome;
	private Integer propertyIncome;

}
