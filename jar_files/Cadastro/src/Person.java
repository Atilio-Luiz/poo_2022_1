public class Person implements Comparable<Person> {
    private String cpf;
    private String name;
    private Integer age;

    public Person(String cpf, String name, Integer age) {
        this.cpf = cpf;
        this.name = name;
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return String.format("CPF: %s, nome: %s, idade: %d", cpf, name, age);
    }

    @Override
    public int compareTo(Person o) {
        return cpf.compareTo(o.cpf);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;

        Person p = (Person) obj;
        return this.cpf.equals(p.cpf);
    }
    
    @Override
    public int hashCode() {
        return cpf.hashCode();
    }
}
