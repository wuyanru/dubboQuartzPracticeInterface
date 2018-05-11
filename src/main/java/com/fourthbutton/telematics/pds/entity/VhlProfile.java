package com.fourthbutton.telematics.pds.entity;

import java.util.Date;

public class VhlProfile extends AbstractObject {
    /**
	 * 
	 */
    private static final long serialVersionUID = -8526255466076484382L;

    private String id;

    private String vin;

    private String customerName;

    private String vhlColorId;

    private String vhlLicence;

    private String remark;

    private String vhlBandId;

    private String vhlSeriesId;

    private String vhlTypeId;

    private String vhlConfigName;

    private String vhlStatus;

    private String serviceLevelId;

    private String contractId;

    private String insuranceCompany;

    private String insuranceNo;

    private Date dueDate;

    private String saleDt;

    private String languageUse;

    private String recordStatus;

    private Date createTime;

    private Date updateTime;

    private String userId;

    private String oemId;

    private String updVer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getVhlColorId() {
        return vhlColorId;
    }

    public void setVhlColorId(String vhlColorId) {
        this.vhlColorId = vhlColorId;
    }

    public String getVhlLicence() {
        return vhlLicence;
    }

    public void setVhlLicence(String vhlLicence) {
        this.vhlLicence = vhlLicence;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getVhlBandId() {
        return vhlBandId;
    }

    public void setVhlBandId(String vhlBandId) {
        this.vhlBandId = vhlBandId;
    }

    public String getVhlSeriesId() {
        return vhlSeriesId;
    }

    public void setVhlSeriesId(String vhlSeriesId) {
        this.vhlSeriesId = vhlSeriesId;
    }

    public String getVhlTypeId() {
        return vhlTypeId;
    }

    public void setVhlTypeId(String vhlTypeId) {
        this.vhlTypeId = vhlTypeId;
    }

    public String getVhlConfigName() {
        return vhlConfigName;
    }

    public void setVhlConfigName(String vhlConfigName) {
        this.vhlConfigName = vhlConfigName;
    }

    public String getVhlStatus() {
        return vhlStatus;
    }

    public void setVhlStatus(String vhlStatus) {
        this.vhlStatus = vhlStatus;
    }

    public String getServiceLevelId() {
        return serviceLevelId;
    }

    public void setServiceLevelId(String serviceLevelId) {
        this.serviceLevelId = serviceLevelId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getSaleDt() {
        return saleDt;
    }

    public void setSaleDt(String saleDt) {
        this.saleDt = saleDt;
    }

    public String getLanguageUse() {
        return languageUse;
    }

    public void setLanguageUse(String languageUse) {
        this.languageUse = languageUse;
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOemId() {
        return oemId;
    }

    public void setOemId(String oemId) {
        this.oemId = oemId;
    }

    public String getUpdVer() {
        return updVer;
    }

    public void setUpdVer(String updVer) {
        this.updVer = updVer;
    }

    @Override
    public String toString() {
        return "VhlProfile [id=" + id + ", vin=" + vin + ", customerName=" + customerName + ", vhlColorId=" + vhlColorId + ", vhlLicence=" + vhlLicence + ", remark=" + remark + ", vhlBandId=" + vhlBandId + ", vhlSeriesId=" + vhlSeriesId + ", vhlTypeId=" + vhlTypeId + ", vhlConfigName=" + vhlConfigName + ", vhlStatus=" + vhlStatus + ", serviceLevelId=" + serviceLevelId + ", contractId="
                + contractId + ", insuranceCompany=" + insuranceCompany + ", insuranceNo=" + insuranceNo + ", dueDate=" + dueDate + ", saleDt=" + saleDt + ", languageUse=" + languageUse + ", recordStatus=" + recordStatus + ", createTime=" + createTime + ", updateTime=" + updateTime + ", userId=" + userId + ", oemId=" + oemId + ", updVer=" + updVer + "]";
    }

}
