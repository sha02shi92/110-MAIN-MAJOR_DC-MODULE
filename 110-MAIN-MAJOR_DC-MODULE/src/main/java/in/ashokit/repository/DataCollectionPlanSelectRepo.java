package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.binding.PlanSelectionBinding;

public interface DataCollectionPlanSelectRepo extends JpaRepository<PlanSelectionBinding, Serializable> {

}
