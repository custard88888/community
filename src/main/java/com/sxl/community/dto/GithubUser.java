package com.sxl.community.dto;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/3/15 12:06<br/>
 *
 * @author Administrator<br />
 * @since JDK 1.8
 */
public class GithubUser {
    private String loginName;
    private Long id;
    private String bio;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
