package cn.fhjt.weixin.service.security;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import cn.fhjt.weixin.pojo.TbUser;
import cn.fhjt.weixin.service.TbUserService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;


public class UserDetailsServiceImpl implements UserDetailsService {

//	@Autowired
	private TbUserService tbUserService;
//
	public void setTbUserService(TbUserService tbUserService) {
		this.tbUserService = tbUserService;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		List<GrantedAuthority> grantAuths = new ArrayList();
		SimpleGrantedAuthority role_user = new SimpleGrantedAuthority("ROLE_USER");
//		SimpleGrantedAuthority role_user = new SimpleGrantedAuthority("ROLE_ADMIN");
		grantAuths.add(new SimpleGrantedAuthority("ROLE_findon"));
		grantAuths.add(role_user);

		// 去数据库进行查询:

		TbUser tbUser = tbUserService.findByName(username);
		if(tbUser != null){
			if(tbUser.getStatus().equals("0")){
				return new User(username,tbUser.getPassword(),grantAuths );
			}else{
				return null;
			}
		}
		return null;
		
	}


}
