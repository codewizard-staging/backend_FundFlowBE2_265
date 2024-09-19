package com.app.FundFlowBE2.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

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

@Entity(name = "FundingRoundInvestors")
@Table(schema = "\"fundflowbe62\"", name = "\"FundingRoundInvestors\"")
@Data
public class FundingRoundInvestors{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"RoundId\"")
	private Integer roundId;

    
    @Column(name = "\"InvestorId\"")
    private Integer investorId;
 
}