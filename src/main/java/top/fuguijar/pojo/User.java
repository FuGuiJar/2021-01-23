package top.fuguijar.pojo;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


@TableName("smbms_user")
public class User implements Serializable {
  private static final long serialVersionUID =  3579585813928459242L;

  @TableId(type = IdType.AUTO)
  private Integer id;
  private String userCode;
  private String username;
  private String password;
  private String salt;
  private Integer gender;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd")
  private java.time.LocalDate birthday;
  private String phone;
  private String address;
  private Integer userRole;
  private Integer createdBy;
  private java.time.LocalDateTime creationDate;
  private Integer modifyBy;
  private java.time.LocalDateTime modifyDate;
  private String attachPath;
  private String attachDescr;

  @TableField(exist = false)
  private Role role;


  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", userCode='" + userCode + '\'' +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", salt='" + salt + '\'' +
            ", gender=" + gender +
            ", birthday=" + birthday +
            ", phone='" + phone + '\'' +
            ", address='" + address + '\'' +
            ", userRole=" + userRole +
            ", createdBy=" + createdBy +
            ", creationDate=" + creationDate +
            ", modifyBy=" + modifyBy +
            ", modifyDate=" + modifyDate +
            ", attachPath='" + attachPath + '\'' +
            ", attachDescr='" + attachDescr + '\'' +
            ", role=" + role +
            '}';
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public User() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getUserCode() {
    return userCode;
  }

  public void setUserCode(String userCode) {
    this.userCode = userCode;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }


  public Integer getGender() {
    return gender;
  }

  public void setGender(Integer gender) {
    this.gender = gender;
  }


  public java.time.LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(java.time.LocalDate birthday) {
    this.birthday = birthday;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public Integer getUserRole() {
    return userRole;
  }

  public void setUserRole(Integer userRole) {
    this.userRole = userRole;
  }


  public Integer getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }


  public java.time.LocalDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(java.time.LocalDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public Integer getModifyBy() {
    return modifyBy;
  }

  public void setModifyBy(Integer modifyBy) {
    this.modifyBy = modifyBy;
  }


  public java.time.LocalDateTime getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(java.time.LocalDateTime modifyDate) {
    this.modifyDate = modifyDate;
  }


  public String getAttachPath() {
    return attachPath;
  }

  public void setAttachPath(String attachPath) {
    this.attachPath = attachPath;
  }


  public String getAttachDescr() {
    return attachDescr;
  }

  public void setAttachDescr(String attachDescr) {
    this.attachDescr = attachDescr;
  }

}
