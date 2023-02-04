package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="KIDS_DETAILS")
@Data
public class KidsDetailsEntity {
	
	@Id
	@GeneratedValue
	private Integer appId;
	private String kidsName;
	private Integer kidsAge;
	private Long kidsSsn;

}
