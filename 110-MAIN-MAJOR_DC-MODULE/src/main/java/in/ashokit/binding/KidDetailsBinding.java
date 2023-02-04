package in.ashokit.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KidDetailsBinding {
	
	private Integer appId;
	private String kidsName;
	private Integer kidsAge;
	private Long kidsSsn;

}
