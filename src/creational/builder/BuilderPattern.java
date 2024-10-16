package creational.builder;

class User {
    String name;
    String address;
    String income;
    Integer age;

    private User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.address = userBuilder.address;
        this.income = userBuilder.income;
        this.age = userBuilder.age;
    }

    public static class UserBuilder {
        private String name;
        private String address;
        private String income;
        private Integer age;

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder income(String income) {
            this.income = income;
            return this;
        }

        public UserBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

    @Override
    public String toString() {
        return "%s %s".formatted(this.name, this.age);
    }

}


public class BuilderPattern {
    public static void main(String[] args) {
        User obj = new User.UserBuilder().name("hey").build();
        User obj2 = new User.UserBuilder().name("Hello").age(10).build();
        System.out.println(obj);
        System.out.println(obj2);
    }
}