package gun38.enum4;

public class Main {
    /*
        User class"i tanimlayin
            name
            statu
            role


        main 3 adet use tanimlayin
        if User admin ise .....
        else

     */


    public static void main(String[] args) {

        User user = new User("Ali", Statu.AKTIF, Role.ADMIN);
        if (user.role == Role.ADMIN && user.statu == Statu.AKTIF){
            // islem
        }

    }

    // subclass, innerclass
    // inner classlar statik methodlarda create edilecek ise innerclassda statik olmali
    public static class User{
        private String name;
        private Statu statu;
        private Role role;

        public User(String name, Statu statu, Role role) {
            this.name = name;
            this.statu = statu;
            this.role = role;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Statu getStatu() {
            return statu;
        }

        public void setStatu(Statu statu) {
            this.statu = statu;
        }

        public Role getRole() {
            return role;
        }

        public void setRole(Role role) {
            this.role = role;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", statu=" + statu +
                    ", role=" + role +
                    '}';
        }
    }

    enum Statu{
        AKTIF, SLEEP, INAKTIVE;
    }

    enum Role{
        ADMIN, USER, GUEST;
    }


}
