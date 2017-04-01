package org.apache.http.examples.client;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HTTP;

import com.util.CookieUtil;
import com.util.HttpClientUtil;

public class Getinvestigate {

    public static void main(String[] args) throws Exception {

        DefaultHttpClient httpclient = new DefaultHttpClient();
        HttpPost httpost = new HttpPost("https://exmail.qq.com/cgi-bin/getinvestigate?"
        		+ "sid=dixFhLZ02ijwfi11,7");


        
        List <NameValuePair> nvps = new ArrayList <NameValuePair>();
//        nvps.add(new BasicNameValuePair("IDToken1", "username"));
//        nvps.add(new BasicNameValuePair("IDToken2", "password"));
        //添加cookie
        String cookiesString="0.7877658353299057; eas_sid=U1q4I6u6E519L380i8Q7h0I0F1; tvfe_boss_uuid=ddc8d6d6abb63189; mobileUV=1_1592b4fd3a1_ae737; msuid=ixtzzg4o1mnkg2bphu1xzqtxrsrvcttpivtkhv7u; LW_uid=51a41836l7V2u7t8B9L4m6I1L7; pac_uid=1_744142727; LW_pid=7ad5521be7d86c788cbce230b61fe63b; o_cookie=744142727; pgv_pvid=5108965354; sd_userid=74481490575913421; sd_cookie_crttime=1490575913421; 0.21985929098981294; ptui_loginuin=744142727; ptcz=5b421991171fd6aabe2c61e92eac6255a9647649be2938a388f829748f7faead; verifysession=h018bde7b2befa68c36e69cd8dfa966c2469a7ae235c58f276dd934376c5f6c5af9d06b655ed3ce14d8da49d1323c8331a7; pt2gguin=o0744142727; uin=o0744142727; skey=@Xjths0aaJ; ptisp=ctc; pgv_pvi=754575360; pgv_si=s9051869184; dm_login_weixin_scan=; new_mail_num=1408381530&15183; _ga=GA1.3.94231809.1466756317; qm_authimgs_id=0; qm_verifyimagesession=h018d509fd30a941f0c816150da0b8ecfe26567419fcb115e3df66343bef288b3d06bf5ce9b02c6f570; Hm_lvt_bdfb0d7298c0c5a5a2475c291ac7aca2=1490582079; Hm_lpvt_bdfb0d7298c0c5a5a2475c291ac7aca2=1490600730; dm_login_weixin_rem=; logout_page=dm_loginpage; qm_flag=3; qqmail_alias=service@bankaiit.com; sid=1408381530&0278d819e18a3d2cbc2d7a522050a051,cNSYhxFweETE.; qm_sid=0278d819e18a3d2cbc2d7a522050a051,cNSYhxFweETE.; qm_username=1408381530; biz_username=1408381530; CCSHOW=0000; ssl_edition=sail.qq.com; username=1408381530&1408381530; qylevel=3; qm_sk=1408381530&3mjThPMS; qm_ssum=1408381530&e5b7227e3c33ee70cd4501f1c241d172; tinfo=EXPIRED";
        httpclient.setCookieStore(CookieUtil.createCookieStore(cookiesString));
        
        httpost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
        HttpResponse response = httpclient.execute(httpost);
        HttpEntity entity = response.getEntity();
        entity = response.getEntity();
        HttpClientUtil.printEntityContext(entity);
        System.out.println("status: " + response.getStatusLine());
        if (entity != null) {
            entity.consumeContent();
        }

        System.out.println("Post logon cookies:");
        List<Cookie> cookies = httpclient.getCookieStore().getCookies();
//        if (cookies.isEmpty()) {
//            System.out.println("None");
//        } else {
//            for (int i = 0; i < cookies.size(); i++) {
//                System.out.println("- " + cookies.get(i).toString());
//            }
//        }
    }
}
