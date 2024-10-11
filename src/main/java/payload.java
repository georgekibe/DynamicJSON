

public class payload {

    // add book input payload

    public static String addBookPayload(String isbn, String aisle) {
        return "{\n" +
                "\n" +
                "\"name\":\"Learn Appium Automation with Java\",\n" +
                "\"isbn\":\""+isbn+"\",\n" +
                "\"aisle\":\""+aisle+"\",\n" +
                "\"author\":\"John foe\"\n" +
                "}\n";
    }

    public static String getBookPayload() {
        String payload = "{\n" +
                " \n" +
                "Name : “bookname”   ( String)\n" +
                "Isbn :  “A2fdsf”   (String)\n" +
                "Aisle : 32 (Integer)\n" +
                " \n" +
                "}\n";
        return payload;
    }
}
