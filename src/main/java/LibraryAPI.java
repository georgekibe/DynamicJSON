import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class LibraryAPI {


    @Test(dataProvider = "BooksData")
    public void AddBook(String isbn, String aisle) {
//        RestAssured.baseURI = "http://216.10.245.166";
        RestAssured.baseURI = "https://rahulshettyacademy.com";

        String addBook = given().log().all().body(payload.addBookPayload(isbn, aisle)).when().post("Library/Addbook.php").then().extract().asString();
        JsonPath js = new JsonPath(addBook);
        String bookID = js.getString("ID");
        String msg = js.getString("Msg");
        System.out.println("ID: " + bookID + " \nMsg: " + msg);

    }

    @Test
    public void GetBook() {
        given().log().all().queryParam("AuthorName", "John foe").when().get("/Library/GetBook.php?AuthorName=John foer")
                .then().assertThat().statusCode(200);
    }


    @DataProvider(name = "BooksData")
    public Object[][] getBookData() {
        return new Object[][]{
                {"ddcdc", "6161"}, {"fgtg", "6665"}, {"degf", "2655"}, {"hnnk", "9562"}

        };
    }


}
