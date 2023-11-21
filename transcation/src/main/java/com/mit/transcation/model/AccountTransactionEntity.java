package com.mit.transcation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "account_transaction") // Note: Changed to lowercase for PostgreSQL conventions
public class AccountTransactionEntity extends Util {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sys_key", nullable = false)
    private Integer sysKey;

    @Column(name = "trans_no", nullable = false)
    private Integer transNo;

    @Column(name = "trans_ref", nullable = false)
    private Integer transRef;

    @Column(name = "branch_code", length = 50, nullable = false)
    private String branchCode;

    @Column(name = "work_station", length = 50, nullable = false)
    private String workStation;

    @Column(name = "serial_no", nullable = false)
    private Integer serialNo;

    @Column(name = "teller_id", length = 50, nullable = false)
    private String tellerId;

    @Column(name = "supervisor_id", length = 50, nullable = false)
    private String supervisorId;

    @Column(name = "trans_time", nullable = false)
    private String transTime;

    @Column(name = "trans_date", nullable = false)
    private String transDate;

    @Column(name = "description", length = 255, nullable = false)
    private String description;

    @Column(name = "cheque_no", length = 50, nullable = false)
    private String chequeNo;

    @Column(name = "currency_code", length = 20, nullable = false)
    private String currencyCode;

    @Column(name = "currency_rate", nullable = false)
    private Float currencyRate;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @Column(name = "trans_type", nullable = false)
    private Integer transType;

    @Column(name = "acc_number", length = 50, nullable = false)
    private String accNumber;

    @Column(name = "prev_balance", nullable = false)
    private Double prevBalance;

    @Column(name = "prev_up_date")
    private String prevUpDate;

    @Column(name = "effective_date", nullable = false)
    private String effectiveDate;

    @Column(name = "contra_date")
    private String contraDate;

    @Column(name = "status", nullable = false)
    private Integer status;

    @Column(name = "acc_ref", length = 16, nullable = false)
    private String accRef;

    @Column(name = "remark", columnDefinition = "text")
    private String remark;

    @Column(name = "system_code", nullable = false)
    private Integer systemCode;

    @Column(name = "sub_ref", length = 50, nullable = false)
    private String subRef;

	public Integer getSysKey() {
		return sysKey;
	}

	public void setSysKey(Integer sysKey) {
		this.sysKey = sysKey;
	}

	public Integer getTransNo() {
		return transNo;
	}

	public void setTransNo(Integer transNo) {
		this.transNo = transNo;
	}

	public Integer getTransRef() {
		return transRef;
	}

	public void setTransRef(Integer transRef) {
		this.transRef = transRef;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getWorkStation() {
		return workStation;
	}

	public void setWorkStation(String workStation) {
		this.workStation = workStation;
	}

	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	public String getTellerId() {
		return tellerId;
	}

	public void setTellerId(String tellerId) {
		this.tellerId = tellerId;
	}

	public String getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(String supervisorId) {
		this.supervisorId = supervisorId;
	}

	public String getTransTime() {
		return transTime;
	}

	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}

	public String getTransDate() {
		return transDate;
	}

	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Float getCurrencyRate() {
		return currencyRate;
	}

	public void setCurrencyRate(Float currencyRate) {
		this.currencyRate = currencyRate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getTransType() {
		return transType;
	}

	public void setTransType(Integer transType) {
		this.transType = transType;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public Double getPrevBalance() {
		return prevBalance;
	}

	public void setPrevBalance(Double prevBalance) {
		this.prevBalance = prevBalance;
	}

	public String getPrevUpDate() {
		return prevUpDate;
	}

	public void setPrevUpDate(String prevUpDate) {
		this.prevUpDate = prevUpDate;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getContraDate() {
		return contraDate;
	}

	public void setContraDate(String contraDate) {
		this.contraDate = contraDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getAccRef() {
		return accRef;
	}

	public void setAccRef(String accRef) {
		this.accRef = accRef;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(Integer systemCode) {
		this.systemCode = systemCode;
	}

	public String getSubRef() {
		return subRef;
	}

	public void setSubRef(String subRef) {
		this.subRef = subRef;
	}
    
    
}
