import java.util.HashMap;


class Main{
   public static void main(String[] args){
      HashMap<String, String> capitalCities = new HashMap<String, String>();

      capitalCities.put("England", "London");
      capitalCities.put("Germany", "Berlin");
      capitalCities.put("Norway", "Oslo");
      capitalCities.put("USA", "Washington DC");

      capitalCities.get("England");	

      System.out.println(capitalCities);
}
}