package week14;

public class TESTs {

    public static void main(String[] args) {
        TestCase testCaseOne = new TestCase();
        //Browser browser = new Browser();
        OS os = new OS();
        os.setOS("Windows");
     //   testCaseOne.browser.setBrowserType("Chrome");
        testCaseOne.operatingSystem = os;

        System.out.println(testCaseOne);
    }
}
