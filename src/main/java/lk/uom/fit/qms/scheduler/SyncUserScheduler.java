package lk.uom.fit.qms.scheduler;

import lk.uom.fit.qms.service.AddressService;
import lk.uom.fit.qms.service.GndRiskDetailService;
import lk.uom.fit.qms.service.QuarantineUserService;
import lk.uom.fit.qms.util.Constant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class SyncUserScheduler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final QuarantineUserService quarantineUserService;

    private final AddressService addressService;

    private final GndRiskDetailService gndRiskDetailService;

    @Autowired
    public SyncUserScheduler(QuarantineUserService quarantineUserService, AddressService addressService, GndRiskDetailService gndRiskDetailService) {
        this.quarantineUserService = quarantineUserService;
        this.addressService = addressService;
        this.gndRiskDetailService = gndRiskDetailService;
    }

    @Scheduled(cron = "${sync.cron}", zone = "${time.zone}") // reset user remaining days every mid night
    public void calUserRemainingDays() {

        MDC.put(Constant.LOG_IDENTIFIER_KEY, UUID.randomUUID().toString());

        logger.info("Inside the calUserRemainingDays method.");
        quarantineUserService.calUserRemainingDays();

        addressService.deleteIsolateAddresses();
        gndRiskDetailService.updateGndRiskDetails();
    }
}
