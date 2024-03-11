package lk.uom.fit.qms.repository;

import lk.uom.fit.qms.model.GndRiskDetail;
import lk.uom.fit.qms.util.enums.RiskType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface GndRiskDetailRepository extends JpaRepository<GndRiskDetail, Long> {

    GndRiskDetail findGndRiskDetailByGnDivisionId(Long gndId);

    @Query("SELECT grd FROM GndRiskDetail grd WHERE grd.gnDivision.id IN :ids")
    List<GndRiskDetail> findGndRiskDetailsForGivenGndIds(@Param("ids") Collection<Long> gndIds);

    GndRiskDetail findTopByGnDivisionIdIsInAndRiskTypeOrderByStartDateDesc(Collection<Long> gndIds, RiskType riskType);

    List<GndRiskDetail> findGndRiskDetailsByParentRiskDetailId(Long parentId);

    @Query("SELECT grd FROM GndRiskDetail grd WHERE grd.gnDivision.division.district.id = :id")
    List<GndRiskDetail> findGndRiskDetailsByDistrict(@Param("id") Long districtId);
}
