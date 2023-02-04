package in.ashokit.service;

import in.ashokit.binding.CreateCaseBinding;
import in.ashokit.binding.EducationDetailsBinding;
import in.ashokit.binding.IncomeDetailsBinding;
import in.ashokit.binding.KidDetailsBinding;
import in.ashokit.binding.PlanSelectionBinding;

public interface DataCollectionService {
	
	public Integer creatCase(CreateCaseBinding createCase);
	public String planFill(PlanSelectionBinding planSelect);
	public String incomeFill(IncomeDetailsBinding incomeDetails);
	public String educationFill(EducationDetailsBinding eduDetails);
	public String kidsFill(KidDetailsBinding kidDetails);


}