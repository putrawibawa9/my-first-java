package InnerClass;

public class Company {
        private String name;

        // getter and setter
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        public class Employee {
            private String name;

            // getter and setter
            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void showCompany() {
                System.out.println("Company: " + Company.this.getName());
            }
        }
}
