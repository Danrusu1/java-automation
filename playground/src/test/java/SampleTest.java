

/**
 * Description: file created for hello-world
 * Author: Dan Rusu (d.rusu@plan-net.com)
 * Creation date: 13/10/2020
 * Modified data:
 * (c) 2020 Plan.Net-Technology - all copy, distribution not allowed without Plan.Net permission
 */

public class SampleTest {

//    @Test
//    public void checkAge() {
//        User user = new User("Kusai", "Salha", 20);
//        Assert.assertEquals(20, user.getAge());
//    }

//    @Test
//    public void checkFullName() {
//        User user = new User("Dan", "Rusu", 34);
//        Assert.assertEquals("Dan Rusu", user.getFullName());
//    }

//    @Test
//    public void checkName() {
//        final User user = new User("AAA", "BBB", 3000);
//        Assert.assertEquals("AAA", user.getFirstname());
//    }


    private class User {

        private String firstName;
        private String lastName;
        private int age;

        public User(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public String getFirstname() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getFullName() {
            final String fullName = firstName + " " + lastName;
            return fullName;
        }

    }

}
