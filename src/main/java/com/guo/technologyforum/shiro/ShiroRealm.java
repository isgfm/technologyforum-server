package com.guo.technologyforum.shiro;

import com.guo.technologyforum.constant.UserPermission;
import com.guo.technologyforum.dao.entity.Right;
import com.guo.technologyforum.dao.entity.User;
import com.guo.technologyforum.right.RightUtil;
import com.guo.technologyforum.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    UserService userService;


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String account =  (String) principalCollection.getPrimaryPrincipal();
        Long userid = userService.getUserByUserName(account)
                .orElseThrow(()->new UnknownAccountException())
                .getnId();
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        List<String> rights = RightUtil.getRightsByUserId(userid);
        simpleAuthorizationInfo.addStringPermissions(rights);
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        String account = token.getUsername();
        Optional<User> optionalUser = userService.getUserByUserName(account);
        if(optionalUser.isPresent()){
            User user = optionalUser.get();
            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                    user.getcUsername(),
                    user.getcPassword(),
                    ByteSource.Util.bytes(user.getcSalt()),
                    getName()
            );
            return authenticationInfo;

        }
        throw new UnknownAccountException();
    }
}
