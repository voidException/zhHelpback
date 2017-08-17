package org.geilove.requestParam;

public class UseRedMoneyParam {


    private String useruuid;

    private Long redmoneyid;

    private String username;

    private String useridentity; // 来自于account id

    private String categorytype;

    public String getCategorytype() {
        return categorytype;
    }

    public void setCategorytype(String categorytype) {
        this.categorytype = categorytype;
    }



    public String getUseruuid() {
        return useruuid;
    }

    public void setUseruuid(String useruuid) {
        this.useruuid = useruuid;
    }

    public Long getRedmoneyid() {
        return redmoneyid;
    }

    public void setRedmoneyid(Long redmoneyid) {
        this.redmoneyid = redmoneyid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseridentity() {
        return useridentity;
    }

    public void setUseridentity(String accountuuid) {
        this.useridentity = accountuuid;
    }







}
