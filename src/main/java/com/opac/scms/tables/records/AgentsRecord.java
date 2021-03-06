/*
 * This file is generated by jOOQ.
 */
package com.opac.scms.tables.records;


import com.opac.scms.tables.Agents;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AgentsRecord extends TableRecordImpl<AgentsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>applet.agents.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>applet.agents.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>applet.agents.p_status</code>.
     */
    public void setPStatus(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>applet.agents.p_status</code>.
     */
    public Integer getPStatus() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>applet.agents.p_mechanism</code>.
     */
    public void setPMechanism(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>applet.agents.p_mechanism</code>.
     */
    public String getPMechanism() {
        return (String) get(2);
    }

    /**
     * Setter for <code>applet.agents.p_conf_level</code>.
     */
    public void setPConfLevel(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>applet.agents.p_conf_level</code>.
     */
    public Integer getPConfLevel() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>applet.agents.p_agency_id</code>.
     */
    public void setPAgencyId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>applet.agents.p_agency_id</code>.
     */
    public String getPAgencyId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>applet.agents.p_agency_npn</code>.
     */
    public void setPAgencyNpn(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>applet.agents.p_agency_npn</code>.
     */
    public String getPAgencyNpn() {
        return (String) get(5);
    }

    /**
     * Setter for <code>applet.agents.p_agency_info</code>.
     */
    public void setPAgencyInfo(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>applet.agents.p_agency_info</code>.
     */
    public String getPAgencyInfo() {
        return (String) get(6);
    }

    /**
     * Setter for <code>applet.agents.p_logs</code>.
     */
    public void setPLogs(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>applet.agents.p_logs</code>.
     */
    public String getPLogs() {
        return (String) get(7);
    }

    /**
     * Setter for <code>applet.agents.npn</code>.
     */
    public void setNpn(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>applet.agents.npn</code>.
     */
    public String getNpn() {
        return (String) get(8);
    }

    /**
     * Setter for <code>applet.agents.fullname</code>.
     */
    public void setFullname(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>applet.agents.fullname</code>.
     */
    public String getFullname() {
        return (String) get(9);
    }

    /**
     * Setter for <code>applet.agents.firstname</code>.
     */
    public void setFirstname(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>applet.agents.firstname</code>.
     */
    public String getFirstname() {
        return (String) get(10);
    }

    /**
     * Setter for <code>applet.agents.middlename</code>.
     */
    public void setMiddlename(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>applet.agents.middlename</code>.
     */
    public String getMiddlename() {
        return (String) get(11);
    }

    /**
     * Setter for <code>applet.agents.lastname</code>.
     */
    public void setLastname(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>applet.agents.lastname</code>.
     */
    public String getLastname() {
        return (String) get(12);
    }

    /**
     * Setter for <code>applet.agents.suffix</code>.
     */
    public void setSuffix(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>applet.agents.suffix</code>.
     */
    public String getSuffix() {
        return (String) get(13);
    }

    /**
     * Setter for <code>applet.agents.primary_addressid</code>.
     */
    public void setPrimaryAddressid(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>applet.agents.primary_addressid</code>.
     */
    public String getPrimaryAddressid() {
        return (String) get(14);
    }

    /**
     * Setter for <code>applet.agents.primary_address1</code>.
     */
    public void setPrimaryAddress1(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>applet.agents.primary_address1</code>.
     */
    public String getPrimaryAddress1() {
        return (String) get(15);
    }

    /**
     * Setter for <code>applet.agents.primary_address2</code>.
     */
    public void setPrimaryAddress2(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>applet.agents.primary_address2</code>.
     */
    public String getPrimaryAddress2() {
        return (String) get(16);
    }

    /**
     * Setter for <code>applet.agents.primary_city</code>.
     */
    public void setPrimaryCity(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>applet.agents.primary_city</code>.
     */
    public String getPrimaryCity() {
        return (String) get(17);
    }

    /**
     * Setter for <code>applet.agents.primary_state</code>.
     */
    public void setPrimaryState(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>applet.agents.primary_state</code>.
     */
    public String getPrimaryState() {
        return (String) get(18);
    }

    /**
     * Setter for <code>applet.agents.primary_zipcode</code>.
     */
    public void setPrimaryZipcode(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>applet.agents.primary_zipcode</code>.
     */
    public String getPrimaryZipcode() {
        return (String) get(19);
    }

    /**
     * Setter for <code>applet.agents.primary_zipcode4</code>.
     */
    public void setPrimaryZipcode4(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>applet.agents.primary_zipcode4</code>.
     */
    public String getPrimaryZipcode4() {
        return (String) get(20);
    }

    /**
     * Setter for <code>applet.agents.primary_metropolitanarea</code>.
     */
    public void setPrimaryMetropolitanarea(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>applet.agents.primary_metropolitanarea</code>.
     */
    public String getPrimaryMetropolitanarea() {
        return (String) get(21);
    }

    /**
     * Setter for <code>applet.agents.primary_county</code>.
     */
    public void setPrimaryCounty(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>applet.agents.primary_county</code>.
     */
    public String getPrimaryCounty() {
        return (String) get(22);
    }

    /**
     * Setter for <code>applet.agents.primary_longitude</code>.
     */
    public void setPrimaryLongitude(BigDecimal value) {
        set(23, value);
    }

    /**
     * Getter for <code>applet.agents.primary_longitude</code>.
     */
    public BigDecimal getPrimaryLongitude() {
        return (BigDecimal) get(23);
    }

    /**
     * Setter for <code>applet.agents.primary_latitude</code>.
     */
    public void setPrimaryLatitude(BigDecimal value) {
        set(24, value);
    }

    /**
     * Getter for <code>applet.agents.primary_latitude</code>.
     */
    public BigDecimal getPrimaryLatitude() {
        return (BigDecimal) get(24);
    }

    /**
     * Setter for <code>applet.agents.primary_phone</code>.
     */
    public void setPrimaryPhone(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>applet.agents.primary_phone</code>.
     */
    public String getPrimaryPhone() {
        return (String) get(25);
    }

    /**
     * Setter for <code>applet.agents.home_addressid</code>.
     */
    public void setHomeAddressid(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>applet.agents.home_addressid</code>.
     */
    public String getHomeAddressid() {
        return (String) get(26);
    }

    /**
     * Setter for <code>applet.agents.home_address1</code>.
     */
    public void setHomeAddress1(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>applet.agents.home_address1</code>.
     */
    public String getHomeAddress1() {
        return (String) get(27);
    }

    /**
     * Setter for <code>applet.agents.home_address2</code>.
     */
    public void setHomeAddress2(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>applet.agents.home_address2</code>.
     */
    public String getHomeAddress2() {
        return (String) get(28);
    }

    /**
     * Setter for <code>applet.agents.home_city</code>.
     */
    public void setHomeCity(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>applet.agents.home_city</code>.
     */
    public String getHomeCity() {
        return (String) get(29);
    }

    /**
     * Setter for <code>applet.agents.home_state</code>.
     */
    public void setHomeState(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>applet.agents.home_state</code>.
     */
    public String getHomeState() {
        return (String) get(30);
    }

    /**
     * Setter for <code>applet.agents.home_zipcode</code>.
     */
    public void setHomeZipcode(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>applet.agents.home_zipcode</code>.
     */
    public String getHomeZipcode() {
        return (String) get(31);
    }

    /**
     * Setter for <code>applet.agents.home_zipcode4</code>.
     */
    public void setHomeZipcode4(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>applet.agents.home_zipcode4</code>.
     */
    public String getHomeZipcode4() {
        return (String) get(32);
    }

    /**
     * Setter for <code>applet.agents.home_metropolitanarea</code>.
     */
    public void setHomeMetropolitanarea(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>applet.agents.home_metropolitanarea</code>.
     */
    public String getHomeMetropolitanarea() {
        return (String) get(33);
    }

    /**
     * Setter for <code>applet.agents.home_county</code>.
     */
    public void setHomeCounty(String value) {
        set(34, value);
    }

    /**
     * Getter for <code>applet.agents.home_county</code>.
     */
    public String getHomeCounty() {
        return (String) get(34);
    }

    /**
     * Setter for <code>applet.agents.home_longitude</code>.
     */
    public void setHomeLongitude(BigDecimal value) {
        set(35, value);
    }

    /**
     * Getter for <code>applet.agents.home_longitude</code>.
     */
    public BigDecimal getHomeLongitude() {
        return (BigDecimal) get(35);
    }

    /**
     * Setter for <code>applet.agents.home_latitude</code>.
     */
    public void setHomeLatitude(BigDecimal value) {
        set(36, value);
    }

    /**
     * Getter for <code>applet.agents.home_latitude</code>.
     */
    public BigDecimal getHomeLatitude() {
        return (BigDecimal) get(36);
    }

    /**
     * Setter for <code>applet.agents.home_phone</code>.
     */
    public void setHomePhone(String value) {
        set(37, value);
    }

    /**
     * Getter for <code>applet.agents.home_phone</code>.
     */
    public String getHomePhone() {
        return (String) get(37);
    }

    /**
     * Setter for <code>applet.agents.email_businesstype</code>.
     */
    public void setEmailBusinesstype(String value) {
        set(38, value);
    }

    /**
     * Getter for <code>applet.agents.email_businesstype</code>.
     */
    public String getEmailBusinesstype() {
        return (String) get(38);
    }

    /**
     * Setter for <code>applet.agents.email_business2type</code>.
     */
    public void setEmailBusiness2type(String value) {
        set(39, value);
    }

    /**
     * Getter for <code>applet.agents.email_business2type</code>.
     */
    public String getEmailBusiness2type() {
        return (String) get(39);
    }

    /**
     * Setter for <code>applet.agents.email_personaltype</code>.
     */
    public void setEmailPersonaltype(String value) {
        set(40, value);
    }

    /**
     * Getter for <code>applet.agents.email_personaltype</code>.
     */
    public String getEmailPersonaltype() {
        return (String) get(40);
    }

    /**
     * Setter for <code>applet.agents.dbaname</code>.
     */
    public void setDbaname(String value) {
        set(41, value);
    }

    /**
     * Getter for <code>applet.agents.dbaname</code>.
     */
    public String getDbaname() {
        return (String) get(41);
    }

    /**
     * Setter for <code>applet.agents.number_yearsanagent</code>.
     */
    public void setNumberYearsanagent(String value) {
        set(42, value);
    }

    /**
     * Getter for <code>applet.agents.number_yearsanagent</code>.
     */
    public String getNumberYearsanagent() {
        return (String) get(42);
    }

    /**
     * Setter for <code>applet.agents.repcrd</code>.
     */
    public void setRepcrd(String value) {
        set(43, value);
    }

    /**
     * Getter for <code>applet.agents.repcrd</code>.
     */
    public String getRepcrd() {
        return (String) get(43);
    }

    /**
     * Setter for <code>applet.agents.securitiesregisteredagent</code>.
     */
    public void setSecuritiesregisteredagent(String value) {
        set(44, value);
    }

    /**
     * Getter for <code>applet.agents.securitiesregisteredagent</code>.
     */
    public String getSecuritiesregisteredagent() {
        return (String) get(44);
    }

    /**
     * Setter for <code>applet.agents.brokerdealeraffiliation</code>.
     */
    public void setBrokerdealeraffiliation(String value) {
        set(45, value);
    }

    /**
     * Getter for <code>applet.agents.brokerdealeraffiliation</code>.
     */
    public String getBrokerdealeraffiliation() {
        return (String) get(45);
    }

    /**
     * Setter for <code>applet.agents.sellsretirementplanproducts</code>.
     */
    public void setSellsretirementplanproducts(String value) {
        set(46, value);
    }

    /**
     * Getter for <code>applet.agents.sellsretirementplanproducts</code>.
     */
    public String getSellsretirementplanproducts() {
        return (String) get(46);
    }

    /**
     * Setter for <code>applet.agents.earliestappointmentdate</code>.
     */
    public void setEarliestappointmentdate(String value) {
        set(47, value);
    }

    /**
     * Getter for <code>applet.agents.earliestappointmentdate</code>.
     */
    public String getEarliestappointmentdate() {
        return (String) get(47);
    }

    /**
     * Setter for <code>applet.agents.carrierappointments</code>.
     */
    public void setCarrierappointments(String value) {
        set(48, value);
    }

    /**
     * Getter for <code>applet.agents.carrierappointments</code>.
     */
    public String getCarrierappointments() {
        return (String) get(48);
    }

    /**
     * Setter for <code>applet.agents.dateofbirth_year</code>.
     */
    public void setDateofbirthYear(String value) {
        set(49, value);
    }

    /**
     * Getter for <code>applet.agents.dateofbirth_year</code>.
     */
    public String getDateofbirthYear() {
        return (String) get(49);
    }

    /**
     * Setter for <code>applet.agents.dateofbirth_full</code>.
     */
    public void setDateofbirthFull(String value) {
        set(50, value);
    }

    /**
     * Getter for <code>applet.agents.dateofbirth_full</code>.
     */
    public String getDateofbirthFull() {
        return (String) get(50);
    }

    /**
     * Setter for <code>applet.agents.gender</code>.
     */
    public void setGender(String value) {
        set(51, value);
    }

    /**
     * Getter for <code>applet.agents.gender</code>.
     */
    public String getGender() {
        return (String) get(51);
    }

    /**
     * Setter for <code>applet.agents.agentlicensetype_health</code>.
     */
    public void setAgentlicensetypeHealth(String value) {
        set(52, value);
    }

    /**
     * Getter for <code>applet.agents.agentlicensetype_health</code>.
     */
    public String getAgentlicensetypeHealth() {
        return (String) get(52);
    }

    /**
     * Setter for <code>applet.agents.number_statelicenses_health</code>.
     */
    public void setNumberStatelicensesHealth(String value) {
        set(53, value);
    }

    /**
     * Getter for <code>applet.agents.number_statelicenses_health</code>.
     */
    public String getNumberStatelicensesHealth() {
        return (String) get(53);
    }

    /**
     * Setter for <code>applet.agents.agentlicensetype_life</code>.
     */
    public void setAgentlicensetypeLife(String value) {
        set(54, value);
    }

    /**
     * Getter for <code>applet.agents.agentlicensetype_life</code>.
     */
    public String getAgentlicensetypeLife() {
        return (String) get(54);
    }

    /**
     * Setter for <code>applet.agents.number_statelicenses_life</code>.
     */
    public void setNumberStatelicensesLife(String value) {
        set(55, value);
    }

    /**
     * Getter for <code>applet.agents.number_statelicenses_life</code>.
     */
    public String getNumberStatelicensesLife() {
        return (String) get(55);
    }

    /**
     * Setter for <code>applet.agents.agentlicensetype_propertycasualty</code>.
     */
    public void setAgentlicensetypePropertycasualty(String value) {
        set(56, value);
    }

    /**
     * Getter for <code>applet.agents.agentlicensetype_propertycasualty</code>.
     */
    public String getAgentlicensetypePropertycasualty() {
        return (String) get(56);
    }

    /**
     * Setter for <code>applet.agents.number_statelicenses_propertycasualty</code>.
     */
    public void setNumberStatelicensesPropertycasualty(String value) {
        set(57, value);
    }

    /**
     * Getter for <code>applet.agents.number_statelicenses_propertycasualty</code>.
     */
    public String getNumberStatelicensesPropertycasualty() {
        return (String) get(57);
    }

    /**
     * Setter for <code>applet.agents.agentlicensetype_variableproducts</code>.
     */
    public void setAgentlicensetypeVariableproducts(String value) {
        set(58, value);
    }

    /**
     * Getter for <code>applet.agents.agentlicensetype_variableproducts</code>.
     */
    public String getAgentlicensetypeVariableproducts() {
        return (String) get(58);
    }

    /**
     * Setter for <code>applet.agents.number_statelicenses_variableproducts</code>.
     */
    public void setNumberStatelicensesVariableproducts(String value) {
        set(59, value);
    }

    /**
     * Getter for <code>applet.agents.number_statelicenses_variableproducts</code>.
     */
    public String getNumberStatelicensesVariableproducts() {
        return (String) get(59);
    }

    /**
     * Setter for <code>applet.agents.dateaddedtodiscoverydatabase</code>.
     */
    public void setDateaddedtodiscoverydatabase(String value) {
        set(60, value);
    }

    /**
     * Getter for <code>applet.agents.dateaddedtodiscoverydatabase</code>.
     */
    public String getDateaddedtodiscoverydatabase() {
        return (String) get(60);
    }

    /**
     * Setter for <code>applet.agents.home_3digitsectionalzip</code>.
     */
    public void setHome_3digitsectionalzip(String value) {
        set(61, value);
    }

    /**
     * Getter for <code>applet.agents.home_3digitsectionalzip</code>.
     */
    public String getHome_3digitsectionalzip() {
        return (String) get(61);
    }

    /**
     * Setter for <code>applet.agents.primary_3digitsectionalzip</code>.
     */
    public void setPrimary_3digitsectionalzip(String value) {
        set(62, value);
    }

    /**
     * Getter for <code>applet.agents.primary_3digitsectionalzip</code>.
     */
    public String getPrimary_3digitsectionalzip() {
        return (String) get(62);
    }

    /**
     * Setter for <code>applet.agents.uspscertified_homeaddress</code>.
     */
    public void setUspscertifiedHomeaddress(String value) {
        set(63, value);
    }

    /**
     * Getter for <code>applet.agents.uspscertified_homeaddress</code>.
     */
    public String getUspscertifiedHomeaddress() {
        return (String) get(63);
    }

    /**
     * Setter for <code>applet.agents.uspscertified_primaryaddress</code>.
     */
    public void setUspscertifiedPrimaryaddress(String value) {
        set(64, value);
    }

    /**
     * Getter for <code>applet.agents.uspscertified_primaryaddress</code>.
     */
    public String getUspscertifiedPrimaryaddress() {
        return (String) get(64);
    }

    /**
     * Setter for <code>applet.agents.primary_addresstype</code>.
     */
    public void setPrimaryAddresstype(String value) {
        set(65, value);
    }

    /**
     * Getter for <code>applet.agents.primary_addresstype</code>.
     */
    public String getPrimaryAddresstype() {
        return (String) get(65);
    }

    /**
     * Setter for <code>applet.agents.primary_addressupdate</code>.
     */
    public void setPrimaryAddressupdate(String value) {
        set(66, value);
    }

    /**
     * Getter for <code>applet.agents.primary_addressupdate</code>.
     */
    public String getPrimaryAddressupdate() {
        return (String) get(66);
    }

    /**
     * Setter for <code>applet.agents.primary_phonetype</code>.
     */
    public void setPrimaryPhonetype(String value) {
        set(67, value);
    }

    /**
     * Getter for <code>applet.agents.primary_phonetype</code>.
     */
    public String getPrimaryPhonetype() {
        return (String) get(67);
    }

    /**
     * Setter for <code>applet.agents.primary_phoneupdate</code>.
     */
    public void setPrimaryPhoneupdate(String value) {
        set(68, value);
    }

    /**
     * Getter for <code>applet.agents.primary_phoneupdate</code>.
     */
    public String getPrimaryPhoneupdate() {
        return (String) get(68);
    }

    /**
     * Setter for <code>applet.agents.home_addressupdate</code>.
     */
    public void setHomeAddressupdate(String value) {
        set(69, value);
    }

    /**
     * Getter for <code>applet.agents.home_addressupdate</code>.
     */
    public String getHomeAddressupdate() {
        return (String) get(69);
    }

    /**
     * Setter for <code>applet.agents.discoverycontactid</code>.
     */
    public void setDiscoverycontactid(String value) {
        set(70, value);
    }

    /**
     * Getter for <code>applet.agents.discoverycontactid</code>.
     */
    public String getDiscoverycontactid() {
        return (String) get(70);
    }

    /**
     * Setter for <code>applet.agents.website</code>.
     */
    public void setWebsite(String value) {
        set(71, value);
    }

    /**
     * Getter for <code>applet.agents.website</code>.
     */
    public String getWebsite() {
        return (String) get(71);
    }

    /**
     * Setter for <code>applet.agents.firmname</code>.
     */
    public void setFirmname(String value) {
        set(72, value);
    }

    /**
     * Getter for <code>applet.agents.firmname</code>.
     */
    public String getFirmname() {
        return (String) get(72);
    }

    /**
     * Setter for <code>applet.agents.riaaffiliation</code>.
     */
    public void setRiaaffiliation(String value) {
        set(73, value);
    }

    /**
     * Getter for <code>applet.agents.riaaffiliation</code>.
     */
    public String getRiaaffiliation() {
        return (String) get(73);
    }

    /**
     * Setter for <code>applet.agents.primary_geolocationurl</code>.
     */
    public void setPrimaryGeolocationurl(String value) {
        set(74, value);
    }

    /**
     * Getter for <code>applet.agents.primary_geolocationurl</code>.
     */
    public String getPrimaryGeolocationurl() {
        return (String) get(74);
    }

    /**
     * Setter for <code>applet.agents.home_geolocationurl</code>.
     */
    public void setHomeGeolocationurl(String value) {
        set(75, value);
    }

    /**
     * Getter for <code>applet.agents.home_geolocationurl</code>.
     */
    public String getHomeGeolocationurl() {
        return (String) get(75);
    }

    /**
     * Setter for <code>applet.agents.becameagentdate</code>.
     */
    public void setBecameagentdate(String value) {
        set(76, value);
    }

    /**
     * Getter for <code>applet.agents.becameagentdate</code>.
     */
    public String getBecameagentdate() {
        return (String) get(76);
    }

    /**
     * Setter for <code>applet.agents.discoverydataprofileurl</code>.
     */
    public void setDiscoverydataprofileurl(String value) {
        set(77, value);
    }

    /**
     * Getter for <code>applet.agents.discoverydataprofileurl</code>.
     */
    public String getDiscoverydataprofileurl() {
        return (String) get(77);
    }

    /**
     * Setter for <code>applet.agents.primary_streetaddress</code>.
     */
    public void setPrimaryStreetaddress(String value) {
        set(78, value);
    }

    /**
     * Getter for <code>applet.agents.primary_streetaddress</code>.
     */
    public String getPrimaryStreetaddress() {
        return (String) get(78);
    }

    /**
     * Setter for <code>applet.agents.home_streetaddress</code>.
     */
    public void setHomeStreetaddress(String value) {
        set(79, value);
    }

    /**
     * Getter for <code>applet.agents.home_streetaddress</code>.
     */
    public String getHomeStreetaddress() {
        return (String) get(79);
    }

    /**
     * Setter for <code>applet.agents.primary_country</code>.
     */
    public void setPrimaryCountry(String value) {
        set(80, value);
    }

    /**
     * Getter for <code>applet.agents.primary_country</code>.
     */
    public String getPrimaryCountry() {
        return (String) get(80);
    }

    /**
     * Setter for <code>applet.agents.home_country</code>.
     */
    public void setHomeCountry(String value) {
        set(81, value);
    }

    /**
     * Getter for <code>applet.agents.home_country</code>.
     */
    public String getHomeCountry() {
        return (String) get(81);
    }

    /**
     * Setter for <code>applet.agents.othernames</code>.
     */
    public void setOthernames(String value) {
        set(82, value);
    }

    /**
     * Getter for <code>applet.agents.othernames</code>.
     */
    public String getOthernames() {
        return (String) get(82);
    }

    /**
     * Setter for <code>applet.agents.preferredname</code>.
     */
    public void setPreferredname(String value) {
        set(83, value);
    }

    /**
     * Getter for <code>applet.agents.preferredname</code>.
     */
    public String getPreferredname() {
        return (String) get(83);
    }

    /**
     * Setter for <code>applet.agents.dateofbirth_mm_dd</code>.
     */
    public void setDateofbirthMmDd(String value) {
        set(84, value);
    }

    /**
     * Getter for <code>applet.agents.dateofbirth_mm_dd</code>.
     */
    public String getDateofbirthMmDd() {
        return (String) get(84);
    }

    /**
     * Setter for <code>applet.agents.personalwebsite</code>.
     */
    public void setPersonalwebsite(String value) {
        set(85, value);
    }

    /**
     * Getter for <code>applet.agents.personalwebsite</code>.
     */
    public String getPersonalwebsite() {
        return (String) get(85);
    }

    /**
     * Setter for <code>applet.agents.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value) {
        set(86, value);
    }

    /**
     * Getter for <code>applet.agents.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(86);
    }

    /**
     * Setter for <code>applet.agents.updated_at</code>.
     */
    public void setUpdatedAt(LocalDateTime value) {
        set(87, value);
    }

    /**
     * Getter for <code>applet.agents.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(87);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AgentsRecord
     */
    public AgentsRecord() {
        super(Agents.AGENTS);
    }

    /**
     * Create a detached, initialised AgentsRecord
     */
    public AgentsRecord(Integer id, Integer pStatus, String pMechanism, Integer pConfLevel, String pAgencyId, String pAgencyNpn, String pAgencyInfo, String pLogs, String npn, String fullname, String firstname, String middlename, String lastname, String suffix, String primaryAddressid, String primaryAddress1, String primaryAddress2, String primaryCity, String primaryState, String primaryZipcode, String primaryZipcode4, String primaryMetropolitanarea, String primaryCounty, BigDecimal primaryLongitude, BigDecimal primaryLatitude, String primaryPhone, String homeAddressid, String homeAddress1, String homeAddress2, String homeCity, String homeState, String homeZipcode, String homeZipcode4, String homeMetropolitanarea, String homeCounty, BigDecimal homeLongitude, BigDecimal homeLatitude, String homePhone, String emailBusinesstype, String emailBusiness2type, String emailPersonaltype, String dbaname, String numberYearsanagent, String repcrd, String securitiesregisteredagent, String brokerdealeraffiliation, String sellsretirementplanproducts, String earliestappointmentdate, String carrierappointments, String dateofbirthYear, String dateofbirthFull, String gender, String agentlicensetypeHealth, String numberStatelicensesHealth, String agentlicensetypeLife, String numberStatelicensesLife, String agentlicensetypePropertycasualty, String numberStatelicensesPropertycasualty, String agentlicensetypeVariableproducts, String numberStatelicensesVariableproducts, String dateaddedtodiscoverydatabase, String home_3digitsectionalzip, String primary_3digitsectionalzip, String uspscertifiedHomeaddress, String uspscertifiedPrimaryaddress, String primaryAddresstype, String primaryAddressupdate, String primaryPhonetype, String primaryPhoneupdate, String homeAddressupdate, String discoverycontactid, String website, String firmname, String riaaffiliation, String primaryGeolocationurl, String homeGeolocationurl, String becameagentdate, String discoverydataprofileurl, String primaryStreetaddress, String homeStreetaddress, String primaryCountry, String homeCountry, String othernames, String preferredname, String dateofbirthMmDd, String personalwebsite, LocalDateTime createdAt, LocalDateTime updatedAt) {
        super(Agents.AGENTS);

        setId(id);
        setPStatus(pStatus);
        setPMechanism(pMechanism);
        setPConfLevel(pConfLevel);
        setPAgencyId(pAgencyId);
        setPAgencyNpn(pAgencyNpn);
        setPAgencyInfo(pAgencyInfo);
        setPLogs(pLogs);
        setNpn(npn);
        setFullname(fullname);
        setFirstname(firstname);
        setMiddlename(middlename);
        setLastname(lastname);
        setSuffix(suffix);
        setPrimaryAddressid(primaryAddressid);
        setPrimaryAddress1(primaryAddress1);
        setPrimaryAddress2(primaryAddress2);
        setPrimaryCity(primaryCity);
        setPrimaryState(primaryState);
        setPrimaryZipcode(primaryZipcode);
        setPrimaryZipcode4(primaryZipcode4);
        setPrimaryMetropolitanarea(primaryMetropolitanarea);
        setPrimaryCounty(primaryCounty);
        setPrimaryLongitude(primaryLongitude);
        setPrimaryLatitude(primaryLatitude);
        setPrimaryPhone(primaryPhone);
        setHomeAddressid(homeAddressid);
        setHomeAddress1(homeAddress1);
        setHomeAddress2(homeAddress2);
        setHomeCity(homeCity);
        setHomeState(homeState);
        setHomeZipcode(homeZipcode);
        setHomeZipcode4(homeZipcode4);
        setHomeMetropolitanarea(homeMetropolitanarea);
        setHomeCounty(homeCounty);
        setHomeLongitude(homeLongitude);
        setHomeLatitude(homeLatitude);
        setHomePhone(homePhone);
        setEmailBusinesstype(emailBusinesstype);
        setEmailBusiness2type(emailBusiness2type);
        setEmailPersonaltype(emailPersonaltype);
        setDbaname(dbaname);
        setNumberYearsanagent(numberYearsanagent);
        setRepcrd(repcrd);
        setSecuritiesregisteredagent(securitiesregisteredagent);
        setBrokerdealeraffiliation(brokerdealeraffiliation);
        setSellsretirementplanproducts(sellsretirementplanproducts);
        setEarliestappointmentdate(earliestappointmentdate);
        setCarrierappointments(carrierappointments);
        setDateofbirthYear(dateofbirthYear);
        setDateofbirthFull(dateofbirthFull);
        setGender(gender);
        setAgentlicensetypeHealth(agentlicensetypeHealth);
        setNumberStatelicensesHealth(numberStatelicensesHealth);
        setAgentlicensetypeLife(agentlicensetypeLife);
        setNumberStatelicensesLife(numberStatelicensesLife);
        setAgentlicensetypePropertycasualty(agentlicensetypePropertycasualty);
        setNumberStatelicensesPropertycasualty(numberStatelicensesPropertycasualty);
        setAgentlicensetypeVariableproducts(agentlicensetypeVariableproducts);
        setNumberStatelicensesVariableproducts(numberStatelicensesVariableproducts);
        setDateaddedtodiscoverydatabase(dateaddedtodiscoverydatabase);
        setHome_3digitsectionalzip(home_3digitsectionalzip);
        setPrimary_3digitsectionalzip(primary_3digitsectionalzip);
        setUspscertifiedHomeaddress(uspscertifiedHomeaddress);
        setUspscertifiedPrimaryaddress(uspscertifiedPrimaryaddress);
        setPrimaryAddresstype(primaryAddresstype);
        setPrimaryAddressupdate(primaryAddressupdate);
        setPrimaryPhonetype(primaryPhonetype);
        setPrimaryPhoneupdate(primaryPhoneupdate);
        setHomeAddressupdate(homeAddressupdate);
        setDiscoverycontactid(discoverycontactid);
        setWebsite(website);
        setFirmname(firmname);
        setRiaaffiliation(riaaffiliation);
        setPrimaryGeolocationurl(primaryGeolocationurl);
        setHomeGeolocationurl(homeGeolocationurl);
        setBecameagentdate(becameagentdate);
        setDiscoverydataprofileurl(discoverydataprofileurl);
        setPrimaryStreetaddress(primaryStreetaddress);
        setHomeStreetaddress(homeStreetaddress);
        setPrimaryCountry(primaryCountry);
        setHomeCountry(homeCountry);
        setOthernames(othernames);
        setPreferredname(preferredname);
        setDateofbirthMmDd(dateofbirthMmDd);
        setPersonalwebsite(personalwebsite);
        setCreatedAt(createdAt);
        setUpdatedAt(updatedAt);
    }
}
