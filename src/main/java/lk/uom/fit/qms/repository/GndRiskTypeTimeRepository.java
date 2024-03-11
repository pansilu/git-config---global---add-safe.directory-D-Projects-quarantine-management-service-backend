package lk.uom.fit.qms.repository;

import lk.uom.fit.qms.model.GndRiskTypeTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GndRiskTypeTimeRepository extends JpaRepository<GndRiskTypeTime, Long> {

    GndRiskTypeTime findGndRiskTypeTimeByGnDivisionId(Long gndId);
}
