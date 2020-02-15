package ir.org.acm.session13.contract2;

public class WebProject {

    public static void main(String[] args) {

        Programmer[] myTeam = new Programmer[3];

        myTeam[0] = new PhpProgrammer();
        myTeam[1] = new HtmlProgrammer();
        myTeam[2] = new JavaScriptProgrammer();

        for (Programmer p : myTeam )
            p.code();

    }

}
