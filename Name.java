public class Name {
    private String surname;
    private String name;
    private String patronymic;

    public Name(){
        this.surname = null;
        this.name = null;
        this.patronymic = null;
    }

    public Name(String surname, String name, String patronymic){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Name(Name name1){
        this.surname = name1.surname;
        this.name = name1.name;
        this.patronymic = name1.patronymic;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String toString() {
        String str = "";
        if (surname != null) {
            str = str + surname;
        }
        if (name != null) {
            if (str != "") {
                str = str + " " + name;
            }
            else {
                str = str + name;
            }
        }
        if (patronymic != null) {
            if (str != "") {
                str = str + " " + patronymic;
            } else {
                str = str + patronymic;
            }
        }
        return str;
    }
}