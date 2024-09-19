package com.app.FundFlowBE2.function;

import com.app.FundFlowBE2.model.Stage;
import com.app.FundFlowBE2.model.Startup;
import com.app.FundFlowBE2.model.FundingRound;
import com.app.FundFlowBE2.model.Founder;
import com.app.FundFlowBE2.model.Document;
import com.app.FundFlowBE2.model.Investor;




import com.app.FundFlowBE2.enums.RoundStatus;
import com.app.FundFlowBE2.enums.StageName;
import com.app.FundFlowBE2.converter.StageNameConverter;
import com.app.FundFlowBE2.converter.RoundStatusConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  