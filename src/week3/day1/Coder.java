package week3.day1;

/**
 * Created by Ihor Samanchuk on 03.10.2015.
 */
public class Coder extends Emploee{
    private String language;

    public Coder(){
        super();
        language =  "Java";
    }

    private void testAccessToParent(){
        setAge(23);
        getName();

        super.setAge(23);
        super.getName();

        //super - ?????????? ? ????????? ????????

    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void writeCode() {
        System.out.println("coder writes code");
    }
}
