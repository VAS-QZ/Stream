package pers.vay.designpattern.structure.adapter.before;

public class WeixinImpl implements Weixin {
    @Override
    public void sendWeixinMsg() {
        System.out.println("send by weixin");
    }

}
