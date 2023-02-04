package in.ashokit.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IncomeDetailsBinding {
	
	private Integer appId;
	private Integer monthlyIncome;
	private Integer rentIncome;
	private Integer propertyIncome;

}
