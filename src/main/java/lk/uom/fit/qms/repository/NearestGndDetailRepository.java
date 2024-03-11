package lk.uom.fit.qms.repository;

import lk.uom.fit.qms.model.GramaNiladariDivision;
import lk.uom.fit.qms.model.NearestGndDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NearestGndDetailRepository extends JpaRepository<NearestGndDetail, Long> {

    @Query("SELECT ngd.gramaNiladariDivision FROM NearestGndDetail ngd WHERE ngd.gndCoordinateDetail.gnDivision.id = :id")
    List<GramaNiladariDivision> getNearestGndDetailsForGivenGnd(@Param("id") Long gndId);
}
