package chainOfResponsibilityPattern;

/**
 * 描述：
 *
 * @author chengqiang_zhu
 * @date 2022/10/12
 */
public class PasswordVerify extends Verify{
    @Override
    public void deploy(UserAccount userAccount) {
        if (userAccount.getPassword() != null){
            System.out.println("密码校验通过");
            // 获取下一个验证器
            if (verify != null) {
                verify.deploy(userAccount);
            }
        } else {
            System.out.println("密码校验未通过");
        }
    }
}
