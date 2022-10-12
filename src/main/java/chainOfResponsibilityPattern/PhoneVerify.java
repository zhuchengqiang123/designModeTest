package chainOfResponsibilityPattern;

/**
 * 描述：
 *
 * @author chengqiang_zhu
 * @date 2022/10/12
 */
public class PhoneVerify extends Verify{
    @Override
    public void deploy(UserAccount userAccount) {
        if (userAccount.getPhoneNumber() != null){
            System.out.println("手机号校验通过");
            // 获取下一个验证器
            if (verify != null) {
                verify.deploy(userAccount);
            }
        } else {
            System.out.println("手机号校验未通过");
        }
    }
}
