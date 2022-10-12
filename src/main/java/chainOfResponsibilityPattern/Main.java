package chainOfResponsibilityPattern;

/**
 * 描述：责任链模式
 *
 * @author chengqiang_zhu
 * @date 2022/10/12
 */
public class Main {
    public static void main(String[] args) {
        UserNameVerify userNameVerify = new UserNameVerify();
        PasswordVerify passwordVerify = new PasswordVerify();
        PhoneVerify phoneVerify = new PhoneVerify();
        UserAccount userAccount = new UserAccount();
        userAccount.setUserName("username");
        userAccount.setPassword("123456");
        userAccount.setPhoneNumber("13888888888");
        // 创建职责链
        userNameVerify.setNextVerify(passwordVerify);
        passwordVerify.setNextVerify(phoneVerify);
        // 开始校验 , 执行职责链
        userNameVerify.deploy(userAccount);
    }
}
