package People;

public class PersonBuilder extends Person implements IPersinBuilder {

        protected String name;
        protected String surname;
        protected int age;
        protected String address;


        public PersonBuilder() {

        }


        @Override
        public PersonBuilder setName(String name) {
                this.name = name;
                return this;
        }

        @Override
        public PersonBuilder setSurname(String surname) {
                this.surname = surname;
                return this;
        }

        @Override
        public PersonBuilder setAge(int age) {
                this.age = age;
                return this;
        }

        public PersonBuilder setAddress(String address) {
                this.address = address;
                return this;
        }

        public Person build() throws IllegalStateException, IllegalArgumentException {

                Person person = new Person(name, surname, age, address);
                if (age < 0) {
                        throw new IllegalArgumentException("Возраст не может быть отрицательным");
                }
                if (name == null || surname == null) {
                        throw new IllegalStateException("Отсутствует имя или фамилия");
                }
                return person;

        }
}
