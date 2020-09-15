class profile {
    private String name;
    private String age;
    private phonenumber phone;
    private String email;

    public void Total(){
        System.out.println("姓名："+ name);
        System.out.println("年齡："+ age);
        System.out.println("Email:"+ email);

        System.out.println("公司電話："+ phone.getOfficephone());
        System.out.println("手機："+ phone.getPhone());
        System.out.println("家裡電話："+ phone.getHomephone());

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public phonenumber getPhone() {
        return phone;
    }
    public void setPhone(phonenumber phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}