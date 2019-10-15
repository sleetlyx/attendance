package cn.fhjt.weixin.pojo;

import java.io.Serializable;
import java.util.Date;

public class LsUserinfo implements Serializable {
    private Integer userid;

    private String badgenumber;

    private String name;

    private Integer defaultdeptid;

    private String password;

    private String mverifypass;

    private Integer privilege;

    private String card;

    private Integer accgroup;

    private String timezones;

    private String gender;

    private Date birthday;

    private String street;

    private String zip;

    private String ophone;

    private String fphone;

    private String pager;

    private String minzu;

    private String title;

    private String sn;

    private String ssn;

    private Date utime;

    private Date hiredday;

    private Short verificationmethod;

    private String state;

    private String city;

    private Short securityflags;

    private Boolean att;

    private Boolean overtime;

    private Boolean holiday;

    private Short inlate;

    private Short outearly;

    private Short lunchduration;

    private Short sep;

    private Short offduty;

    private Short deltag;

    private Short autoschplan;

    private Integer minautoschinterval;

    private Integer registerot;

    private String syspass;

    private String email;

    private Date opstamp;

    private Integer reserved;

    private Double annualleave;

    private String educational;

    private Date trialstarttime;

    private Date trialendtime;

    private Date contractstarttime;

    private Date contractendtime;

    private String employeetype;

    private Integer imageId;

    private String simname;

    private String simnumber;

    private String phone;

    private String simzt;

    private Date simtime;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getBadgenumber() {
        return badgenumber;
    }

    public void setBadgenumber(String badgenumber) {
        this.badgenumber = badgenumber == null ? null : badgenumber.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getDefaultdeptid() {
        return defaultdeptid;
    }

    public void setDefaultdeptid(Integer defaultdeptid) {
        this.defaultdeptid = defaultdeptid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getMverifypass() {
        return mverifypass;
    }

    public void setMverifypass(String mverifypass) {
        this.mverifypass = mverifypass == null ? null : mverifypass.trim();
    }

    public Integer getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Integer privilege) {
        this.privilege = privilege;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card == null ? null : card.trim();
    }

    public Integer getAccgroup() {
        return accgroup;
    }

    public void setAccgroup(Integer accgroup) {
        this.accgroup = accgroup;
    }

    public String getTimezones() {
        return timezones;
    }

    public void setTimezones(String timezones) {
        this.timezones = timezones == null ? null : timezones.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    public String getOphone() {
        return ophone;
    }

    public void setOphone(String ophone) {
        this.ophone = ophone == null ? null : ophone.trim();
    }

    public String getFphone() {
        return fphone;
    }

    public void setFphone(String fphone) {
        this.fphone = fphone == null ? null : fphone.trim();
    }

    public String getPager() {
        return pager;
    }

    public void setPager(String pager) {
        this.pager = pager == null ? null : pager.trim();
    }

    public String getMinzu() {
        return minzu;
    }

    public void setMinzu(String minzu) {
        this.minzu = minzu == null ? null : minzu.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn == null ? null : ssn.trim();
    }

    public Date getUtime() {
        return utime;
    }

    public void setUtime(Date utime) {
        this.utime = utime;
    }

    public Date getHiredday() {
        return hiredday;
    }

    public void setHiredday(Date hiredday) {
        this.hiredday = hiredday;
    }

    public Short getVerificationmethod() {
        return verificationmethod;
    }

    public void setVerificationmethod(Short verificationmethod) {
        this.verificationmethod = verificationmethod;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Short getSecurityflags() {
        return securityflags;
    }

    public void setSecurityflags(Short securityflags) {
        this.securityflags = securityflags;
    }

    public Boolean getAtt() {
        return att;
    }

    public void setAtt(Boolean att) {
        this.att = att;
    }

    public Boolean getOvertime() {
        return overtime;
    }

    public void setOvertime(Boolean overtime) {
        this.overtime = overtime;
    }

    public Boolean getHoliday() {
        return holiday;
    }

    public void setHoliday(Boolean holiday) {
        this.holiday = holiday;
    }

    public Short getInlate() {
        return inlate;
    }

    public void setInlate(Short inlate) {
        this.inlate = inlate;
    }

    public Short getOutearly() {
        return outearly;
    }

    public void setOutearly(Short outearly) {
        this.outearly = outearly;
    }

    public Short getLunchduration() {
        return lunchduration;
    }

    public void setLunchduration(Short lunchduration) {
        this.lunchduration = lunchduration;
    }

    public Short getSep() {
        return sep;
    }

    public void setSep(Short sep) {
        this.sep = sep;
    }

    public Short getOffduty() {
        return offduty;
    }

    public void setOffduty(Short offduty) {
        this.offduty = offduty;
    }

    public Short getDeltag() {
        return deltag;
    }

    public void setDeltag(Short deltag) {
        this.deltag = deltag;
    }

    public Short getAutoschplan() {
        return autoschplan;
    }

    public void setAutoschplan(Short autoschplan) {
        this.autoschplan = autoschplan;
    }

    public Integer getMinautoschinterval() {
        return minautoschinterval;
    }

    public void setMinautoschinterval(Integer minautoschinterval) {
        this.minautoschinterval = minautoschinterval;
    }

    public Integer getRegisterot() {
        return registerot;
    }

    public void setRegisterot(Integer registerot) {
        this.registerot = registerot;
    }

    public String getSyspass() {
        return syspass;
    }

    public void setSyspass(String syspass) {
        this.syspass = syspass == null ? null : syspass.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getOpstamp() {
        return opstamp;
    }

    public void setOpstamp(Date opstamp) {
        this.opstamp = opstamp;
    }

    public Integer getReserved() {
        return reserved;
    }

    public void setReserved(Integer reserved) {
        this.reserved = reserved;
    }

    public Double getAnnualleave() {
        return annualleave;
    }

    public void setAnnualleave(Double annualleave) {
        this.annualleave = annualleave;
    }

    public String getEducational() {
        return educational;
    }

    public void setEducational(String educational) {
        this.educational = educational == null ? null : educational.trim();
    }

    public Date getTrialstarttime() {
        return trialstarttime;
    }

    public void setTrialstarttime(Date trialstarttime) {
        this.trialstarttime = trialstarttime;
    }

    public Date getTrialendtime() {
        return trialendtime;
    }

    public void setTrialendtime(Date trialendtime) {
        this.trialendtime = trialendtime;
    }

    public Date getContractstarttime() {
        return contractstarttime;
    }

    public void setContractstarttime(Date contractstarttime) {
        this.contractstarttime = contractstarttime;
    }

    public Date getContractendtime() {
        return contractendtime;
    }

    public void setContractendtime(Date contractendtime) {
        this.contractendtime = contractendtime;
    }

    public String getEmployeetype() {
        return employeetype;
    }

    public void setEmployeetype(String employeetype) {
        this.employeetype = employeetype == null ? null : employeetype.trim();
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getSimname() {
        return simname;
    }

    public void setSimname(String simname) {
        this.simname = simname == null ? null : simname.trim();
    }

    public String getSimnumber() {
        return simnumber;
    }

    public void setSimnumber(String simnumber) {
        this.simnumber = simnumber == null ? null : simnumber.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSimzt() {
        return simzt;
    }

    public void setSimzt(String simzt) {
        this.simzt = simzt == null ? null : simzt.trim();
    }

    public Date getSimtime() {
        return simtime;
    }

    public void setSimtime(Date simtime) {
        this.simtime = simtime;
    }
}