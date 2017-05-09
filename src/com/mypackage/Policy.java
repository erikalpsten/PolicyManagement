package com.mypackage;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "Policy")
public class Policy implements Serializable{
	/**
	 * Default Serial Version
	 */
	private static final long serialVersionUID = 1L;

	/*  */
	private String PolicyType;

	/*  */
	private String PolicyBasis;
	
	/*  */
	private String PolicyCoverage;
	
	/*  */
	private String PolicyStatus;
	
	/*  */
	private String CommencementDate;
	
	/*  */
	private String MaturityDate;
	
	/*  */
	private String PolicySurrenderValue;
	
	/*  */
	private String ContractName;
	
	/*  */
	private String SinglePremium;
	
	/*  */
	private String RegularPremiums;
	
	/*  */
	private String PremiumFrequency;
	
	/*  */
	private String PremiumPaymentTerm;
	
	/*  */
	private String LastPremiumPaidDate;
	
	/*  */
	private String PremiumStatus;
	
	/*  */
	private String NextPremiumDueDate;
	
	/*  */
	private String PremiumFinalPaymentDate;
	
	/*  */
	private String PremiumPaymentMethod;
	
	/*  */
	private String BenefitType;
	
	/*  */
	private String BenefitDescription;
	
	/*  */
	private List<String> InsuredPersons;

	public Policy(){}
	
	public Policy(String policyType, String policyBasis, String policyCoverage, String policyStatus,
			String commencementDate, String maturityDate, String policySurrenderValue, String contractName,
			String singlePremium, String regularPremiums, String premiumFrequency, String premiumPaymentTerm,
			String lastPremiumPaidDate, String premiumStatus, String nextPremiumDueDate, String premiumFinalPaymentDate,
			String premiumPaymentMethod, String benefitType, String benefitDescription, ArrayList<String> insuredPersons) {
		this.PolicyType = policyType;
		this.PolicyBasis = policyBasis;
		this.PolicyCoverage = policyCoverage;
		this.PolicyStatus = policyStatus;
		this.CommencementDate = commencementDate;
		this.MaturityDate = maturityDate;
		this.PolicySurrenderValue = policySurrenderValue;
		this.ContractName = contractName;
		this.SinglePremium = singlePremium;
		this.RegularPremiums = regularPremiums;
		this.PremiumFrequency = premiumFrequency;
		this.PremiumPaymentTerm = premiumPaymentTerm;
		this.LastPremiumPaidDate = lastPremiumPaidDate;
		this.PremiumStatus = premiumStatus;
		this.NextPremiumDueDate = nextPremiumDueDate;
		this.PremiumFinalPaymentDate = premiumFinalPaymentDate;
		this.PremiumPaymentMethod = premiumPaymentMethod;
		this.BenefitType = benefitType;
		this.BenefitDescription = benefitDescription;
		this.InsuredPersons = insuredPersons;
	}

	public String getPolicyType() {
		return PolicyType;
	}
	@XmlElement
	public void setPolicyType(String policyType) {
		PolicyType = policyType;
	}
	
	public String getPolicyBasis() {
		return PolicyBasis;
	}
	@XmlElement
	public void setPolicyBasis(String policyBasis) {
		PolicyBasis = policyBasis;
	}

	public String getPolicyCoverage() {
		return PolicyCoverage;
	}
	@XmlElement
	public void setPolicyCoverage(String policyCoverage) {
		PolicyCoverage = policyCoverage;
	}

	public String getPolicyStatus() {
		return PolicyStatus;
	}
	@XmlElement
	public void setPolicyStatus(String policyStatus) {
		PolicyStatus = policyStatus;
	}

	public String getCommencementDate() {
		return CommencementDate;
	}
	@XmlElement
	public void setCommencementDate(String commencementDate) {
		CommencementDate = commencementDate;
	}

	public String getMaturityDate() {
		return MaturityDate;
	}
	@XmlElement
	public void setMaturityDate(String maturityDate) {
		MaturityDate = maturityDate;
	}

	public String getPolicySurrenderValue() {
		return PolicySurrenderValue;
	}
	@XmlElement
	public void setPolicySurrenderValue(String policySurrenderValue) {
		PolicySurrenderValue = policySurrenderValue;
	}

	public String getContractName() {
		return ContractName;
	}
	@XmlElement
	public void setContractName(String contractName) {
		ContractName = contractName;
	}

	public String getSinglePremium() {
		return SinglePremium;
	}
	@XmlElement
	public void setSinglePremium(String singlePremium) {
		SinglePremium = singlePremium;
	}

	public String getRegularPremiums() {
		return RegularPremiums;
	}
	@XmlElement
	public void setRegularPremiums(String regularPremiums) {
		RegularPremiums = regularPremiums;
	}

	public String getPremiumFrequency() {
		return PremiumFrequency;
	}
	@XmlElement
	public void setPremiumFrequency(String premiumFrequency) {
		PremiumFrequency = premiumFrequency;
	}

	public String getPremiumPaymentTerm() {
		return PremiumPaymentTerm;
	}
	@XmlElement
	public void setPremiumPaymentTerm(String premiumPaymentTerm) {
		PremiumPaymentTerm = premiumPaymentTerm;
	}

	public String getLastPremiumPaidDate() {
		return LastPremiumPaidDate;
	}
	@XmlElement
	public void setLastPremiumPaidDate(String lastPremiumPaidDate) {
		LastPremiumPaidDate = lastPremiumPaidDate;
	}

	public String getPremiumStatus() {
		return PremiumStatus;
	}
	@XmlElement
	public void setPremiumStatus(String premiumStatus) {
		PremiumStatus = premiumStatus;
	}

	public String getNextPremiumDueDate() {
		return NextPremiumDueDate;
	}
	@XmlElement
	public void setNextPremiumDueDate(String nextPremiumDueDate) {
		NextPremiumDueDate = nextPremiumDueDate;
	}

	public String getPremiumFinalPaymentDate() {
		return PremiumFinalPaymentDate;
	}
	@XmlElement
	public void setPremiumFinalPaymentDate(String premiumFinalPaymentDate) {
		PremiumFinalPaymentDate = premiumFinalPaymentDate;
	}

	public String getPremiumPaymentMethod() {
		return PremiumPaymentMethod;
	}
	@XmlElement
	public void setPremiumPaymentMethod(String premiumPaymentMethod) {
		PremiumPaymentMethod = premiumPaymentMethod;
	}

	public String getBenefitType() {
		return BenefitType;
	}
	@XmlElement
	public void setBenefitType(String benefitType) {
		BenefitType = benefitType;
	}

	public String getBenefitDescription() {
		return BenefitDescription;
	}
	@XmlElement
	public void setBenefitDescription(String benefitDescription) {
		BenefitDescription = benefitDescription;
	}

	public List<String> getInsuredPersons() {
		return InsuredPersons;
	}
	@XmlElement
	public void setInsuredPersons(List<String> insuredPersons) {
		InsuredPersons = insuredPersons;
	}
	@XmlElement
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
