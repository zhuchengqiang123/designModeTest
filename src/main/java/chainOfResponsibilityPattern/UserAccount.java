package chainOfResponsibilityPattern;

/**
 * 用户账户信息
 * 包含 : 账号 , 密码 , 电话号码
 *
 * @author chengqiang_zhu
 * @date 2022/10/12
 */
public class UserAccount {
    private String userName;
    private String password;
    private String phoneNumber;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
