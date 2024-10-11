

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

    public static String getBookPayload(String isbn, String aisle) {
        String payload = "{\n" +
                "      \"book_name\": \"Selenium automation using Java\",\n" +
                "      \"isbn\": \""+isbn+"\",\n" +
                "      \"aisle\": \""+aisle+"\"\n" +
                "   } \n";
        return payload;
    }

    public static String deleteBodyPayload( String id){
        return  "{\n" +
                " \n" +
                "\"ID\" : \""+id+"\"\n" +
                " \n" +
                "} \n";
    }
}
