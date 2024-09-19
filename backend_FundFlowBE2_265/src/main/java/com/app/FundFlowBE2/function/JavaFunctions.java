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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.FundFlowBE2.repository.FundingRoundRepository;
import com.app.FundFlowBE2.repository.StageRepository;
import com.app.FundFlowBE2.repository.DocumentRepository;
import com.app.FundFlowBE2.repository.InvestorRepository;
import com.app.FundFlowBE2.repository.FounderRepository;
import com.app.FundFlowBE2.repository.StartupRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
