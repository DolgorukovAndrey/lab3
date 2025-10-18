public class Person {
    private Name fullName;
    private int height;

    public Person() {
        this.fullName = new Name();
        this.height = 0;
    }

    public Person(String name, int height){
        this.fullName = new Name(null,name,null);
        setHeight(height);
    }

    public Person(String surname, String name, String patronymic, int height){
        this.fullName = new Name(surname,name,patronymic);
        setHeight(height);
    }

    public void setHeight(int height) {
        if (height > 0 && height < 300) {
            this.height = height;
        } else {
            System.out.println("Введён недопустимый рост (установлено значение 0)");
            this.height = 0;
        }
    }

    public void setName(String name){
        fullName.setName(name);
    }

    public void setSurname(String surname){
        fullName.setSurname(surname);
    }

    public void setPatronymic(String patronymic){
        fullName.setPatronymic(patronymic);
    }

    public void setFullName(String surname, String name, String patronymic){
        fullName.setName(name);
        fullName.setSurname(surname);
        fullName.setPatronymic(patronymic);
    }

    public Name getFullName(){
        return fullName;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        return fullName.toString() + ", рост: " + height;
    }
}
