package alterra.step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    int angka1,angka2;
    String operator;
    @When("I want count angka{int} and angka{int}")
    public void iWantCountAngkaAndAngka(int arg0, int arg1) {
        angka1 = arg0;
        angka2 = arg1;
    }

    @And("I using operator {string}")
    public void iUsingOperator(String arg0) {
        operator = arg0;
    }

    @Then("I receive {int} from this count")
    public void iReceiveFromThisCount(int arg0) {
        switch (operator){
            case "+" :
                if ((angka1 + angka2) == arg0){
                    System.out.println("Hasil : "+(angka1 +angka2)+"Sesuai");
                } else {
                    System.out.println ("tidak sesuai");
                }
                break;
            case "-" :
                if ((angka1 - angka2) == arg0){
                    System.out.println("Hasil : "+(angka1 - angka2)+"Sesuai");
                } else {
                    System.out.println ("tidak sesuai");
                }
                break;
            case "*" :
                if ((angka1 * angka2) == arg0){
                    System.out.println("Hasil : "+(angka1 * angka2)+"Sesuai");
                } else {
                    System.out.println ("tidak sesuai");
                }
                break;
            case "/" :
                if ((angka1 / angka2) == arg0){
                    System.out.println("Hasil : "+(angka1 / angka2)+"Sesuai");
                } else {
                    System.out.println ("tidak sesuai");
                }
                break;

            default :
                System.out.println("tidak sesuai");
                break;


        }


    }
}
