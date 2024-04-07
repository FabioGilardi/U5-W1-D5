package FabioGilardi.U5W1D5.dao;

import FabioGilardi.U5W1D5.entities.WorkStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkStationDAO extends JpaRepository<WorkStation, Long> {
}
