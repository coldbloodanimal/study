package com.util;

import java.util.List;

import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.cookie.BasicClientCookie;

public class CookieUtil {
	public static CookieStore createCookieStore(String cookies){
		cookies=cookies.replace(" ", "");
		CookieStore cookieStore=new BasicCookieStore();
		for(String p:cookies.split(";")){
			if(p.contains("=")){
				String[] kv=p.split("=");
				//System.out.println(kv[0]);
				if(kv.length>1){
					cookieStore.addCookie(new BasicClientCookie(kv[0],kv[1]));
				}		
			}
		}
		return cookieStore;
		
	} 
	public static void main(String[] args) {
		CookieStore cookieStore= CookieUtil.createCookieStore("0.31057870363647333; eas_sid=U1q4I6u6E519L380i8Q7h0I0F1; tvfe_boss_uuid=ddc8d6d6abb63189; mobileUV=1_1592b4fd3a1_ae737; msuid=ixtzzg4o1mnkg2bphu1xzqtxrsrvcttpivtkhv7u; LW_uid=51a41836l7V2u7t8B9L4m6I1L7; pac_uid=1_744142727; LW_pid=7ad5521be7d86c788cbce230b61fe63b; o_cookie=744142727; pgv_pvid=5108965354; sd_userid=74481490575913421; sd_cookie_crttime=1490575913421; 0.21985929098981294; ptui_loginuin=744142727; ptcz=5b421991171fd6aabe2c61e92eac6255a9647649be2938a388f829748f7faead; verifysession=h018bde7b2befa68c36e69cd8dfa966c2469a7ae235c58f276dd934376c5f6c5af9d06b655ed3ce14d8da49d1323c8331a7; pt2gguin=o0744142727; uin=o0744142727; skey=@Xjths0aaJ; ptisp=ctc; pgv_pvi=754575360; pgv_si=s9051869184; new_mail_num=1408381530&15160; qm_authimgs_id=0; qm_verifyimagesession=h0112534b2f0c0d6cd669c78627ff0e3ebc4b7d7a82cec4c1821bbe730ac76bf12f9fd0697ce5bf5529; _ga=GA1.3.94231809.1466756317; _gat=1; Hm_lvt_bdfb0d7298c0c5a5a2475c291ac7aca2=1490582079; Hm_lpvt_bdfb0d7298c0c5a5a2475c291ac7aca2=1490596005; dm_login_weixin_rem=; logout_page=dm_loginpage; qm_flag=3; qqmail_alias=service@bankaiit.com; sid=1408381530&4cffd760ca4ce5b062d027835c2e1bc7,cNSYhxEF-2VQ.; qm_sid=4cffd760ca4ce5b062d027835c2e1bc7,cNSYhxEF-2VQ.; qm_username=1408381530; biz_username=1408381530; CCSHOW=0000; ssl_edition=sail.qq.com; username=1408381530&1408381530; qylevel=3; qm_sk=1408381530&3mjThPMS; qm_ssum=1408381530&6a26afbf7ca6655ccfa1d11e72e85d5f; dm_login_weixin_scan=; tinfo=1490596020.0000");
		List<Cookie> cookies = cookieStore.getCookies();
        if (cookies.isEmpty()) {
            System.out.println("None");
        } else {
            for (int i = 0; i < cookies.size(); i++) {
                System.out.println("- " + cookies.get(i).toString());
            }
        }
	}
}
